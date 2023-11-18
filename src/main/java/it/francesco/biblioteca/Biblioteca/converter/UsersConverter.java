package it.francesco.biblioteca.Biblioteca.converter;

import it.francesco.biblioteca.Biblioteca.dto.UsersDTO;
import it.francesco.biblioteca.Biblioteca.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter extends AbstractConverter<UsersDTO, Users>{
    @Override
    public Users convertToEntity(UsersDTO usersDTO) {
        return null;
    }

    @Override
    public UsersDTO convertToDTO(Users users) {
        return null;
    }
}
