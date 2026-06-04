package com.example.tratamiento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor



public class Tratamiento {
private int id;
private int jaulaId;
private String medicamento;
private String dosis;
private String fechaInicio;
private String fechaFin;
private String estado;
}
