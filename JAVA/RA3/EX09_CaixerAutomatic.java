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
public class EX09_CaixerAutomatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int pinCorrecte = 1234;
        
        System.out.println("BENVINGUDA/BENVINGUT AL BANC COPÈRNIC.");
        int intents = 0;
        boolean correcte = false;
        do {
            intents++;
            System.out.print("INSEREIX EL PIN: ");
            int pin = sc.nextInt();
            
            if (pin == pinCorrecte){
                System.out.println("PIN CORRECTE. SELECCIONI L’OPERACIÓ A "
                                                             + "REALITZAR ...");
                correcte = true;
            } else if (intents < 3)
                System.out.println("PIN INCORRECTE. PROVA DE NOU.");
        }while (intents < 3 && !correcte);
        
        if(!correcte){
            System.out.println("HA ARRIBAT AL NOMBRE MÀXIM D’INTENTS. "
                                                        + "TARGETA RETINGUDA.");
            System.out.println("POSI’S EN CONTACTE AMB EL PERSONAL DE L’OFICINA.");
        }
    }
}