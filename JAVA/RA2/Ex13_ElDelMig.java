package cat.copernic.m03.RA2;


import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
public class Ex13_ElDelMig {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix el primer: ");  
        double primero = sc.nextDouble();
        
        System.out.print("Introdueix el segon: ");
        double segon = sc.nextDouble();
        
        System.out.print("Introdueix el tercer: ");
        double tercer = sc.nextDouble();
        
        double mig = elDelMig(primero, segon, tercer);
        System.out.println("El del mig és: " + mig);
       /* if(primero < segon && primero > tercer)
            System.out.println("El del mig és: " + primero);
        else if(segon < primero && segon > tercer)
            System.out.println("El del mig és: " + segon);
        else if(tercer < )
        */
  
    }

  public static double elDelMig(double a, double b, double c) {
        if ((a > b && a < c) || (a < b && a > c)) {
            return a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            return b;
        } else {
            return c;
        }
    }
}
