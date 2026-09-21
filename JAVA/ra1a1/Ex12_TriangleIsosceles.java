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
public class Ex12_TriangleIsosceles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Introdueix l'alçada: ");        
        float alçada = sc.nextFloat();        
        
        System.out.print("Introdueix l'amplada: ");  
        float amplada = sc.nextFloat();
        
        float hipotenusa = (float) Math.sqrt((amplada / 2)*(amplada /2) + (alçada * alçada));
        
        float perimetre = 2*hipotenusa + amplada;      
        System.out.printf("El perimetre es: %4.4f \n" , perimetre );
        
        float superficie = (amplada * alçada) / 2;
        System.out.printf("La superficie es: %4.4f \n" , superficie );
    }
    
}
