package it.francesco.biblioteca.Biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Autore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cognome;

    @ManyToMany
    @JoinTable(
            name = "autore_libro",
            joinColumns = @JoinColumn(name = "autore_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id"))
    private Set<Libro> libri;

}
