package it.francesco.biblioteca.Biblioteca.service;

import it.francesco.biblioteca.Biblioteca.converter.AutoreConverter;
import it.francesco.biblioteca.Biblioteca.dto.AutoreDTO;
import it.francesco.biblioteca.Biblioteca.entity.Autore;
import it.francesco.biblioteca.Biblioteca.repository.AutoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoreService {

    @Autowired
    private AutoreRepository autoreRepository;


    @Autowired
    private AutoreConverter converter;


}
