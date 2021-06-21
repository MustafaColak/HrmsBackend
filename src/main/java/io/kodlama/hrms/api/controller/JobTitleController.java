package io.kodlama.hrms.api.controller;

import io.kodlama.hrms.business.abstracts.JobTitleService;
import io.kodlama.hrms.core.utilities.results.DataResult;
import io.kodlama.hrms.core.utilities.results.Result;
import io.kodlama.hrms.core.utilities.results.SuccessDataResult;
import io.kodlama.hrms.entities.concretes.JobTitle;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitle")
@AllArgsConstructor
public class JobTitleController {

    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping("/getall")
    public DataResult<List<JobTitle>> getAll(){
        return jobTitleService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobTitle jobTitle){
        return jobTitleService.add(jobTitle);
    }
}
