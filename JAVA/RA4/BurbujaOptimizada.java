/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA4;

import java.util.Scanner;

public class BurbujaOptimizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[7];
        boolean intercambio;

        // 1️⃣ Llenar el arreglo
        System.out.println("Ingresa 7 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }

        // 2️⃣ Ordenamiento burbuja optimizado
        for (int i = 0; i < numeros.length - 1; i++) {
            intercambio = false;

            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    intercambio = true;
                }
            }

            if (!intercambio) {
                break; 
            }
        }

        // 3️⃣ Mostrar resultado
        System.out.println("Arreglo ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
