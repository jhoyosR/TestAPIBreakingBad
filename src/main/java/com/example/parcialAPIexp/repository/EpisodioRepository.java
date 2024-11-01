package com.example.parcialAPIexp.repository;

import com.example.parcialAPIexp.model.Episodio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodioRepository extends JpaRepository<Episodio, Long> {
}
