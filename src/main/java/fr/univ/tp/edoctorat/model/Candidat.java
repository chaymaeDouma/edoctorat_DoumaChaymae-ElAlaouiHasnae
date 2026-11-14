package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="candidat_candidat")
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String cne;

    @Column(length = 30, nullable = false)
    private String cin;

    @Column(name = "nomCandidatAr",length = 255)
    private String nomCandidatAr;

    @Column(name = "prenomCandidatAr",length = 255)
    private String prenomCandidatAr;

    @Column(columnDefinition = "longtext",nullable = false)
    private String adresse ;

    @Column(name="adresseAr",columnDefinition = "longtext")
    private String adresseAr;

    @Column(length = 20)
    private String sexe;

    @Column(name = "villeDeNaissance",length = 255,nullable = false)
    private String villeDeNaissance;

    @Column(name = "villeDeNaissanceAr",length = 255)
    private String villeDeNaissanceAr;

    @Column(length = 255,nullable = false)
    private String ville;

    @Column(name = "dateDeNaissance",nullable = false)
    private LocalDate dateDeNaissance;

    @Column(name = "typeDeHandiCape",length = 30)
    private String typeDeHandiCape;

    @Column(length = 255)
    private String academie;

    @Column(name = "telCandidat",length = 30)
    private String telCandidat;

    @Column(name = "pathCv",length = 100)
    private String pathCv;

    @Column(name = "pathPhoto",length = 100)
    private String pathPhoto;

    @Column(name = "etatDossier",length = 11)
    private Integer etatDossier;

    @Column(name = "situation_familiale",length = 50)
    private String situation_familiale;

    @Column(nullable = false)
    private boolean fonctionaire;

    @ManyToOne
    @JoinColumn(name="pays_id")
    private Pays pays;
    
    @OneToOne
    @JoinColumn(name = "user_id")
    private Utilisateur utilisateur;

}
