package it.francesco.biblioteca.Biblioteca.controller;

import it.francesco.biblioteca.Biblioteca.dto.LibroDTO;
import it.francesco.biblioteca.Biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> registrazioneLibro(@RequestBody LibroDTO libroDTO){
        try {
            libroService.inserimentoLibro(libroDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body("Libro registrato con successo");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Errore durante la registrazione del libro");
        }

    }

    @GetMapping("/getAll")
    public List<LibroDTO> getAll(){
        return libroService.getAll();
    }
}
