/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Jose
 */
public class ExerciciCollecionsVehicles {
    public static void main(String[] args) {
        
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        
        vehicles.add(new Vehicle("cotxe","9345DFG"));
        vehicles.add(new Vehicle("cotxe","2233ADG"));
        vehicles.add(new Vehicle("Vaixel","DF-345-TY"));
        vehicles.add(new Vehicle("Vaixel","L-001-EK"));
        vehicles.add(new Vehicle("Avio","X-9008789"));
        vehicles.add(new Vehicle("Avio","A-9008789"));
        
        System.out.println("Llista sense ordenar");
        /*
        for(int i = 0;i < vehicles.size(); i++){
            System.out.println(vehicles.get(i));
        }*/
        
        for(Vehicle v: vehicles){
            System.out.println(v);
        }
        System.out.println("");
        
        System.out.println("Vehicle primera posicio");
        System.out.println(vehicles.get(0));
        
        ///Aquesta es una manera de donar el criteri per comparar amb el sort, una arraylist.
        ///vehicles.sort(Comparator.comparing(Vehicle::getMatricula));
        ///vehicles.sort(null); amb aixó agafa directament el compareTo creat per ordenar-lo.

        Collections.sort(vehicles);// El collections es una biblioteca que implementa el sort, de forma generica.
        System.out.println("Llista de vehicles ordenats: ");
        for(Vehicle v : vehicles){
            System.out.println(v);
        }

        //Eliminar el vechicle de la segona posició    
        
        vehicles.remove(1);
        System.out.println("Llista de vehicles sense el removido");
    }
}