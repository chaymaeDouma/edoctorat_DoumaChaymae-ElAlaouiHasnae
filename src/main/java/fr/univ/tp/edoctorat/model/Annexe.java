package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="candidat_annexe")
public class Annexe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="typeAnnexe",length=100)
    private String typeAnnexe;

    @Column(length=255)
    private String titre;

    @Column(name="pathFile",length=100)
    private String pathFile;

    @ManyToOne
    @JoinColumn(name="diplome_id")
    private Diplome diplome;

}
