package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="candidat_postuler")
public class Postuler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="pathFile",length = 100)
    private String pathFile;

    @ManyToOne
    @JoinColumn(name="candidat_id")
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name="sujet_id")
    private Sujet sujet;

}
