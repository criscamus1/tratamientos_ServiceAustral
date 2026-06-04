package com.example.tratamiento.controller;

import com.example.tratamiento.model.Tratamiento;
import com.example.tratamiento.service.TratamientoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import  org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/Tratamiento")
public class TratamientoController {
@Autowired
private TratamientoService service;

@GetMapping
public List<Tratamiento>obteneTratamientos(){
    return service.obetenerTratamientos();
}
@GetMapping("/{id}")
public Tratamiento buscarTratamiento(@PathVariable int id){
    return service.buscarTratamientoId(id);
}
@PostMapping
public Tratamiento guardarTratamiento(@RequestBody Tratamiento trat){
    return service.guardar(trat);
}
@PutMapping
public Tratamiento actualizarTratamiento(@RequestBody Tratamiento trat){
    return service.actualizar(trat);
}
@DeleteMapping("/{id}")
public void eliminarTratamiento(@PathVariable int id){
     service.eliminarTratamiento(id);
}
}
