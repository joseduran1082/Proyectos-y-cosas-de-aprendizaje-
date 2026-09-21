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
public class Ex07_NomCognoms {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Introdueix el teu nom: ");
        
        String nom = sc.nextLine();
        
        System.out.print("Introdueix el teu primer cognom: ");
        
        String primerCognom = sc.nextLine();
        
        System.out.print("Introdueix el teu segon cognom: ");
        
        String segonCognom = sc.nextLine();
        
        System.out.println("El teu nom complet es: " + nom + primerCognom  +" "+ segonCognom);
        
        
    }
    
}
