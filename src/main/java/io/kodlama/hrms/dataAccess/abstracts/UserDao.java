package io.kodlama.hrms.dataAccess.abstracts;

import io.kodlama.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

    boolean existsByEmail(String email);
}
