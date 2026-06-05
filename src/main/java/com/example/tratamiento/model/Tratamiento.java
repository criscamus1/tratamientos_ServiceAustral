package com.example.tratamiento.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="tratamiento")
public class Tratamiento{
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name="jaulaId")
    private Integer jaulaId;
    @Column(name = "medicamento", nullable = false, length = 100)
    private String medicamento;

    @Column(name = "dosis", nullable = false, length = 100, unique = true)
    private Double dosis;

    @Column(name = "veterinarioId", nullable = false)
    private Integer veterinarioId;

    @Column(name = "fechaInicio", nullable =false, length = 100, unique = true)
    private String fechaInicio;

    @Column(name = "fechaFin", nullable = false, length = 40)
    private String fechaFin; 
    
    @Column(name = "estado", nullable = false, length = 40)
    private String estado; 
}
