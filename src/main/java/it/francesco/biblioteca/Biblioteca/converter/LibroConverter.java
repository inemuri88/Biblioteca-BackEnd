package it.francesco.biblioteca.Biblioteca.converter;

import it.francesco.biblioteca.Biblioteca.dto.LibroDTO;
import it.francesco.biblioteca.Biblioteca.entity.Libro;
import org.springframework.stereotype.Component;

@Component
public class LibroConverter extends AbstractConverter<LibroDTO, Libro>{
    @Override
    public Libro convertToEntity(LibroDTO libroDTO) {
        return null;
    }

    @Override
    public LibroDTO convertToDTO(Libro libro) {
        return null;
    }
}
