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
public class DarUnNumeroYmultiplicar {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame un numero del 1 al 10: ");
        int numero = sc.nextInt();
        for(int i = 1; i <= 10; i++)
            System.out.println(numero + " x "+ i +" = " + numero * i );
            
        
    }
    
}
