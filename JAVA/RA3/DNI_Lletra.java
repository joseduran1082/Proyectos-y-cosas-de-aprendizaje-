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

public class DNI_Lletra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni;

        // Bucle para pedir un DNI válido
        do {
            System.out.print("Introdueix un DNI (8 dígits): ");
            dni = sc.nextInt();

            if (dni < 10000000 || dni > 99999999) {
                System.out.println("El DNI ha de tenir 8 dígits.");
            }
        } while (dni < 10000000 || dni > 99999999);

        // Calcular la letra usando switch-case
        int residu = dni % 23;
        char lletra;

        switch (residu) {
            case 0: lletra = 'T'; break;
            case 1: lletra = 'R'; break;
            case 2: lletra = 'W'; break;
            case 3: lletra = 'A'; break;
            case 4: lletra = 'G'; break;
            case 5: lletra = 'M'; break;
            case 6: lletra = 'Y'; break;
            case 7: lletra = 'F'; break;
            case 8: lletra = 'P'; break;
            case 9: lletra = 'D'; break;
            case 10: lletra = 'X'; break;
            case 11: lletra = 'B'; break;
            case 12: lletra = 'N'; break;
            case 13: lletra = 'J'; break;
            case 14: lletra = 'Z'; break;
            case 15: lletra = 'S'; break;
            case 16: lletra = 'Q'; break;
            case 17: lletra = 'V'; break;
            case 18: lletra = 'H'; break;
            case 19: lletra = 'L'; break;
            case 20: lletra = 'C'; break;
            case 21: lletra = 'K'; break;
            case 22: lletra = 'E'; break;
            default: lletra = '?';
        }
        System.out.println("La lletra corresponent al DNI és: " + lletra);
    }
}
