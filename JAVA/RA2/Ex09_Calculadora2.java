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
public class Ex09_Calculadora2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un número: ");
        int n1 = sc.nextInt();
        
        System.out.print("Introdueix un altre: ");
        int n2 = sc.nextInt();
        sc.nextLine(); // consumir el salt de línea important

        
        System.out.print("Introdueix una operació (+,-,*,/): ");
        char op = sc.nextLine().charAt(0);
         
        int r = 0;
        switch(op){
            case '+':
                r = suma(n1,n2);
                break;
            case '-':
                r = resta(n1,n2);
                break;
            case '*':
                r = multi(n1,n2);
                break;
            case '/':
                r = divi(n1,n2);
                break;
            default:
                System.out.println("Operació incorrecta!");
                break;
        }
        System.out.println("El resultat és: "+ r);
    }
    public static int suma(int a, int b){
        int resultat = a + b;
        return resultat;
    }
    public static int resta(int a, int b){
        int resultat = a - b;
        return resultat;
    }
    public static int multi(int a, int b){
        int resultat = a * b;
        return resultat;
    }
    public static int divi(int a, int b){
        int resultat = a / b; 
        return resultat;
    }
}
