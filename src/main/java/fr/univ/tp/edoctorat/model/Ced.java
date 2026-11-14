package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="professeur_ced")
public class Ced {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "longtext")
    private String description;

    @Column(name="pathImage",length = 100)
    private String pathImage;

    @Column(length = 255)
    private String initiale;

    @Column(length = 255)
    private String titre;

    @ManyToOne
    @JoinColumn(name = "directeur_id")
    private Professeur directeur;

}
