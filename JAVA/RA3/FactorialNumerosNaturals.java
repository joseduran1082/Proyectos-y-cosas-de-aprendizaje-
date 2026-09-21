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
public class FactorialNumerosNaturals {
        public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
        
        //System.out.print("Dame un numero: ");
        
        //int n = sc.nextInt();%
        for(int n = 1; n <= 10; n++)
            System.out.printf("%d! = %d\n",n,CalculaFactorial(n));      
    }
        public static int CalculaFactorial(int n){
            int factorial = 1;
            for (int i = 1; i <= n; i++){
                factorial *= i; 
                }
            return factorial;
        }               
}