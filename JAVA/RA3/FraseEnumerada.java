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
public class FraseEnumerada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String frase = sc.nextLine();
        int numero = sc.nextInt();
        
      for(int comptador = 1 ; comptador <= numero ; comptador++){
            System.out.println(comptador + " - " + frase);

    }  
  }
}
