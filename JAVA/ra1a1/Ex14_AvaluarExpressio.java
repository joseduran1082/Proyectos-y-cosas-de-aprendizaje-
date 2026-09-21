/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1a1;

import java.util.Locale;

/**
 *
 * @author Jose
 */
public class Ex14_AvaluarExpressio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        double A = 3 ,B = 6, C = 4;
        double operacio = (A+7*C)/(B+2-A)+2*B;
        System.out.println("L'expressió (A+7*C)/(B+2-A)+2*B");
        System.out.println(" ");
        System.out.println("Pels valors A = 3, B = 6, C = 4");
        System.out.printf("Es = %.2f \n", operacio);
    }
}
