package io.kodlama.hrms.business.concretes;

import io.kodlama.hrms.business.abstracts.EmployerService;
import io.kodlama.hrms.core.utilities.results.DataResult;
import io.kodlama.hrms.core.utilities.results.Result;
import io.kodlama.hrms.core.utilities.results.SuccessDataResult;
import io.kodlama.hrms.core.utilities.results.SuccessResult;
import io.kodlama.hrms.dataAccess.abstracts.EmployerDao;
import io.kodlama.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    @Autowired
    private EmployerDao employerDao;

    @Override
    public Result add(Employer employer) {
        employerDao.save(employer);
        return new SuccessResult("İş veren eklendi");
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<>(employerDao.findAll());
    }
}
