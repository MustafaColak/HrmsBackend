package io.kodlama.hrms.business.concretes;

import io.kodlama.hrms.business.abstracts.JobAdvertisementService;
import io.kodlama.hrms.core.utilities.results.*;
import io.kodlama.hrms.dataAccess.abstracts.JobAdvertisementDao;
import io.kodlama.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    @Autowired
    private JobAdvertisementDao jobAdvertisementDao;

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
        jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İlan eklendi");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll());
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllActive() {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findByIsActiveTrue());
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllByEmployerIdAndActive(int employerId) {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findByEmployerIdAndIsActiveTrue(employerId));
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAllSortedAndActive() {
        Sort sort = Sort.by(Sort.Direction.ASC,"creationDate");
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.findAll(sort));
    }

    @Override
    public Result updateIsActiveFalse(int id) {
        JobAdvertisement jobAdvertisement = jobAdvertisementDao.findById(id).orElse(null);

        if(jobAdvertisement == null){
            return new ErrorResult("İş ilanı bulunamadı");
        }

        jobAdvertisement.setIsActive(false);
        jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("iş ilanı kapatıldı");
    }

}
