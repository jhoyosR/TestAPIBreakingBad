package com.example.parcialAPIexp.controller;

import com.example.parcialAPIexp.model.Episodio;
import com.example.parcialAPIexp.service.EpisodioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/episodios")
public class EpisodioController {

    private final EpisodioService episodioService;

    public EpisodioController(EpisodioService episodioService) {
        this.episodioService = episodioService;
    }

    @GetMapping
    public List<Episodio> obtenerTodosEpisodio() {
        return episodioService.obtenerTodosEpisodios();
    }

    @GetMapping("/{id}")
    public Episodio obtenerEpisodioPorId(@PathVariable Long id) {
        return episodioService.obtenerEpisodioPorId(id);
    }
}

