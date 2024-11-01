package com.example.parcialAPIexp.repository;

import com.example.parcialAPIexp.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}

