package io.kodlama.hrms.api.controller;

import io.kodlama.hrms.business.abstracts.JobTitleService;
import io.kodlama.hrms.entities.concretes.JobTitle;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitle")
@AllArgsConstructor
public class JobTitleController {

    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping("/getall")
    public List<JobTitle> getAll(){
        return jobTitleService.getAll();
    }

}
