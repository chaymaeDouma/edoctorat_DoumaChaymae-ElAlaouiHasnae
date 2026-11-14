package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="professeur_formationdoctorale")
public class FormationDoctorale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="pathImage",length = 100)
    private String pathImage;

    @Column(length = 255)
    private String initiale;

    @Column(length = 255)
    private String titre;
     @Column(name="axeDeRecherche",columnDefinition = "longtext")
    private String axeDeRecherche;

     @Column(name="dateAccreditation")
    private LocalDate dateAccreditation;

     @ManyToOne
    @JoinColumn(name="ced_id")
    private Ced ced;
     @ManyToOne
    @JoinColumn(name="etablissement_id")
    private Etablissement etablissement;


}
