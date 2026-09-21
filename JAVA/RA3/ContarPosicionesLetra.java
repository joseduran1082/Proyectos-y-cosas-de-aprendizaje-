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

public class ContarPosicionesLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame una frase para buscar: ");
        String frase = sc.nextLine();

        System.out.print("Dame la letra a buscar: ");
        char letra = sc.nextLine().charAt(0);

        int pos = 0;
        boolean encontrada = true;

        while (pos != -1) {
            pos = frase.indexOf(letra, pos);
            if(pos != -1){
                System.out.println("Letra encontrada en la posición: " + pos);
                pos++;
            }else  
                encontrada = false;
            }
    }
}

