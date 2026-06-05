package com.example.tratamiento.service;

import com.example.dto.CreateDTO;

import com.example.exception.exception;
import com.example.tratamiento.model.Tratamiento;
import com.example.tratamiento.repository.TratamientoRepository;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class TratamientoService {
@Autowired
private TratamientoRepository repository;

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

}

