package cat.copernic.m03.RA2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
public class EX02_MultipleDe7 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueixi un nombre natural: ");
        int n = sc.nextInt();
        
        if ( n% 7 == 0){
            System.out.println("El nombre és múltiple de 7.");
        } else {
            System.out.println("El nombre NO és múltiple de 7.");
        }        
    }
}