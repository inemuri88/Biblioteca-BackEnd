package it.francesco.biblioteca.Biblioteca.dto;

import it.francesco.biblioteca.Biblioteca.entity.Libro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AutoreDTO {

    private Long id;

    private String nome;

    private String cognome;

    private Set<Libro> libri;
}
