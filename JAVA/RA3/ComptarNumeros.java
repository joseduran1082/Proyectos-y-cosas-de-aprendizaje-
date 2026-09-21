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
public class ComptarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negatius = 0;
        int zeros = 0;
        int positius = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introdueix el nombre " + i + ": ");
            int num = sc.nextInt();

            if (num < 0) {
                negatius++;
            } else if (num == 0) {
                zeros++;
            } else {
                positius++;
            }
        }
        System.out.println("Entre els valors que has introduït hi ha:");
        System.out.println("Negatius: " + negatius);
        System.out.println("Zeros: " + zeros);
        System.out.println("Positius: " + positius);

    }
}