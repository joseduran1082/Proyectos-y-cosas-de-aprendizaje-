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
public class Rectangle_asterisc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int columna = sc.nextInt();
        int fila = sc.nextInt();

        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
}
