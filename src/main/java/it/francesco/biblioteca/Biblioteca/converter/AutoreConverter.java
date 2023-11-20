package it.francesco.biblioteca.Biblioteca.converter;

import it.francesco.biblioteca.Biblioteca.dto.AutoreDTO;
import it.francesco.biblioteca.Biblioteca.entity.Autore;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<AutoreDTO> convertToListDTO(List<Autore> autoreList) {
        return autoreList.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }
}
