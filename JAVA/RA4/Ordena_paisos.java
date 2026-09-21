/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA4;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ordena_paisos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
       // System.out.print("Introdueix el nombre total de paisos: ");
        
        int totalPaisos = sc.nextInt();
        
        String[] paisos = new String[totalPaisos];
        sc.nextLine();
        for (int i = 0; i < totalPaisos; i++) {
         //   System.out.print("Introdueix pais "+ (i+1)+" :");
            paisos[i] = sc.nextLine();
        }

        ordenaBombolla(paisos);
      //  System.out.println("Despres");
        mostrarPaisos(paisos);
        
        
    }
    
    public static void ordenaBombolla(String[] paisos) {
        // Ordenació bombolla de més petit a més gran
        for (int passades = 1; passades < paisos.length; passades++) {
            for (int j = 0; j < paisos.length - passades; j++) {
                if (paisos[j].compareTo(paisos[j + 1]) > 0) {
                    String aux = paisos[j];
                    paisos[j] = paisos[j + 1];
                    paisos[j + 1] = aux;
                }
            }
        }
    }
    
    static void mostrarPaisos(String[] paisos){
      System.out.println("Països ordenats:");
        for(String c : paisos){
            System.out.println(c);
        }
    }
}