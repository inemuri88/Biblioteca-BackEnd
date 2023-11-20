package it.francesco.biblioteca.Biblioteca.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@Table(name = "LIBRO")
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToOne
    @JoinColumn(name = "utente_id")
    private Users utente;

    @ManyToMany(mappedBy = "libri")
    private Set<Autore> autore;

    private String genere;

}
