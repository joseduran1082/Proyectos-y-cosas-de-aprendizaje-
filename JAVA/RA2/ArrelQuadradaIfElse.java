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
public class ArrelQuadradaIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault( Locale.GERMAN);
        
        System.out.print("Dame un numero para calcular su raiz cuadrada: ");
        //String numero = sc.nextLine();
        //double raiz_cuadrada = Math.sqrt(numero);
        
        double numero = input.nextDouble();
        double raiz = Math.sqrt(numero);

        if (input.hasNextDouble()) {
            if (numero < 0) {
                System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
            } else {
                System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
            }
        } else {
            System.out.println("Error: Debes ingresar un número válido.");
        }}    }