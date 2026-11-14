package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="candidat_diplome")
public class Diplome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255)
    private String intitule;

    @Column(length = 500)
    private String type;

    @Column(name="dateCommission")
    private LocalDate dateCommission;

    @Column(length=50)
    private String mention;

    @Column(length = 255)
    private String pays;

    @Column(length = 255)
    private String etablissement;

    @Column(length = 255)
    private String specialite;

    @Column(length = 255)
    private String ville;

    @Column(length = 255)
    private String province;

    @Column(name="moyen_generale")
    private Double moyen_generale;

    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private Candidat candidat;
}
