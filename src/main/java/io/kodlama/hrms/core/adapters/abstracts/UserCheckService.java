package io.kodlama.hrms.core.adapters.abstracts;

public interface UserCheckService {
    boolean CheckIfRealPerson(Long identityNumber, String firstName, String lastName, Integer dateOfBirth);
}
