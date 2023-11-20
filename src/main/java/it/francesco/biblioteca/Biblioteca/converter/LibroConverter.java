package it.francesco.biblioteca.Biblioteca.converter;

import it.francesco.biblioteca.Biblioteca.dto.AutoreDTO;
import it.francesco.biblioteca.Biblioteca.dto.LibroDTO;
import it.francesco.biblioteca.Biblioteca.entity.Autore;
import it.francesco.biblioteca.Biblioteca.entity.Libro;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LibroConverter extends AbstractConverter<LibroDTO, Libro>{
    @Override
    public Libro convertToEntity(LibroDTO libroDTO) {
        return new Libro(libroDTO.getId(), libroDTO.getTitolo(), libroDTO.getCasaEditrice(), libroDTO.getIsbn(), libroDTO.getPrestito(), libroDTO.getUtente(), libroDTO.getAutore(), libroDTO.getGenere());
    }

    @Override
    public LibroDTO convertToDTO(Libro libro) {

        return new LibroDTO(libro.getId(), libro.getTitolo(), libro.getCasaEditrice(), libro.getIsbn(), libro.getPrestito(), libro.getUtente(), libro.getAutore(), libro.getGenere());
    }

    public List<LibroDTO> convertToListDTO(List<Libro> libriList) {
        return libriList.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}
