package io.kodlama.hrms.business.abstracts;

import io.kodlama.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    List<JobTitle> getAll();
}
