package com.example.tratamiento.controller;

import com.example.dto.CreateDTO;
import com.example.tratamiento.model.Tratamiento;
import com.example.tratamiento.service.TratamientoService;

import jakarta.validation.Valid;

import  org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@RestController
@RequestMapping("/api/v1/tratamiento")
public class TratamientoController {

@Autowired    
private  TratamientoService service;

@GetMapping
 public List<Tratamiento> listarTodo() {
  return service.getAllRecursos();
}
@GetMapping("/{id}")
  public Tratamiento obtenerPorId(@PathVariable int id) {
    return service.buscarTratamiento(id);
    }
@PostMapping
  public Tratamiento crear(@Valid @RequestBody CreateDTO dto) {
    return service.guardarTratamiento(dto);
    }
@PutMapping("/{id}")
  public Tratamiento modificar(@PathVariable Integer id, @Valid @RequestBody CreateDTO dto) {
    return service.actualizarTratamiento(id, dto);
    }

}

