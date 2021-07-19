package io.kodlama.hrms.business.abstracts;

import io.kodlama.hrms.core.utilities.results.DataResult;
import io.kodlama.hrms.core.utilities.results.Result;
import io.kodlama.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {
    Result add(JobAdvertisement jobAdvertisement);
    DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getAllActive();
    DataResult<List<JobAdvertisement>> getAllByEmployerIdAndActive(int employerId);
    DataResult<List<JobAdvertisement>> getAllSortedAndActive();
    Result updateIsActiveFalse(int id);

}
