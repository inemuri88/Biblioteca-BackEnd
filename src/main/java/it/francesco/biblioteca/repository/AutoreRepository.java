package it.francesco.biblioteca.repository;

import it.francesco.biblioteca.entity.Autore;
import it.francesco.biblioteca.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AutoreRepository extends JpaRepository<Autore, Long> {
}
