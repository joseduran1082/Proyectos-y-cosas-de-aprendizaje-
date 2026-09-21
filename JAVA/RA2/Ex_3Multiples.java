package cat.copernic.m03.RA2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
public class Ex_3Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un nombre natural: ");    
        int n = sc.nextInt();
        
        System.out.print("Introdueixi un altre nombre natural: ");
        int m = sc.nextInt();
        
        if (m % n == 0) {
            System.out.println("El " + m + " és múltiple de " + n + ".");
        } else if (n % m == 0) {
            System.out.println("El " + n + " és múltiple de " + m + ".");
        } else {
            System.out.println("Cap d'ells és múltiple de l'altre.");
    }
   }
}


