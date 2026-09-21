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

public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre: ");
        int num = sc.nextInt();
        int original = num;
        int invertit = 0;
        while (num > 0) {
            int digit = num % 10;
            invertit = invertit * 10 + digit;
            num = num / 10;
        }
        if (original == invertit) {
            System.out.println("El nombre " + original + " és capicua.");
        } else {
            System.out.println("El nombre " + original + " no és capicua.");
        }
    }
}
