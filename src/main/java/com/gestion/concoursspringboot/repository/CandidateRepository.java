package com.gestion.concoursspringboot.repository;

import com.gestion.concoursspringboot.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CandidateRepository extends JpaRepository<Candidate, Integer> {

}

