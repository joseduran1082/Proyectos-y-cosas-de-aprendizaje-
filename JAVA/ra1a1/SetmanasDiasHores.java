package cat.copernic.m03.ra1.personatges;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class SetmanasDiasHores {
    public static void main(String[] args) {
        
  
        Locale.setDefault(Locale.US);
        
        Scanner teclat = new Scanner(System.in); 
        
// Line MOOOOLT NECESARIA PERO MOOOLT
        
        
        System.out.print("Introdueix el num de hores: ");
        
        int hores =  teclat.nextInt();
        
        int setmanas = hores / 7 / 24;
        
        int dies = (hores - setmanas * (7*24)) / 24;
        
        int horesRestants = hores % 24;
        
        System.out.println("El numero de semanas es: " + setmanas);
       
        
        System.out.println("Els dies son: " + dies );
        
        System.out.println("Les hores son: " + horesRestants);
        
        
        


        
        
      }
}
