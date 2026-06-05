package com.example.tratamiento.service;

import com.example.dto.CreateDTO;
import com.example.dto.VeterinarioDTO;
import com.example.exception.exception;
import com.example.tratamiento.model.Tratamiento;
import com.example.tratamiento.repository.TratamientoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class TratamientoService {
private final WebClient veterinarioWebClient;
@Autowired
private TratamientoRepository repository;

TratamientoService(WebClient veterinarioWebClient) {
    this.veterinarioWebClient = veterinarioWebClient;
}

public List <Tratamiento> getAllRecursos(){
    return repository.findAll();
}
public Tratamiento buscarTratamiento(int id){
    return repository.findById(id).orElseThrow(() -> new exception("el tratamiento no fue encontrado"));
}
public Tratamiento getById(Integer id){
    return repository.findById(id).orElse(null);
}
public Tratamiento guardarTratamiento(CreateDTO dto){
    Tratamiento trat=new Tratamiento();
    trat.setJaulaId(dto.jaulaId());
    trat.setMedicamento(dto.medicamento());
    trat.setDosis(dto.dosis());
    trat.setFechaInicio(dto.fechaInicio());
    trat.setFechaFin(dto.fechaFin());
    trat.setEstado(dto.estado());
    return repository.save(trat);

}
public Tratamiento actualizarTratamiento(Integer id,CreateDTO dto){
   buscarTratamiento(id);
    Tratamiento trat = new Tratamiento();
    trat.setId(id);
    trat.setJaulaId(dto.jaulaId());
    trat.setMedicamento(dto.medicamento());
    trat.setDosis(dto.dosis());
    trat.setFechaInicio(dto.fechaInicio());
    trat.setFechaFin(dto.fechaFin());
    trat.setEstado(dto.estado());
        
        return repository.save(trat);
    }
public Tratamiento guardar(CreateDTO dto){ 
    VeterinarioDTO veterinario = null;
    try {
        veterinario = veterinarioWebClient.get().uri("/" + dto.veterinarioId()) .retrieve().bodyToMono(VeterinarioDTO.class).block(); 
    } catch (Exception e) {
        throw new exception("Error, el ID de veterinario ingresado no está autorizado para este trabajo.");
    }

    if (veterinario == null) {
        throw new exception("Veterinario no encontrado");
    }
    return actualizarTratamiento(null, dto);
}
}