package com.gestion.concoursspringboot.controller;

import com.gestion.concoursspringboot.Service.AverageService;
import com.gestion.concoursspringboot.model.Average;
import com.gestion.concoursspringboot.model.Candidacy;
import com.gestion.concoursspringboot.model.Candidate;
import com.gestion.concoursspringboot.repository.AverageRepostory;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class AverageController {
    @Autowired
    private AverageService averageService;

    //Request for save average
    @PostMapping("/post_average")
    public Average createAverage(@RequestBody Average average){
        return averageService.create(average);
    }

    // Request for update average
    @RequestMapping(value = "/update_average/{id_average}", method = RequestMethod.PUT)
    public  void updateAverage(@RequestBody Average average, @PathVariable int id){
        averageService.update(average);
    }

    //Read operation return list of average
    @GetMapping("/average")
    private ResponseEntity<List<Average>> getAllAverage() {
        return ResponseEntity.ok(averageService.getAllAverage());
    }

    ////Read operation with id
    @GetMapping("/average/{id}")
    public Optional<Average> getAverageById(@PathVariable int id) {
        return averageService.findById(id);
    }

    //
    @DeleteMapping("/delete_average/{id_average}")
    private ResponseEntity<Void> deleteAverage (@PathVariable int id_average) {
        averageService.delete(id_average);
        return ResponseEntity.ok().build();
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
}
