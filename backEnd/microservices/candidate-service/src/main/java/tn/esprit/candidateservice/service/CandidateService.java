package tn.esprit.candidateservice.service;

import org.springframework.stereotype.Service;
import tn.esprit.candidateservice.entity.Candidate;
import tn.esprit.candidateservice.repository.CandidateRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Candidate saveCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public Optional<Candidate> getCandidateById(Long id) {
        return candidateRepository.findById(id);
    }

    public void deleteCandidate(Long id) {
        candidateRepository.deleteById(id);
    }
}
