package tn.esprit.jobservice.repository;

import tn.esprit.jobservice.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
