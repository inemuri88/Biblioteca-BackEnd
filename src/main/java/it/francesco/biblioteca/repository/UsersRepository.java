package it.francesco.biblioteca.repository;

import it.francesco.biblioteca.entity.Libro;
import it.francesco.biblioteca.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UsersRepository extends JpaRepository<Users, Long> {
}
