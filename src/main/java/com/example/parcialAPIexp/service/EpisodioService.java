package com.example.parcialAPIexp.service;

import com.example.parcialAPIexp.model.Episodio;
import com.example.parcialAPIexp.model.Evento;
import com.example.parcialAPIexp.repository.EpisodioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodioService {
    private final EpisodioRepository episodioRepository;

    public EpisodioService(EpisodioRepository episodioRepository) {
        this.episodioRepository = episodioRepository;
    }

    public List<Episodio> obtenerTodosEpisodios() {
        return episodioRepository.findAll();
    }

    public Episodio obtenerEpisodioPorId(Long id){
        return episodioRepository.findById(id).orElse(null);
    }
}
