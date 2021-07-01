package io.kodlama.hrms.dataAccess.abstracts;

import io.kodlama.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
    boolean existsByNameIgnoreCase(String name);
}
