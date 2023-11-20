package it.francesco.biblioteca.Biblioteca.service;

import it.francesco.biblioteca.Biblioteca.converter.AutoreConverter;
import it.francesco.biblioteca.Biblioteca.dto.AutoreDTO;
import it.francesco.biblioteca.Biblioteca.entity.Autore;
import it.francesco.biblioteca.Biblioteca.repository.AutoreRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Transactional
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;


    @Autowired
    private AutoreConverter converter;


    public List<AutoreDTO> getAll(){
        return converter.convertToListDTO(autoreRepository.findAll());
    }

    public void registrazioneAutore(@RequestBody AutoreDTO autoreDTO){

        autoreRepository.save(converter.convertToEntity(autoreDTO));
    }

}
