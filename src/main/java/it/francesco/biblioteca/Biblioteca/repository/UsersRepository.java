package it.francesco.biblioteca.Biblioteca.repository;

import it.francesco.biblioteca.Biblioteca.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UsersRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByUsername(String username);
}
