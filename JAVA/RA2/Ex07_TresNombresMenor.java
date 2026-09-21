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
public class Ex07_TresNombresMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digueu un nombre: ");
        int a = sc.nextInt();
        
        System.out.print("Digueu un altre: ");
        int b = sc.nextInt();
        
        System.out.print("Digueu un altre: ");
        int c = sc.nextInt(); 
        int menor = a;
        if (b < menor) 
            menor = b;
        if (c < menor) 
            menor = c;
        
        System.out.println("El més petit és: " + menor);
    }
}
