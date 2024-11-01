package com.example.parcialAPIexp.repository;

import com.example.parcialAPIexp.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}

