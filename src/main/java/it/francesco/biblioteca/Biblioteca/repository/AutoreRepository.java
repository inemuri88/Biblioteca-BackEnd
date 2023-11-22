package it.francesco.biblioteca.Biblioteca.repository;

import it.francesco.biblioteca.Biblioteca.entity.Autore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutoreRepository extends JpaRepository<Autore, Long> {


}
