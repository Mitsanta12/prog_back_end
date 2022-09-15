package com.gestion.concoursspringboot.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Candidacy")
@ToString
public class Candidacy implements Serializable {
    @Id
    @Column(name = "id_candidacy", nullable = false)
    private int id_candidacy;

    @Column(name="serie")
    private String serie;
}
