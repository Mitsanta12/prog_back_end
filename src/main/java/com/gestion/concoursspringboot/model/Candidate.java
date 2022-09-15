package com.gestion.concoursspringboot.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "candidate")
public class Candidate implements Serializable {
    @Id
    @Column(name = "id_candidate", nullable = false)
    private int id_candidate;

    @Column(name = "name_candidate")
    private String name_candidate;

    @Column(name = "firstname_candidate")
    private String firstname_candidate;

    @Column(name="birth_date")
    private LocalDate birth_date;

    @Column(name="mail")
    private String mail;

    @Column(name = "contact")
    private String contact;

    @ManyToOne  @JoinColumn( name="id_candidacy" )
    private Candidacy candidacy;

}
