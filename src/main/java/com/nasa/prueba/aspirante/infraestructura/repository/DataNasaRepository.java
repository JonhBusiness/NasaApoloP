/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Repository.java to edit this template
 */
package com.nasa.prueba.aspirante.infraestructura.repository;



import com.nasa.prueba.aspirante.dominio.entities.DataInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PC
 */
public interface DataNasaRepository extends JpaRepository<DataInfoEntity, Long> {
    
}
