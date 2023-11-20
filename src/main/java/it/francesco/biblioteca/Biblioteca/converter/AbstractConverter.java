package it.francesco.biblioteca.Biblioteca.converter;

import java.util.List;

public abstract class AbstractConverter<DTO, Entity> {

    public abstract Entity convertToEntity(DTO dto);

    public abstract DTO convertToDTO(Entity entity);

    public abstract List<DTO> convertToListDTO(List<Entity> entityList);
}
