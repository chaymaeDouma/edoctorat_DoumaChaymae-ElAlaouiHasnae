package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

@Entity
@Table(name="auth_permission")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 255,nullable = false)
    private String name;

    @Column(length = 100,nullable = false)
    private String codename;

    @ManyToOne
    @JoinColumn(name="content_type_id")
    private ContentType contentType;
}
