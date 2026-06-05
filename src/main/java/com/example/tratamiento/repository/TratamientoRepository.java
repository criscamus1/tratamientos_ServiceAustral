package com.example.tratamiento.repository;

import org.springframework.stereotype.Repository;
import com.example.tratamiento.model.Tratamiento;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface TratamientoRepository extends JpaRepository<Tratamiento,Integer> {

}