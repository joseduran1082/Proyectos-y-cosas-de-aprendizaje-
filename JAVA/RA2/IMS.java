package cat.copernic.m03.RA2;


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
public class IMS {
    public static void main(String[] args) {
        Locale.setDefault( Locale.GERMAN);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix el Pes: ");        
        double pes = input.nextDouble();
        
        System.out.print("Introdueix l'alçada: ");        
        double alcada = input.nextDouble();
        
        double IMC = pes /( alcada * alcada);

        //if (input.hasNextDouble()) {
            if (IMC <= 16) 
                System.out.println("Corre al hospital");            
            else if (IMC <=17){
                   System.out.println("Infrapes");
            }
            else if (IMC <=18){
                   System.out.println("Pes baix");
            }
            else if (IMC <=25){
                   System.out.println("Pes normal");
            }
            else if (IMC <=30){
                   System.out.println("sobre pes de grau 1");
            }
        //} 
else {
            System.out.println("Error: Debes ingresar un número válido.");
        }
    }
}