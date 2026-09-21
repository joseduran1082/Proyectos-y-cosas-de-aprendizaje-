/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1a1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Ex08_Rectangle {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix l'alçaca del rectangle: ");
        float alcada = sc.nextFloat();
        
        System.out.print("Introdueix l'amplada del rectangle: ");
        float amplada = sc.nextFloat();
        
        float perimetre = 2* alcada + 2* amplada;
        System.out.println("El perimetre es: "+ perimetre);
        
        float area = alcada * amplada;
        System.out.println("El area es: " + area);

        
        
    }
    
}
