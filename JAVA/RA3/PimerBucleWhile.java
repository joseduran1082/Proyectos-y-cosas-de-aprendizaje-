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
public class PimerBucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("¿Cuántos rectángulos vas a introducir?: ");
/*
        boolean continuar = true;
        for (;continuar;) {  
           int x = sc.nextInt();  
           int y = sc.nextInt();  
            if(x >= 0 && y >= 0)
                System.out.println(2*(x + y));
            else
                continuar = false;
       */             
            
            //System.out.println("Perímetro del rectángulo " + i + ": " + perimetro);
            
            boolean continuar = true;
            while(continuar){
                int x = sc.nextInt();  
                int y = sc.nextInt();  
                if(x >= 0 && y >= 0)
                    System.out.println(2*(x + y));
                else
                    continuar = false;
        }

    }
}
