package fr.univ.tp.edoctorat.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="auth_user")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 128,nullable = false)
    private String password ;

    @Column(name="last_login",length = 6)
    private LocalDateTime lastLogin;

    @Column(name = "is_superuser",nullable = false)
    private boolean isSuperuser;

    @Column(length = 150,nullable = false)
    private String username;

    @Column(name="first_name",length = 150,nullable = false)
    private String firstName;
    @Column(name="last_name",length = 150,nullable = false)
    private String lastName;
    @Column(length = 254,nullable = false)
    private String email;
    @Column(name="is_staff",nullable = false)
    private Boolean isStaff;
    @Column(name="is_active",nullable = false)
    private Boolean isActive;
    @Column(name="date_joined",length = 6,nullable = false)
    private LocalDateTime date_joined;


    @ManyToMany
    @JoinTable(name="auth_user_groups",
        joinColumns = @JoinColumn( name="user_id"),
        inverseJoinColumns= @JoinColumn(name="group_id"))
    private Set<Groupe> Groups =  new HashSet<>();

    @ManyToMany
    @JoinTable(name="auth_user_user_permissions",
        joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns = @JoinColumn(name="permission_id"))
    private Set<Permission> Permissions= new HashSet<>();


}

