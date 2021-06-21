package io.kodlama.hrms.business.concretes;

import io.kodlama.hrms.business.abstracts.CandidateService;
import io.kodlama.hrms.core.adapters.abstracts.UserCheckService;
import io.kodlama.hrms.core.utilities.results.*;
import io.kodlama.hrms.dataAccess.abstracts.CandidateDao;
import io.kodlama.hrms.entities.concretes.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateManager implements CandidateService {

    @Autowired
    private CandidateDao candidateDao;
    @Autowired
    private UserCheckService userCheckService;

    @Override
    public Result add(Candidate candidate) {
        if( !userCheckService.CheckIfRealPerson(Long.parseLong(candidate.getIdentityNumber()),candidate.getFirstName(),
                candidate.getLastName(),Integer.valueOf(candidate.getYearOfBirth()))){
            return new ErrorResult("Not a valid user");
        }
        candidateDao.save(candidate);
        return new SuccessResult("Aday eklendi.");
    }

    @Override
    public DataResult<List<Candidate>> getAll() {
        return new SuccessDataResult<List<Candidate>>(candidateDao.findAll());
    }
}
