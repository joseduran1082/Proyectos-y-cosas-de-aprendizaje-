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

public class Numero100Major{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix un nombre natural: ");
        int n = sc.nextInt();
        while (n < 100) {
            System.out.print("El nombre és menor que 100. Torna a introduir-lo: ");
            n = sc.nextInt();
        }
        System.out.println("El nombre introduït (" + n + ") és major o igual a 100.");
    }
}
