package tn.esprit.candidateservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.candidateservice.entity.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
