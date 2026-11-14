package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name="professeur_commission")
public class Commission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="dateCommission")
    private LocalDate dateCommission;

    @Column(length = 255, nullable = false)
    private String lieu;

    @Column(length = 6,nullable = false)
    private LocalTime heure;

    @ManyToOne
    @JoinColumn(name="labo_id")
    private Laboratoire laboratoire;

    @ManyToMany
    @JoinTable(name = "professeur_commission_professeurs",
            joinColumns = @JoinColumn(name = "commission_id"),
            inverseJoinColumns = @JoinColumn(name = "professeur_id"))
    private Set<Professeur> professeurs = new HashSet<>();
}
