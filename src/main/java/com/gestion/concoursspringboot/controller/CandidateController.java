package com.gestion.concoursspringboot.controller;

import com.gestion.concoursspringboot.Service.CandidateService;
import com.gestion.concoursspringboot.model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController


public class CandidateController {
  @Autowired
  private CandidateService candidateService;

  // Read operation return list of candidate
      @GetMapping("/candidate")
      private ResponseEntity <List<Candidate>> getAllCandidate(){
          return ResponseEntity.ok(candidateService.getAllCandidate());
      }

    //Read operation with id
    @GetMapping("/candidate/{id}")
    public Optional<Candidate> getCandidateById(@PathVariable int id) {
          return candidateService.findById(id);
    }

    @PostMapping("/PostCandidate")
        public Candidate createCandidate(@RequestBody Candidate candidate){
          return candidateService.create(candidate);
    }

    @DeleteMapping("/DeleteCandidate/{id_candidate}")
    private ResponseEntity<Void> deleteCandidate (@PathVariable int id_candidate) {
        candidateService.delete(id_candidate);
        return ResponseEntity.ok().build();
    }
/**
    @PutMapping("/candidate/{id}")
    public ResponseEntity<Candidate> updateCandidate(@PathVariable("id") int id, @RequestBody Candidate candidate) {
        Optional<Candidate> tutorialData = candidateService.findById(id);

        if (tutorialData.isPresent()) {
            Candidate _candidate = candidateData.get();
            _candidate.setName_candidate(candidate.getName_candidate());
            _candidate.setFirstname_candidate(candidate.getFirstname_candidate());
            _candidate.setBirth_date(candidate.getBirth_date());
            return new ResponseEntity<>(candidateService.save(_candidate), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
*/



}







