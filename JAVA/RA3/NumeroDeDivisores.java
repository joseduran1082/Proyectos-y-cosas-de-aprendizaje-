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

public class NumeroDeDivisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero: ");
        int n = sc.nextInt();
        System.out.print("Els divisors de " + n + " són: ");
        int raiz = (int) Math.sqrt(n);
        for (int i = 1; i <= raiz; i++) {
            if (n % i == 0) {
                System.out.print(i + " "); 
                if (i != n / i) {
                    System.out.print((n / i) + " "); 
                }
            }
        }
    }
}
