package it.francesco.biblioteca.Biblioteca.converter;

import it.francesco.biblioteca.Biblioteca.dto.AutoreDTO;
import it.francesco.biblioteca.Biblioteca.entity.Autore;
import org.springframework.stereotype.Component;

@Component
public class AutoreConverter extends AbstractConverter<AutoreDTO, Autore>{


    @Override
    public Autore convertToEntity(AutoreDTO autoreDTO) {

        return new Autore(autoreDTO.getId(), autoreDTO.getNome(), autoreDTO.getCognome(), autoreDTO.getLibri());
    }

    @Override
    public AutoreDTO convertToDTO(Autore autore) {

        return new AutoreDTO(autore.getId(), autore.getNome(), autore.getCognome(), autore.getLibri());
    }
}
