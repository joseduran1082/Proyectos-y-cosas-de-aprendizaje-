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
public class Faulhaber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int p = 1;
        do{
        System.out.print("Introdueix el valor de n: ");
        n = sc.nextInt();
        System.out.print("Introdueix el valor de p: ");
        p = sc.nextInt();
        if(n != 0 || p != 0){
            long resultat = 0;
            for(int i = 1; i <= n; i++){
                long potencia = 1;
                for (int j = 1; j <= p; j++) {
                    potencia = potencia * i;
                }
                resultat = resultat + potencia;
            }
            System.out.println("Resultat fórmula Faulhaber: " + resultat);
        }
      }while(n != 0 || p != 0);
        System.out.println("Fi del programa");
    }
}
