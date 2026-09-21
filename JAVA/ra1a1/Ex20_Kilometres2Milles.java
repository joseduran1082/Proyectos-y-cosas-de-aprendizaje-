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
public class Ex20_Kilometres2Milles {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame la distancia en Km: ");
        double km = sc.nextDouble();
        
        double milles = (float)(km * 0.621);
        System.out.printf("Las millas son: %.3f \n", milles);
    }
    
}
