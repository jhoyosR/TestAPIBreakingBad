package com.example.parcialAPIexp.controller;

import com.example.parcialAPIexp.model.Ubicacion;
import com.example.parcialAPIexp.service.UbicacionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/ubicaciones")
public class UbicacionController {

    private final UbicacionService ubicacionService;

    public UbicacionController(UbicacionService ubicacionService) {
        this.ubicacionService = ubicacionService;
    }

    @GetMapping
    public List<Ubicacion> obtenerTodasUbicaciones() {
        return ubicacionService.obtenerTodosUbicaciones();
    }

    @GetMapping("/{id}")
    public Ubicacion obtenerUbicacionPorId(@PathVariable Long id) {
        return ubicacionService.obtenerUbicacionPorId(id);
    }
}
