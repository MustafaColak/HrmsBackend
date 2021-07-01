package io.kodlama.hrms.api.controller;

import io.kodlama.hrms.business.abstracts.CandidateService;
import io.kodlama.hrms.core.utilities.results.DataResult;
import io.kodlama.hrms.core.utilities.results.Result;
import io.kodlama.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/add")
    public Result add(@Valid @RequestBody Candidate candidate){
        return candidateService.add(candidate);
    }

    @GetMapping("/getall")
    public DataResult<List<Candidate>> getAll(){
        return candidateService.getAll();
    }
}
