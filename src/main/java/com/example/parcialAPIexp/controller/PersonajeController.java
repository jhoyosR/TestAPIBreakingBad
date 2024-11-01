package com.example.parcialAPIexp.controller;

import com.example.parcialAPIexp.model.Personaje;
import com.example.parcialAPIexp.service.PersonajeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/personajes")
public class PersonajeController {

    private final PersonajeService personajeService;

    public PersonajeController(PersonajeService personajeService) {
        this.personajeService = personajeService;
    }

    @GetMapping
    public List<Personaje> obtenerTodosPersonajes() {
        return personajeService.obtenerTodosPersonajes();
    }

    @GetMapping("/{id}")
    public Personaje obtenerPersonajePorId(@PathVariable Long id) {
        return personajeService.obtenerPersonajePorId(id);
    }
}

