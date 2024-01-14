/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nasa.prueba.aspirante.dominio.entities;

import java.util.List;
import lombok.Data;

/**
 *
 * @author PC
 */
 
   @Data //Clase referente a items
  public class NasaItem {
    private String href;
    private List<DataInfo> data;
  
}
