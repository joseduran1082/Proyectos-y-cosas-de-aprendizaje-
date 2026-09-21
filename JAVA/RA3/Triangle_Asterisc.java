/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA3;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Triangle_Asterisc {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix l'amplada de la base[1-20]: ");
        int amplada;
        while(!sc.hasNextInt() || (amplada = sc.nextInt()) < 1 || amplada > 20 
                                                           || amplada % 2 == 0){
            sc.nextLine();
            System.out.print("Introdueix l'amplada de la base[1-20]: ");
        }
        
        int h = (amplada+1)/2;
        for (int linea = 1; linea <= h; linea++) {
            
            int asteriscos = (linea * 2) - 1;           
            int espacios = ((h*2-1) - asteriscos) / 2; 

            for (int s = 0; s < espacios; s++) {
                System.out.print(" ");
            }

            for (int a = 0; a < asteriscos; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int linea = 2; linea <= h; linea++) { 
           for(int espais = 1; espais <= linea-1;espais++){
               System.out.print(" ");
           }
           for(int asteriscs = 1; asteriscs <= amplada-2*(linea-1);asteriscs++){
               System.out.print("*");
           }
            System.out.println();
        }
    }
}
