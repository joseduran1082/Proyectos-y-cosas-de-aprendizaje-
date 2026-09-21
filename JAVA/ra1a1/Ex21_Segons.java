/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex21_Segons {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("es","ES"));
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueixi nombre gran de segons: ");
        long segonsTotals = sc.nextLong();

        long dies = segonsTotals / (60*60*24);
        int hores = (int)(segonsTotals % (60*60*24) /(60*60) );
        long minuts = (int)(segonsTotals % (60*60)) / 60;
        long segons = (int)(segonsTotals % 60);

        System.out.printf("%,d segons equival a %,d dies, %d hores, %d minuts i %d segons.%n", segonsTotals, dies, hores, minuts, segons);     
    }
    
}
