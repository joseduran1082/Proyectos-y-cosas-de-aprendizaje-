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
public class Ex15_Cilindre {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Introdueix el radi: ");        
        float radi = sc.nextFloat();        
        
        System.out.print("Introdueix l'alçada: ");  
        float alçada = sc.nextFloat();
        
        double PI = Math.PI;
        
        float area = (float) (2 * PI * radi * (radi+alçada));
        
        float volum = (float) PI * (radi*radi)* alçada;
        
        System.out.printf("La superficie del cilindre es: %.2f \n" , area);
        System.out.printf("El volum del cilindre es:  %.2f \n", volum);

  
    }
}
