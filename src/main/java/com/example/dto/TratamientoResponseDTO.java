package com.example.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TratamientoResponseDTO {
private Integer id;
private Integer jaulaId;
private String medicamento;
private Double dosis;
private String fechaInicio;
private String fechaFin;
 Integer veterinarioId;
private String estado;
}
