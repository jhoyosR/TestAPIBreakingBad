package com.example.parcialAPIexp.service;

import com.example.parcialAPIexp.model.Evento;
import com.example.parcialAPIexp.model.Ubicacion;
import com.example.parcialAPIexp.repository.UbicacionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbicacionService {
    private final UbicacionRepository ubicacionRepository;

    public UbicacionService(UbicacionRepository ubicacionRepository) {
        this.ubicacionRepository = ubicacionRepository;
    }

    public List<Ubicacion> obtenerTodosUbicaciones(){
        return ubicacionRepository.findAll();
    }

    public Ubicacion obtenerUbicacionPorId(Long id){
        return ubicacionRepository.findById(id).orElse(null);
    }
}
