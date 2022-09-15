package com.gestion.concoursspringboot.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "average")
@ToString
public class Average  implements Serializable {
    @Id
    @Column(name = "id_average", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_average;

    @Column(name="points")
    private float points;

    @ManyToOne  @JoinColumn( name="id_candidate" )
    private Candidate candidate;
}
