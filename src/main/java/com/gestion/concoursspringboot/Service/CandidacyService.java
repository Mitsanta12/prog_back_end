package com.gestion.concoursspringboot.Service;


import com.gestion.concoursspringboot.model.Candidacy;
import com.gestion.concoursspringboot.model.Candidate;
import com.gestion.concoursspringboot.repository.CandidacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.util.LambdaUtil.getAll;

@Service
public class CandidacyService {

    @Autowired
    private CandidacyRepository candidacyRepository;



    public Candidacy create(Candidacy candidacy){
        return candidacyRepository.save(candidacy);
    }

    public Candidacy update(Candidacy candidacy){return candidacyRepository.save(candidacy);}

    public List<Candidacy> getAllCandidate(){
        return candidacyRepository.findAll();
    }


    public void delete(int id_candidacy){
        Candidacy candidacy= candidacyRepository.getById(id_candidacy);
        candidacyRepository.delete(candidacy);
    }

    public Optional<Candidacy> findById(int id){
        return candidacyRepository.findById(id);
    }
}


