package com.example.tratamiento.repository;

import org.springframework.stereotype.Repository;
import com.example.tratamiento.model.Tratamiento;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TratamientoRepository {
private List<Tratamiento> listaTratamiento=new ArrayList<>();

public List<Tratamiento>obtenerTratamientos(){
    return listaTratamiento;
}
public Tratamiento buscarTratamientoId(int id){
    for(Tratamiento trat:listaTratamiento){
        if(trat.getId()==id){
            return trat;
        }
    }
    return  null;
}
public Tratamiento actualizarTratamiento(Tratamiento trat){
    int id=0;
    int idPosicion=0;
    for(int i=0;i<listaTratamiento.size();i++){
        if(listaTratamiento.get(i).getId()==trat.getId()){
            id=trat.getId();
            idPosicion=1;
        }
    }
    Tratamiento trat1= new Tratamiento();
    trat1.setId(id);
    trat1.setMedicamento(trat1.getMedicamento());
    trat1.setDosis(trat1.getDosis());
    trat1.setFechaInicio(trat1.getFechaInicio());
    trat1.setFechaFin(trat1.getFechaFin());
    trat1.setEstado(trat1.getEstado());
    listaTratamiento.add(idPosicion, trat1);
    return trat1;
}
public Tratamiento guardar(Tratamiento trat){
     listaTratamiento.add(trat);
     return trat;
}
public void eliminar(int id){
    Tratamiento trat=buscarTratamientoId(id);
    if(trat !=null){
        listaTratamiento.remove(trat);
    }
}

}