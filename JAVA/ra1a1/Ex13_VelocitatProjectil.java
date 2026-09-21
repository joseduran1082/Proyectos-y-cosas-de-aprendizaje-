/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex13_VelocitatProjectil {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Introdueix el espai recorregut en km: ");        
        float km = sc.nextFloat();        
        
        System.out.print("Introdueix el temps en segons : ");        
        float temps = sc.nextFloat(); 
        
        float metreSegons = km / temps * 1000;
        
        System.out.printf("La velocidad per m/s es:  %.2f M/S\n " , metreSegons);
    }
    
}
