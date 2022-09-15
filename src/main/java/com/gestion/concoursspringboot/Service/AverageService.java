package com.gestion.concoursspringboot.Service;


import com.gestion.concoursspringboot.model.Average;
import com.gestion.concoursspringboot.model.Candidacy;
import com.gestion.concoursspringboot.model.Candidate;
import com.gestion.concoursspringboot.model.Topic;
import com.gestion.concoursspringboot.repository.AverageRepostory;
import com.gestion.concoursspringboot.repository.CandidacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.apache.logging.log4j.util.LambdaUtil.getAll;

@Service
public class AverageService {

    @Autowired
    private AverageRepostory averageRepostory;



    public Average create(Average average){
        return averageRepostory.save(average);
    }

    public Average update(Average average){return averageRepostory.save(average);}
    public List<Average> getAllAverage(){
        return averageRepostory.findAll();
    }


    public void delete(int id_average){
        Average average= averageRepostory.getById(id_average);
        averageRepostory.delete(average);
    }

    public Optional<Average> findById(int id){
        return averageRepostory.findById(id);
    }
}





