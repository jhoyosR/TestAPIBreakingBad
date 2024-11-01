package com.example.parcialAPIexp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;       // Nombre del evento
    private String descripcion;  // Breve descripción del evento
    private String fecha;        // Fecha del evento (puede ser un String o LocalDate según lo que prefieras)
}
