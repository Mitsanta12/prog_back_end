package com.gestion.concoursspringboot.repository;

import com.gestion.concoursspringboot.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Integer> {

}
