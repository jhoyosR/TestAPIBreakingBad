package com.example.parcialAPIexp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ubicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;       // Nombre del lugar
    private String tipo;         // Ejemplo: Laboratorio, Casa, Negocio
    private String direccion;    // Dirección de la ubicación (si se aplica)
}

