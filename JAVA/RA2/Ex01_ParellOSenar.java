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
public class Ex01_ParellOSenar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame un numero: ");
        int numero = sc.nextInt();
        
        if(numero % 2 == 0)
            System.out.println("El nombre es parell");
        else
            System.out.println("El nombre es senar");
    }
    
}
