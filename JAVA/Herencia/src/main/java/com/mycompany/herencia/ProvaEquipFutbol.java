/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author Jose
 */
public class ProvaEquipFutbol {
   
    public static void main(String[] args) {
       
        Futbolista f1 = new Futbolista(10, "Delantero", 1, "Juan", "Perez", 25);
        f1.concentrarse();
        f1.viajar();
       
        Entrenador e1 = new Entrenador(1234, 2, "Luis", "Gomez", 45);
       
        Masajista m1 = new Masajista(5, "Fisioterapia", 3, "Carlos", "Lopez", 38);
       
        e1.viajar();
        m1.viajar();
       
        membreEquip me = new Futbolista(7, "Defensa", 4, "Pedro", "Ruiz", 22);
        System.out.println(me.getNombre());
       
        membreEquip[] listaMembreEquip = new membreEquip[4];
        
        listaMembreEquip[0] = f1;
        listaMembreEquip[1] = e1;
        listaMembreEquip[2] = m1;
        listaMembreEquip[3] = me;
    
        for(membreEquip  m : listaMembreEquip){
            System.out.println(m.getNombre());
        }
        
        Futbolista fut = (Futbolista)me;
        System.out.println(((Futbolista)me).getDemarcacion());
    }
    
   
}