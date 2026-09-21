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
public class Ex09_Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un numero: ");
        int primero = sc.nextInt();
        
        sc.nextLine();

        System.out.print("Introdueix una operacio (+,-,/,*): ");
        char op = sc.nextLine().charAt(0);
        
        System.out.print("Introdueix un altre: ");
        int segon = sc.nextInt();
        
        
        
        int resultat = 0;
        
        boolean opCorrecte = true;
        switch (op){
            case '+':
                resultat = (primero + segon);
                break;
            case '-':
                resultat = (primero - segon);
                break;
            case '*':
                resultat = (primero * segon);
                break;
            case '/':
                resultat = (primero / segon);
                break;
            default:
                System.out.println("Operacio incorrecta");
                opCorrecte = false;
        
        }
        if(opCorrecte)
            System.out.println("El resultat de la operacio es: " + primero + " " 
                                           + op +" "+ segon + " = "+ resultat );
    }
    
}
