/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Jose
 */
public  class Futbolista extends membreEquip {
 
    private int dorsal;
    private String demarcacion;

    public Futbolista(Integer dorsal, String demarcacion,
            Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
       
        @Override
        public  void viajar(){
     
      }
        @Override
      public  void concentrarse(){
     
      }
     
       public  void jugarPartido(){
     
      }
       
        public  void entrenar(){
     
      }
       

}
