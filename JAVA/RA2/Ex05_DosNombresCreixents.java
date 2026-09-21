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
public class Ex05_DosNombresCreixents {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Introdueix un nombre enter: ");
        
        int a = sc.nextInt();
        
        System.out.print("Introdueix un altre enter: ");
        
        int b = sc.nextInt();
        
        
        if (a > b){
            System.out.println("Els teus nombres en ordre creixent són: "+b+
                                                                        "," +a);
        }
        else if (b > a){
            System.out.println("Els teus nombres en ordre creixent són: "+a+
                                                                        "," +b);
        }
        
            
        
        
    
    
    }
        
}
