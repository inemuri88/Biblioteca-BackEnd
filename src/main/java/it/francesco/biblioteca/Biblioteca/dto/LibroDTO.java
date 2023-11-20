package it.francesco.biblioteca.Biblioteca.dto;

import it.francesco.biblioteca.Biblioteca.entity.Autore;
import it.francesco.biblioteca.Biblioteca.entity.Users;
import jakarta.persistence.Basic;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibroDTO {

    private Long id;


    private String titolo;


    private String casaEditrice;


    private String isbn;


    private String prestito;


    private Users utente;


    private Set<Autore> autore;

    private String genere;
}
