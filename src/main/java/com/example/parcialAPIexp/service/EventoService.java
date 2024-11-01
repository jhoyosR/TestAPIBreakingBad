package com.example.parcialAPIexp.service;

import com.example.parcialAPIexp.model.Evento;
import com.example.parcialAPIexp.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {
    private final EventoRepository eventoRepository;

    public EventoService(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public List<Evento> obtenerTodosEventos(){
        return eventoRepository.findAll();
    }

    public Evento obtenerEventoPorId(Long id){
        return eventoRepository.findById(id).orElse(null);
    }
}
