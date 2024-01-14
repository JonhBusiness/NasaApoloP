/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nasa.prueba.aspirante.aplicacion.taskcheduler;


import com.nasa.prueba.aspirante.infraestructura.clientrest.NasaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DataScheduler {

    private final NasaDataService nasaService;

    @Autowired
    public DataScheduler(NasaDataService nasaService) {
        this.nasaService = nasaService;
    }

    // Se ejecutará cada minuto (60,000 milisegundos)
    @Scheduled(fixedRate = 60000)
    public void fetchDataAndSave() {
        String url = "Apollo 2011";
        nasaService.fetchDataAndSaveToDatabase(url);
    }
}
