/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Service.java to edit this template
 */
package com.nasa.prueba.aspirante.infraestructura.clientrest;



import com.nasa.prueba.aspirante.dominio.dto.DataResponse;
import com.nasa.prueba.aspirante.dominio.entities.DataInfo;
import com.nasa.prueba.aspirante.dominio.entities.DataInfoEntity;
import com.nasa.prueba.aspirante.dominio.entities.NasaItem;
import com.nasa.prueba.aspirante.infraestructura.repository.DataNasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NasaDataService {

    private final ApiService apiService;
    private final DataNasaRepository nasaRepository;

    @Autowired
    public NasaDataService(ApiService nasaApiService, DataNasaRepository nasaRepository) {
        this.apiService = nasaApiService;
        this.nasaRepository = nasaRepository;
    }

    public void fetchDataAndSaveToDatabase(String query) {
        try {
        DataResponse response = apiService.search(query);

        if (response.getCollection().getItems() != null) {
            for (NasaItem item : response.getCollection().getItems()) {
                
                if (item.getData() != null && !item.getData().isEmpty()) {
                    DataInfo dataInfo = item.getData().get(0); 
                    DataInfoEntity entity = DataInfoEntity.builder()
                            .href(item.getHref())
                            .center(dataInfo.getCenter())
                            .title(dataInfo.getTitle())
                            .nasaId(dataInfo.getNasa_id())
                            .build();

                    nasaRepository.save(entity);
                }
            }
        }
    } catch (Exception e) {
      
        e.printStackTrace();
    }
    }

}
