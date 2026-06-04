package com.example.tratamiento.service;

import com.example.tratamiento.model.Tratamiento;
import com.example.tratamiento.repository.TratamientoRepository;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class TratamientoService {
@Autowired
private TratamientoRepository repository;

public List<Tratamiento> obetenerTratamientos(){
    return repository.obtenerTratamientos();
}
public Tratamiento buscarTratamientoId(int id){
    return repository.buscarTratamientoId(id);
}
public Tratamiento guardar(Tratamiento trat){
   return repository.guardar(trat);
}
public Tratamiento actualizar(Tratamiento trat){
    return repository.actualizarTratamiento(trat);
}
public String eliminarTratamiento(int id){
    repository.eliminar(id);
    return "El tratamiento ha finalizado";
}
}
