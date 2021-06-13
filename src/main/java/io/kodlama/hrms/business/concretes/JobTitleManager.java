package io.kodlama.hrms.business.concretes;

import io.kodlama.hrms.business.abstracts.JobTitleService;
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
    public List<JobTitle> getAll() {
        return jobTitleDao.findAll();
    }
}
