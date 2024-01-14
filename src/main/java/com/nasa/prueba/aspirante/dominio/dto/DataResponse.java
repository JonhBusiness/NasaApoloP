package com.nasa.prueba.aspirante.dominio.dto;


import com.nasa.prueba.aspirante.dominio.entities.NasaCollection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class DataResponse {

    private NasaCollection collection;

}
