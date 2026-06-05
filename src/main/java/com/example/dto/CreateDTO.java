package com.example.dto;

import jakarta.validation.constraints.*;
import lombok.Data;


public record CreateDTO (
    @NotNull(message = "El numero no puede ser negativo") 
      Integer jaulaId,

    @NotBlank(message = "EL medicamente no puede estar vacio") 
     String medicamento,

    @Positive(message = "La dosis no puede ser negativa")
      Double dosis,

    @NotBlank(message = "Debe ingresar la fecha en que inicio el tratamiento")
      String fechaInicio, 

    @NotNull Integer veterinarioId,
    
    @NotBlank(message = "Debe ingresar la fecha del fin del tratamiento ") 
      String fechaFin,

    @NotBlank(message = "El estado es obligatorio") 
      String estado )

{}
