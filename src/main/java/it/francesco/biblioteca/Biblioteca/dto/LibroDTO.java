package it.francesco.biblioteca.Biblioteca.dto;

import jakarta.persistence.Basic;
import lombok.Data;

@Data
public class LibroDTO {

    private Long id;

    private String titolo;

    private String casaEditrice;

    private String isbn;


    private String prestito;
}
