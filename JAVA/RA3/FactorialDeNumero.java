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
public class FactorialDeNumero {
        public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        
        System.out.print("Dame un numero: ");
        
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++){
            factorial *= i; 
            }
        System.out.println(factorial);
       }
 }

