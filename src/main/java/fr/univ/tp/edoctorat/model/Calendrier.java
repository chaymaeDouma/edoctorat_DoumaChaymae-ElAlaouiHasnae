package fr.univ.tp.edoctorat.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="directeur_pole_calendrier")
public class Calendrier {
    @Id
    private Integer id;

    @Column(length = 500, nullable = false)
    private String action;

    @Column(name="dateDebut", nullable = false)
    private LocalDate dateDebut;

    @Column(name="dateFin", nullable = false)
    private LocalDate dateFin;

    @Column(length = 500, nullable = false)
    private String pour;


}
