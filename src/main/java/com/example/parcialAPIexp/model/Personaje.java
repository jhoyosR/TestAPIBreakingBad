package com.example.parcialAPIexp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String alias;
    private String ocupacion;
    private String estatus;  // vivo, muerto, desconocido
    private String primeraAparicion;
}

