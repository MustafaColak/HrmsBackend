package io.kodlama.hrms.business.abstracts;

import io.kodlama.hrms.core.utilities.results.DataResult;
import io.kodlama.hrms.core.utilities.results.Result;
import io.kodlama.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    Result add(Employer employer);
    DataResult<List<Employer>> getAll();
}
