/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Jose
 */
public class Entrenador extends membreEquip {
private int idFederacion;

    public Entrenador(Integer idFederacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public Integer getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }
       
        @Override
        public  void viajar(){
     
      }
        @Override
        public  void concentrarse(){
     
      }
       
       public  void dirigirPartido(){
     
      }
       
       public  void dirigirEntrenamiento(){
     
      }
}
