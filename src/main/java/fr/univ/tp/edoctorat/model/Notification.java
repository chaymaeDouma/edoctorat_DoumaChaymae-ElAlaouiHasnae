package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="candidat_notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 255,nullable = false)
    private String type ;

    @ManyToOne
    @JoinColumn(name="candidat_id")
    private Candidat candidat;

    @ManyToOne
    @JoinColumn(name="commission_id")
    private Commission commission;

    @ManyToOne
    @JoinColumn(name="sujet_id")
    private Sujet sujet;
}
