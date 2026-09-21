/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1a1;

/**
 *
 * @author Jose
 */
public class ClassesStringsAltres {
    public static void main(String[] args) {
        String nom = "Raul";
        String altreNom = "Cesar";
        
        String cognom1 = new String("Perez");
        String cognom2 = new String("Perez");

        
        int valor = 5;
     
        System.out.println("cognoms: " + cognom1);
        int edat = 19;
        
        System.out.println(String.valueOf(edat)+valor);
        System.out.println("Longitud nom: " + nom.length());
        String edat2 = "19";
        System.out.println(Integer.parseInt(edat2)+1);
        
        final int MIN = 2 , MAX = 45;
        
        System.out.println("Valor aleatori: " + (int)(Math.random() * (MAX-MIN+1)+ MIN));
        
    }
}
