package com.itsqmet.Taller1.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Usuarios {

    @Id //declara una clave primaria
    @GeneratedValue(strategy = GenerationType.AUTO) //Genera un ID automaticamente
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasenia;

}
