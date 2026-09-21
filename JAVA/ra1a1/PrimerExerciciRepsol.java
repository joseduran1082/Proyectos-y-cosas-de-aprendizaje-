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
public class PrimerExerciciRepsol {
    
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in); 
        
         System.out.print("Introdueix els litres: ");
         int litres =  teclat.nextInt();
         
         double preuLitre = 1.28;
         
         double preuTotal = litres * preuLitre;


        System.out.print("""
                           +------------------------+
                           |                        |
                           |      REPSOL S.A.       |
                           |                        |
                           | 2025-09-17  04:38PM    |
                           |                        |
                           """);
        System.out.printf( "| Litres:      %-10d|\n",litres);
        System.out.printf( "%-8s %-7.2f € |\n","| Preu Litre: ",preuLitre);
        System.out.println("|                        |");
        System.out.printf( "%-8s %-7.2f € |\n","| Preu Total: ",preuTotal);
        System.out.println("""
                           |                        |
                           +------------------------+""");

        

    }
    
}
