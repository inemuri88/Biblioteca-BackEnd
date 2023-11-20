package it.francesco.biblioteca.Biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "LIBRO")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    private String titolo;

    @Basic(optional = false)
    private String casaEditrice;

    @Basic(optional = true)
    private String isbn;

    @Basic(optional = true)
    private String prestito;

    @ManyToMany(mappedBy = "libri")
    private Set<Users> utenti;

    @ManyToMany(mappedBy = "libri")
    private Set<Autore> autore;

    private String genere;

}
