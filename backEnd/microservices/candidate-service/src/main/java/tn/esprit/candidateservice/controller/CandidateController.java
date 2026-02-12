package tn.esprit.candidateservice.controller;

import org.springframework.web.bind.annotation.*;
import tn.esprit.candidateservice.entity.Candidate;
import tn.esprit.candidateservice.service.CandidateService;

import java.util.List;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping
    public Candidate addCandidate(@RequestBody Candidate c){
        return candidateService.saveCandidate(c);
    }

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @GetMapping("/{id}")
    public Candidate getCandidateById(@PathVariable Long id) {
        return candidateService.getCandidateById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidate(@PathVariable Long id) {
        candidateService.deleteCandidate(id);
    }

    @PutMapping("/{id}")
    public Candidate updateCandidate(@PathVariable Long id, @RequestBody Candidate c) {
        c.setId(id);
        return candidateService.saveCandidate(c);
    }


}
