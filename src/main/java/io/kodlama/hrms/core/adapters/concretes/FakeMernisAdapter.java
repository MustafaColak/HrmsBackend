package io.kodlama.hrms.core.adapters.concretes;

import io.kodlama.hrms.core.adapters.abstracts.UserCheckService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class FakeMernisAdapter implements UserCheckService {
    @Override
    public boolean CheckIfRealPerson(Long identityNumber, String firstName, String lastName, Integer dateOfBirth) {
        return true;
    }
}
