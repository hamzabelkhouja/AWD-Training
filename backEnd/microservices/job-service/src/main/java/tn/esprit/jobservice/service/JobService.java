package tn.esprit.jobservice.service;

import tn.esprit.jobservice.entity.Job;
import tn.esprit.jobservice.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository repo;

    public JobService(JobRepository repo) {
        this.repo = repo;
    }

    public Job save(Job j) {
        return repo.save(j);
    }

    public List<Job> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
