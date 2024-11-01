package com.example.parcialAPIexp.controller;

import com.example.parcialAPIexp.model.Evento;
import com.example.parcialAPIexp.service.EventoService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/eventos")
public class EventoController {

    private final EventoService eventoService;

    public EventoController(EventoService eventoService) {
        this.eventoService = eventoService;
    }

    @GetMapping
    public List<Evento> obtenerTodosEventos() {
        return eventoService.obtenerTodosEventos();
    }

    @GetMapping("/{id}")
    public Evento obtenerEventoPorId(@PathVariable Long id) {
        return eventoService.obtenerEventoPorId(id);
    }
}
