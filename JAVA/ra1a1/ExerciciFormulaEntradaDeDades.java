/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1.personatges;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class ExerciciFormulaEntradaDeDades {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclat = new Scanner(System.in); // Line MOOOOLT NECESARIA PERO MOOOLT
               
       
        System.out.print("A: ");
        double valorDeA = teclat .nextDouble();
        
        
        System.out.println("valor de a:  " + valorDeA);
        
        System.out.print("B: ");
        double valorDeB = teclat .nextDouble();
        
        
        System.out.println("valor de B:  " + valorDeB);
        
        System.out.print("C: ");
        double valorDeC = teclat .nextDouble();
        
        
        System.out.println("valor de C:  " + valorDeC);
        
        double x1 = (-valorDeB + Math.sqrt (valorDeB * valorDeB - 4 * valorDeA * valorDeC ) ) / (2 * valorDeA);
        
        System.out.println("X1 es : " + x1);
        
        double x2 = (-valorDeB - Math.sqrt (valorDeB * valorDeB - 4 * valorDeA * valorDeC ) ) / (2 * valorDeA);
        
        System.out.println("X2 es : " + x2);
        

    }
     
}
