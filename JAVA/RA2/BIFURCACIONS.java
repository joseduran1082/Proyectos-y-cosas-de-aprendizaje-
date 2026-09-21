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
public class BIFURCACIONS {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Endevina un número: ");
    int valor;
    int numero = 20;
    valor = entrada.nextInt();
    if (valor == numero){       
        System.out.println("Enhorabona!!! L'has endevinat!");   
    } 
    else{
        System.out.println("No has endevinat");
        if (valor < numero){
        System.out.println("el numero es mes petit");

        }
        else if (valor > numero){
        System.out.println("Massa gran");
        }}
    }
  
   }


