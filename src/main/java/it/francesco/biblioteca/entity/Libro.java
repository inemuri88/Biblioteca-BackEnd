package it.francesco.biblioteca.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "LIBRO")
public class Libro {

    @Id
    private Long id;

    private String titolo;

    private String casaEditrice;

    private String isbn;

    @Basic(optional = true)
    private String prestito;


}
