package it.francesco.biblioteca.converter;

import it.francesco.biblioteca.dto.AutoreDTO;
import it.francesco.biblioteca.entity.Autore;
import org.springframework.stereotype.Component;

@Component
public class AutoreConverter extends AbstractConverter<AutoreDTO, Autore>{


    @Override
    public Autore convertToEntity(AutoreDTO autoreDTO) {

        return new Autore(autoreDTO.getId(), autoreDTO.getNome(), autoreDTO.getCognome(), autoreDTO.getNazionalita());
    }

    @Override
    public AutoreDTO convertToDTO(Autore autore) {

        return new AutoreDTO(autore.getId(), autore.getNome(), autore.getCognome(), autore.getNazionalita());
    }
}
