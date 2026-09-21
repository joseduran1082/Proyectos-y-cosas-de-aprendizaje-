/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.herencia;

/**
 *
 * @author Jose
 */
  public class Masajista extends membreEquip {
    private int anyosExperiencia;
    private String titulacion;

    public Masajista(Integer anyosExperiencia, String titulacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.anyosExperiencia = anyosExperiencia;
        this.titulacion = titulacion;
    }

    public Integer getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(Integer anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
       
        @Override
        public  void viajar(){
     
      }
        @Override
        public  void concentrarse(){
     
      }
       
        public  void darMasaje( Futbolista f){
           
      }
   
}

