package com.gestion.concoursspringboot.Service;

import com.gestion.concoursspringboot.model.Candidacy;
import com.gestion.concoursspringboot.model.Candidate;
import com.gestion.concoursspringboot.model.Topic;;
import com.gestion.concoursspringboot.repository.TopicRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@AllArgsConstructor
@Service
public class TopicService {


    private TopicRepository topicRepository;



    public Topic create(Topic topic){
        return topicRepository.save(topic);
    }

    public Topic update(Topic topic){return topicRepository.save(topic);}

    public List<Topic> getAllTopic(){
        return topicRepository.findAll();
    }

    public void delete(int id_topic){
        Topic topic= topicRepository.getById(id_topic);
        topicRepository.delete(topic);
    }

    public Optional<Topic> findById(int id){
        return topicRepository.findById(id);
    }
}



