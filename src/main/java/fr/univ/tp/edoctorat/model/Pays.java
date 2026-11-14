package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="candidat_pays")
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255,nullable = false)
    private String nom ;
}
