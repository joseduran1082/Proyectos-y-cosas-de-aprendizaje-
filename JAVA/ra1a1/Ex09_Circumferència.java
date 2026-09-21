/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1a1;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex09_Circumferència {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame el radio: ");
        double radi = sc.nextDouble();
        
        System.out.println(" ");
        double longitud = 2 * Math.PI * radi;
        
        System.out.printf("La longitud es: %3.4f \n", longitud);
        
        double superficie = Math.PI * radi * radi;
        
        System.out.printf("La superficie es: %3.4f \n", superficie);
        
        double volumen = (4 * Math.PI * radi*radi*radi) / 3;
        
        System.out.printf("El volum es: %3.4f \n", volumen);


        
        

    }
    
}
