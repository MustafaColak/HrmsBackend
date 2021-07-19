package io.kodlama.hrms.dataAccess.abstracts;

import io.kodlama.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {
    List<JobAdvertisement> findByIsActiveTrue();
    List<JobAdvertisement> findByEmployerIdAndIsActiveTrue(int emploerId);

}
