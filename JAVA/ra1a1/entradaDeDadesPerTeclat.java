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
public class entradaDeDadesPerTeclat {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner teclat = new Scanner(System.in);
        
        System.out.print("Introdueix un valor enter: ");
        
        int valorIntroduit = teclat.nextInt();
        
        System.out.println("El valor introduit es: " + valorIntroduit);
       
       
        System.out.print("En decimals: ");
        double valorEnDecimals = teclat .nextDouble();
        
        
        System.out.println("valor en decimasls: " + valorEnDecimals);
    }
}
