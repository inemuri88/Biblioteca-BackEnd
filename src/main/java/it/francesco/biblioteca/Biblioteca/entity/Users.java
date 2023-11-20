package it.francesco.biblioteca.Biblioteca.entity;

import jakarta.persistence.*;
import lombok.*;


import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@Entity
@Data
@Table(name = "USERS")
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    @Basic(optional = false)
    private String username;

    @NonNull
    @Basic(optional = false)
    private String password;

    @ManyToMany
    @JoinTable(
            name = "utente_libro",
            joinColumns = @JoinColumn(name = "utente_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id"))
    @Basic(optional = true)
    private Set<Libro> libri;



}
