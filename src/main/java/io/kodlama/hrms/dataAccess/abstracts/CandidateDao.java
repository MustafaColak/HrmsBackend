package io.kodlama.hrms.dataAccess.abstracts;

import io.kodlama.hrms.entities.concretes.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
}
