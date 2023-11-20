package it.francesco.biblioteca.Biblioteca.dto;

import it.francesco.biblioteca.Biblioteca.entity.Libro;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
public class UsersDTO {

    private Long id;

    private String username;

    private String password;

    private Set<Libro> libri;
}
