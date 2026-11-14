package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="professeur_laboratoire")
public class Laboratoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nomLaboratoire",length = 255,nullable = false)
    private String nomLaboratoire ;

    @Column(columnDefinition = "longtext")
    private String description;

    @Column(name="pathImage",length = 100)
    private String pathImage;

    @Column(length = 255)
    private String initial;

    @ManyToOne
    @JoinColumn(name="ced_id")
    private Ced ced;

    @ManyToOne
    @JoinColumn(name="directeur_id")
    private Professeur directeur;

    @ManyToOne
    @JoinColumn(name="etablissement_id")
    private Etablissement etablissement;
}
