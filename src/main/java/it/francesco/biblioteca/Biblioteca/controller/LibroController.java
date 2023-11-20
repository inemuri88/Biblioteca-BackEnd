package it.francesco.biblioteca.Biblioteca.controller;

import it.francesco.biblioteca.Biblioteca.dto.LibroDTO;
import it.francesco.biblioteca.Biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    /*
    Inserimento libro nel db
     */
    @PostMapping("/registrazioneLibro")
    public void registrazioneLibro(@RequestBody LibroDTO libroDTO){
        libroService.inserimentoLibro(libroDTO);
    }

    @GetMapping("/getAll")
    public List<LibroDTO> getAll(){
        return null;
    }
}
