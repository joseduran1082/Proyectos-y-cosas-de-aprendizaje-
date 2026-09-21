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
public class Endevinar2 {
    public static void main(String[] args) {
        final int max = 10;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero entre 1 y "+ max + " :" );
        
        int valorEndevinar = (int)(Math.random()*max + 1);
        
        boolean endevinat = false;
        int intents = 0;
        do{
            System.out.print("Resposta: ");
            int resposta = sc.nextInt();
            
            if(resposta == valorEndevinar){
                System.out.println("Correcte!!");
                endevinat = true;
                
            }else{
                System.out.println("Incorrecte Proba de nou: ");
                if(resposta < valorEndevinar)
                    System.out.println("Es mes gran");
                else
                    System.out.println("Es mes petit");
            }
            intents++;   
        }while(!endevinat);
        
        System.out.println("Numero de intents: "+ intents);
    }
}
