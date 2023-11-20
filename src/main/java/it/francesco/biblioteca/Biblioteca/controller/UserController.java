package it.francesco.biblioteca.Biblioteca.controller;

import it.francesco.biblioteca.Biblioteca.dto.UsersDTO;
import it.francesco.biblioteca.Biblioteca.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {



    @Autowired
    private UsersService userService;


    @PostMapping("/register")
    public void registerUser(@RequestBody UsersDTO registrationDto) {
       // String encodedPassword = passwordEncoder.encode(registrationDto.getPassword());
       // registrationDto.setPassword(encodedPassword);
        userService.registrazioneUser(registrationDto);
        System.out.println(registrationDto);
    }
}
