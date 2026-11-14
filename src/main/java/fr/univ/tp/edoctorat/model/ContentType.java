package fr.univ.tp.edoctorat.model;


import jakarta.persistence.*;

@Entity
@Table(name = "django_content_type")
public class ContentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
}