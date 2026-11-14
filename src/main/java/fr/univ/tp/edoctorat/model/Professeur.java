package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "professeur_professeur")
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30)
    private String cin;

    @Column(name="telProfesseur",length = 30)
    private String telProfesseur;

    @Column(name="pathPhoto",length = 200)
    private String pathPhoto;

    @Column(length = 10)
    private String grade;

    @Column(name="numSom",length = 50)
    private String numSom;

    @Column(name="nombreEncadrer",length = 11)
    private Integer nombreEncadrer;

    @Column(name="nombreProposer",length = 11)
    private Integer nombreProposer;

    @ManyToOne
    @JoinColumn(name="etablissement_id")
    private Etablissement etablissement;

    @ManyToOne
    @JoinColumn(name="labo_id")
    private Laboratoire laboratoire;

    @OneToOne
    @JoinColumn(name="user_id")
    private Utilisateur utilisateur;
}
