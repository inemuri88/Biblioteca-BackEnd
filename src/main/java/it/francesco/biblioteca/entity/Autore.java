package it.francesco.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "AUTORE")
@AllArgsConstructor
@NoArgsConstructor
public class Autore {

    @Id
    private Long id;

    private String nome;

    private String cognome;

    private String nazionalita;

}
