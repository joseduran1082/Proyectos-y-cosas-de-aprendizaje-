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
public class FactorialDeNumeroDecimalExacto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix un nombre natural: ");
        int n = sc.nextInt();
        double e = 0.0;
        double factorial = 1.0;
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                factorial *= i; 
            }
            e += 1.0 / factorial;
        }
        System.out.printf("El nombre e amb precisió %d és: %.10f%n", n, e);
    }
}

