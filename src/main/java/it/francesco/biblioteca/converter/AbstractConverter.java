package it.francesco.biblioteca.converter;

public abstract class AbstractConverter<DTO, Entity> {

    public abstract Entity convertToEntity(DTO dto);

    public abstract DTO convertToDTO(Entity entity);
}
