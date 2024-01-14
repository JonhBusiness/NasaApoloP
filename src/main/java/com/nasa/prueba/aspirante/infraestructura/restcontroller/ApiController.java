/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.nasa.prueba.aspirante.infraestructura.restcontroller;


import com.nasa.prueba.aspirante.dominio.entities.DataInfoEntity;
import com.nasa.prueba.aspirante.infraestructura.repository.DataNasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
/*
http://localhost:8080//api/v1/listaDB
*/
@RestController
@RequestMapping("/api/v1")
public class ApiController {

    private final DataNasaRepository dataNasaRepository;

    @Autowired
    public ApiController(DataNasaRepository dataNasaRepository) {
        this.dataNasaRepository = dataNasaRepository;
    }

    @GetMapping("/listaDB")
    public List<DataInfoEntity> Listar() {

        return dataNasaRepository.findAll();
    }

}
