/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1.personatges;

/**
 *
 * @author Jose
 */
public class EXERCICIOPERACIONS {
    
    public static void main(String[] args) {
        int quantitat = 42;
        int delta = 5; 
        int residu = 0;
        
        String nom = "Joan";
        
        System.out.println("Hola, em dic " + nom);
        
        quantitat = quantitat += delta;
        System.out.println("La quantitat es: " + quantitat);
        System.out.println(quantitat);
        
        residu = quantitat % 2 ;
        System.out.println(residu);
        
        quantitat %= 5;
        System.out.println(quantitat);
        
        residu = --quantitat;
        System.out.println(residu);

        quantitat = delta++;
        System.out.println(quantitat);
        
        quantitat = ++delta;
        System.out.println(quantitat);
        
        quantitat *= delta = quantitat;
        System.out.println(quantitat);
        
        quantitat = quantitat /7;
        System.out.println(quantitat);
        
        String bonaTarda = "bona " + "tarda";
        System.out.println(bonaTarda);


        
    }
    
}
