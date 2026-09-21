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
public class ParellsSenars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame un numero: ");
        int numero = sc.nextInt();  
        int parells = 0;
        int senars = 0;
        for (int i = 1;i <= numero ;i++){
            if(i % 2 == 0)
               parells += i;
            else
                senars += i;
            
        }
        System.out.println("Parells: "+ parells);
        System.out.println("Senars: "+ senars);
        
    }
    
}
