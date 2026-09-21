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
public class Ex08_NotaLiteral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix una nonta de 0 a 10: ");
        int nota = sc.nextInt();
        
        if (nota <= 0 || nota <=2)
            System.out.println("Molt deficient");
        
        else if(nota < 3 || nota <=4)
            System.out.println("Insuficient");
        
        else if (nota <=5 || nota < 6)
            System.out.println("Suficient");
        
        else if (nota <=6)
            System.out.println("Be");
        
        else if (nota <=7 || nota <=8)
            System.out.println("Notable");
        
        else if (nota <= 9 || nota <=10)
            System.out.println("Exelent");
        else 
            System.out.println("Introduce una nota correcta entre 0 i 10");
            
    }
    
}
