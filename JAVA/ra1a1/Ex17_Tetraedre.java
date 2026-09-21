
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Jose
 */
public class Ex17_Tetraedre {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Dame la aresta: ");
        
        double aresta = sc.nextDouble();
       
        double volum = aresta * aresta * aresta / (6 * Math.sqrt(2));
        System.out.printf("El volumen es:  %.2f \n" , volum);
        
        double superficie = Math.sqrt(3)*aresta*aresta;
        System.out.printf("La superficie es:  %.2f \n" , superficie);

    }
    
}
