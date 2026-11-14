package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="professeur_sujet")
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255,nullable = false)
    private String titre;

    @Column(columnDefinition = "longtext")
    private String description;

    @Column(nullable = false)
    private Boolean publier;

    @ManyToOne
    @JoinColumn(name="coDirecteur_id")
    private Professeur coDirecteur;

    @ManyToOne
    @JoinColumn(name="formationDoctorale_id")
    private FormationDoctorale formationDoctorale;

    @ManyToOne
    @JoinColumn(name="professeur_id")
    private Professeur professeur;
}
