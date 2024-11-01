package com.example.parcialAPIexp.service;

import com.example.parcialAPIexp.model.Personaje;
import com.example.parcialAPIexp.repository.PersonajeRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonajeService {
    private final PersonajeRepository personajeRepository;

    public PersonajeService(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    public List<Personaje> obtenerTodosPersonajes() {
        return personajeRepository.findAll();
    }

    public Personaje obtenerPersonajePorId(Long id) {
        return personajeRepository.findById(id).orElse(null);
    }
}
