package it.francesco.biblioteca.Biblioteca.service;

import it.francesco.biblioteca.Biblioteca.converter.LibroConverter;
import it.francesco.biblioteca.Biblioteca.dto.AutoreDTO;
import it.francesco.biblioteca.Biblioteca.dto.LibroDTO;
import it.francesco.biblioteca.Biblioteca.repository.LibroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private LibroConverter libroConverter;

    public void inserimentoLibro(LibroDTO libroDTO){

        libroRepository.save(libroConverter.convertToEntity(libroDTO));
    }

    public List<LibroDTO> getAll(){
       return libroConverter.convertToListDTO(libroRepository.findAll());
    }

}
