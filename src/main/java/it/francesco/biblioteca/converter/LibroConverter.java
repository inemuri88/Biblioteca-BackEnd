package it.francesco.biblioteca.converter;

import it.francesco.biblioteca.dto.LibroDTO;
import it.francesco.biblioteca.entity.Libro;
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
