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

public class SumaProducte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        long producte = 1;

        System.out.print("Introdueix un nombre natural (entre 1 i 20): ");
        int n = sc.nextInt();

       
        if (n < 1 || n > 20)
             System.out.println("Valor fora de rang!");
        else {
            for (int i = 1; i <= n; i++) {
            suma += i;
            producte *= i;       
        }
            System.out.println("Suma: " + suma);
            System.out.println("Producte: " + producte);
            }
     }
}