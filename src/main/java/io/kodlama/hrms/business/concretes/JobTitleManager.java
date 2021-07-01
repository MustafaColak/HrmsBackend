package io.kodlama.hrms.business.concretes;

import io.kodlama.hrms.business.abstracts.JobTitleService;
import io.kodlama.hrms.core.utilities.results.*;
import io.kodlama.hrms.dataAccess.abstracts.JobTitleDao;
import io.kodlama.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    @Autowired
    private JobTitleDao jobTitleDao;

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<>(jobTitleDao.findAll()) ;
    }

    @Override
    public Result add(JobTitle jobTitle) {
        if(jobTitleDao.existsByNameIgnoreCase(jobTitle.getName())){
            return new ErrorResult("Pozisyon daha önceden sisteme kaydedilmiş");
        }
        jobTitleDao.save(jobTitle);
        return new SuccessResult("İş pozisyonu eklendi");
    }
}
