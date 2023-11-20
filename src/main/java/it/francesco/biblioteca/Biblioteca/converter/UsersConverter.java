package it.francesco.biblioteca.Biblioteca.converter;

import it.francesco.biblioteca.Biblioteca.dto.UsersDTO;
import it.francesco.biblioteca.Biblioteca.entity.Users;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsersConverter extends AbstractConverter<UsersDTO, Users>{
    @Override
    public Users convertToEntity(UsersDTO usersDTO) {

        return new Users(usersDTO.getId(), usersDTO.getUsername(), usersDTO.getPassword(), usersDTO.getLibri());
    }

    @Override
    public UsersDTO convertToDTO(Users users) {

        return new UsersDTO(users.getId(), users.getUsername(), users.getPassword(), users.getLibri());
    }

    @Override
    public List<UsersDTO> convertToListDTO(List<Users> users) {
        return null;
    }
}
