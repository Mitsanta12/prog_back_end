package com.gestion.concoursspringboot.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "topic")
@ToString

public class Topic implements Serializable {
    @Id
    @Column (name = "id_topic")
    private int id_topic;

    @Column (name= "name_topic")
    private String name_topic;
}
