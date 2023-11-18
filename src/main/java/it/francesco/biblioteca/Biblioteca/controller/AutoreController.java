package it.francesco.biblioteca.Biblioteca.controller;

import it.francesco.biblioteca.Biblioteca.dto.AutoreDTO;
import it.francesco.biblioteca.Biblioteca.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autore")
public class AutoreController {

    @Autowired
    private AutoreService service;


}
