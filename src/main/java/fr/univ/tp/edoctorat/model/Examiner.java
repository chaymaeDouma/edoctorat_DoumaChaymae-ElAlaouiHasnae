package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="professeur_examiner")
public class Examiner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String decision;

    @Column(name="noteDossier",nullable = false)
    private float noteDossier;

    @Column(name="noteEntretien",nullable = false)
    private Integer noteEntretien;

    @Column(nullable = false)
    private Boolean publier;

    @ManyToOne
    @JoinColumn(name="commission_id")
    private Commission commision;

    @ManyToOne
    @JoinColumn(name="sujet_id")
    private Sujet sujet;

    @ManyToOne
    @JoinColumn(name="candidat_id")
    private Candidat candidat;

    @Column(nullable = false)
    private Boolean valider;
}
