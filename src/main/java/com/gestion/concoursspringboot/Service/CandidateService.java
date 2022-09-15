package com.gestion.concoursspringboot.Service;

import com.gestion.concoursspringboot.model.Candidate;
import com.gestion.concoursspringboot.repository.CandidateRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class CandidateService {


    private CandidateRepository candidateRepository;



    public Candidate create(Candidate candidate){
       return candidateRepository.save(candidate);
    }

    public Candidate update(Candidate candidate){return candidateRepository.save(candidate);}
    public List<Candidate> getAllCandidate(){
        return candidateRepository.findAll();
    }

    public void delete(int id_candidate){
        Candidate candidate= candidateRepository.getById(id_candidate);
        candidateRepository.delete(candidate);
    }

    public Optional<Candidate> findById(int id){
        return candidateRepository.findById(id);
    }
}
