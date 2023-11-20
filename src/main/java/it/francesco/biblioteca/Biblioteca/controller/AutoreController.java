package it.francesco.biblioteca.Biblioteca.controller;

import it.francesco.biblioteca.Biblioteca.dto.AutoreDTO;
import it.francesco.biblioteca.Biblioteca.service.AutoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autore")
public class AutoreController {

    @Autowired
    private AutoreService service;

    /*
    getAll per acquisire tutti gli autori nel db
     */
    @GetMapping("/getall")
    public List<AutoreDTO> getAll(){
        return service.getAll();
    }

    /*
    Inserisce l'autore nel db e rimanda lo status dell'operazione
     */
    @PostMapping("/RegistrazioneAutore")
    public ResponseEntity<?> registrazione(@RequestBody AutoreDTO autoreDTO){
        try {
            service.registrazioneAutore(autoreDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body("Autore registrato con successo");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Errore durante la registrazione dell'autore");
        }
    }

    @DeleteMapping("eliminaAutore")
    public void eliminaAutore(@RequestBody AutoreDTO autoreDTO){
        service.eliminazioneAutore(autoreDTO);
    }
}
