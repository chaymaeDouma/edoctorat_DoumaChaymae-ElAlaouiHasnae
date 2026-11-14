package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="professeur_etablissement")
public class Etablissement {
    @Id
    private String idEtablissement;

    @Column(name="nomEtablissement", length = 255,nullable = false)
    private String nomEtablissement;
}
