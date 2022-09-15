package com.gestion.concoursspringboot.repository;

import com.gestion.concoursspringboot.model.Average;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AverageRepostory extends JpaRepository<Average, Integer> {
}
