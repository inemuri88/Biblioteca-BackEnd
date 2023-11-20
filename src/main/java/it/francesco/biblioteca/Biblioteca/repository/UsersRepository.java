package it.francesco.biblioteca.Biblioteca.repository;

import it.francesco.biblioteca.Biblioteca.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {


}
