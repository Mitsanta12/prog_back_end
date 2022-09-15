package com.gestion.concoursspringboot.controller;

import com.gestion.concoursspringboot.Service.AverageService;
import com.gestion.concoursspringboot.Service.TopicService;
import com.gestion.concoursspringboot.model.Average;
import com.gestion.concoursspringboot.model.Candidate;
import com.gestion.concoursspringboot.model.Topic;
import com.gestion.concoursspringboot.repository.TopicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topic")
    private ResponseEntity<List<Topic>> getAllTopic() {
        return ResponseEntity.ok(topicService.getAllTopic());
    }

    //Read operation with id
    @GetMapping("/topic/{id}")
    public Optional<Topic> getTopicById(@PathVariable int id) {
        return topicService.findById(id);
    }

    @PostMapping("/post_topic")
    public Topic createTopic(@RequestBody Topic topic){
        return topicService.create(topic);
    }

    @DeleteMapping("/delete_topic/{id_topic}")
    private ResponseEntity<Void> deleteTopic (@PathVariable int id_topic) {
        topicService.delete(id_topic);
        return ResponseEntity.ok().build();
    }
}
    /**
     * Pour l’envoi de données. Cela sera utilisé par exemple pour créer un nouvel élément.(creation)
     @PostMapping("/candidate")

     Pour la mise à jour partielle de l’élément envoyé
     @PatchMapping

     Pour le remplacement complet de l’élément envoyé.
     @PutMapping

     Pour la suppression de l’élément envoyé.
     @DeleteMapping

     */

