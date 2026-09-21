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
public class Ex19_Fahrenheit2Celsius {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame los grados en grados farenheit: ");
        double farenheit = sc.nextDouble();
        
        double celsius = (farenheit - 32) * 5/9;
        
        System.out.printf("Los grados en celsius son: %.2f \n", celsius);
    }
    
}
