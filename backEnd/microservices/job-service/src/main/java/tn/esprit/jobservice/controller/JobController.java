package tn.esprit.jobservice.controller;

import tn.esprit.jobservice.entity.Job;
import tn.esprit.jobservice.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService service;

    public JobController(JobService service) {
        this.service = service;
    }

    @PostMapping
    public Job create(@RequestBody Job j) {
        return service.save(j);
    }

    @GetMapping
    public List<Job> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
    @PutMapping("/{id}")
    public Job updateJob(@PathVariable Long id, @RequestBody Job job) {
        job.setId(id);
        return service.save(job);
    }

}
