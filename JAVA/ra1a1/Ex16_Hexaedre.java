
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
public class Ex16_Hexaedre {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Dame la aresta: ");
        
        double aresta = sc.nextDouble();
       
        double volum = aresta * aresta * aresta;
        System.out.printf("El volumen es:  %.2f \n" , volum);
        
        double superficie = 6 * aresta * aresta;
        System.out.printf("La superficie es:  %.2f \n" , superficie);


    }
    
}
