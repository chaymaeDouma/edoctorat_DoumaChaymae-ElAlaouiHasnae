package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="auth_group")
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 150,nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name="auth_group_permissions",
        joinColumns = @JoinColumn(name="group_id"),
        inverseJoinColumns =  @JoinColumn(name="permission_id"))
    private Set<Permission>  permissions = new HashSet<>();

}
