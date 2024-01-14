/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.nasa.prueba.aspirante.infraestructura.clientrest;

import com.nasa.prueba.aspirante.dominio.dto.DataResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {
//Api externa

    private static final String nasaApiUrl = "https://images-api.nasa.gov";

    private final RestTemplate restTemplate;

    @Autowired
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DataResponse search(String q) {
        String url = nasaApiUrl + "/search?q=" + q;

        try {
            return restTemplate.getForObject(url, DataResponse.class);

        } catch (RestClientException e) {

            e.printStackTrace();
            return null;
        }
    }

}
