package it.francesco.biblioteca.Biblioteca.service;


import it.francesco.biblioteca.Biblioteca.converter.UsersConverter;
import it.francesco.biblioteca.Biblioteca.dto.UsersDTO;

import it.francesco.biblioteca.Biblioteca.entity.Users;
import it.francesco.biblioteca.Biblioteca.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository userRepository;

    @Autowired
    private UsersConverter converter;

    public void registrazioneUser(UsersDTO dto){

        userRepository.save(converter.convertToEntity(dto));

    }
}
