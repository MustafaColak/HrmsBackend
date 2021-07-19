package io.kodlama.hrms.api.controller;

import io.kodlama.hrms.business.abstracts.JobAdvertisementService;
import io.kodlama.hrms.core.utilities.results.DataResult;
import io.kodlama.hrms.core.utilities.results.Result;
import io.kodlama.hrms.core.utilities.results.SuccessDataResult;
import io.kodlama.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController {

    @Autowired
    private JobAdvertisementService jobAdvertisementService;

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement){
        return jobAdvertisementService.add(jobAdvertisement);
    }

    @GetMapping("/getall")
    public DataResult<List<JobAdvertisement>> getAll(){
        return jobAdvertisementService.getAll();
    }

    @GetMapping("/getallactive")
    public DataResult<List<JobAdvertisement>> getAllActive(){
        return jobAdvertisementService.getAllActive();
    }

    @GetMapping("/getbyemployeridandactive")
    public DataResult<List<JobAdvertisement>> getByEmployerIdAndActive(@RequestParam int employerId){
        return jobAdvertisementService.getAllByEmployerIdAndActive(employerId);
    }

    @GetMapping("/getallsorted")
    public DataResult<List<JobAdvertisement>> getAllSorted(){
        return jobAdvertisementService.getAllSortedAndActive();
    }

    @PostMapping("/updateisactive")
    public Result updateIsActiveFalse(@RequestParam int id){
        return jobAdvertisementService.updateIsActiveFalse(id);
    }

}
