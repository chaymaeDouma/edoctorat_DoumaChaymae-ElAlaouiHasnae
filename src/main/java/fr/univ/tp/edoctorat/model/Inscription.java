package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="professeur_inscription")
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="dateDiposeDossier")
    private LocalDate dateDiposeDossier;

    @Column(length = 255)
    private String remarque;

    @Column(nullable = false)
    private Boolean valider;

    @ManyToOne
    @JoinColumn(name="candidat_id")
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name="sujet_id")
    private Sujet sujet;
}
