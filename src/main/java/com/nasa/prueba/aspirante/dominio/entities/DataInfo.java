/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nasa.prueba.aspirante.dominio.entities;

import java.util.List;
import lombok.Data;
//Clase Referente a data
@Data
public class DataInfo {

   private String center;
    private String title;
    private List<String> keywords;
    private String date_created;
    private String media_type;
    private String description;
    private String nasa_id;

}
