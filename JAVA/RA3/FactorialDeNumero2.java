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
public class FactorialDeNumero2 {
        public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       
        long n = -1;
        System.out.print("Dame un numero entre [0 - 20]: ");
        
        while(!sc.hasNextLong()||(n = sc.nextLong()) < 0 || n  > 20){
            System.out.print("Dame un numero entre [0 - 20]: ");
            sc.nextLine();           
        }
        
        /*while(n < 0){
            System.out.print("Dame un numero: ");
            n = sc.nextInt();
        }
        */
        /*
        int n;
        do{
            System.out.print("Dame un numero: ");
            n = sc.nextInt();
        }while(n < 0);*/
        long factorial = 1;
        for (long i = 1; i <= n; i++){
            factorial *= i; 
            }
        System.out.println("El factorial es: " + factorial);
       }
 }

