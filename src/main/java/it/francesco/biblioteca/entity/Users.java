package it.francesco.biblioteca.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "USERS")
public class Users {

    @Id
    private Long id;

    private String username;

    private String password;

}
