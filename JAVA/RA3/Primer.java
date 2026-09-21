/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA3;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
public class Primer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre natural: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("El nombre " + n + " NO és primer.");
        } else {
            boolean esPrimer = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    esPrimer = false;
                }
            }
            if (esPrimer) {
                System.out.println("El nombre " + n + " és primer.");
            } else {
                System.out.println("El nombre " + n + " NO és primer.");
            }
        }
    }
}
