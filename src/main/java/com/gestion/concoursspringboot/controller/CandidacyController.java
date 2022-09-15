package com.gestion.concoursspringboot.controller;



import com.gestion.concoursspringboot.Service.CandidacyService;
import com.gestion.concoursspringboot.model.Candidacy;

import com.gestion.concoursspringboot.model.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController


public class CandidacyController {
    @Autowired
    private CandidacyService candidacyService;


    // Request for save candidacy
    @PostMapping("/post_candidacy")
    private ResponseEntity<Candidacy> createCandidacy(@RequestBody Candidacy candidacy){
        Candidacy cndtc= candidacyService.create(candidacy);

        try {
            return ResponseEntity.created(new URI("/post_candidacy"+cndtc.getId_candidacy())).body(candidacy);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    // Update candidacy
    @RequestMapping(value = "/update_candidacy/{id_candidacy}", method = RequestMethod.PUT)
    public  void updateCandidacy(@RequestBody Candidacy candidacy, @PathVariable int id){
        candidacyService.update(candidacy);
    }
    // Read operation return list of candidacy
    @GetMapping("/candidacy")
    private ResponseEntity<List<Candidacy>> getAllCandidacy(){
        return ResponseEntity.ok(candidacyService.getAllCandidate());
    }

    //Read operation with id
    @GetMapping("/candidacy/{id}")
    public Optional<Candidacy> getCandidacyById(@PathVariable int id) {
        return candidacyService.findById(id);
    }

    //Delete candidacy
    @DeleteMapping("/delete_candidacy/{id_candidacy}")
    private ResponseEntity<Void> deleteCandidacy (@PathVariable int id_candidacy) {
        candidacyService.delete(id_candidacy);
        return ResponseEntity.ok().build();
    }



}



