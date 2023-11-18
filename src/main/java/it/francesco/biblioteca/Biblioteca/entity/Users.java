package it.francesco.biblioteca.Biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "USERS")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    private String username;

    @Basic(optional = false)
    private String password;

    @ManyToMany
    @JoinTable(
            name = "utente_libro",
            joinColumns = @JoinColumn(name = "utente_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id"))
    private Set<Libro> libri;
}
