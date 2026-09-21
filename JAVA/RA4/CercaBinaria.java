/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03.ra4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lalva
 */
public class CercaBinaria {
    public static void main(String[] args) {
        
        //int[] valors = {5,3,2,4,8,21,9};
        int[] valors = Ordenacio.getValors(10);
        Arrays.sort(valors);
        
        for(int v  : valors){
            System.out.print(v + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Valor que vols trobar a l'array: ");
        int valor = sc.nextInt();
        
        //int pos = cercaSequencial (valor,valors);
        int pos = cercaBinariaValor(valor,valors);
        
        if (pos > 0){
            System.out.println("Valor trobat a la posició: "+ pos);
        } else {
            System.out.println("Valor no trobat.");
        }
        
    }
    
    public static int cercaBinariaValor(int valor, int[] valors){
        int totalPassades = 0;
        int posIni = 0, posFin = valors.length - 1;
        int puntMig = -1;
        boolean trobat = false;
        while(posIni <= posFin){
            totalPassades++;
            puntMig = (posIni + posFin) / 2;
            if(valors[puntMig] < valor){
                posIni = puntMig + 1;
            } else if(valors[puntMig] > valor){
                posFin = puntMig - 1;
            } else {
                trobat = true;
                break;
            }
        }
        System.out.println("Total passades: " + totalPassades);
        if(trobat){
            return puntMig;
        } else {
            return -1;
        }
    }
    
    
    
    public static int cercaSequencial(int valor, int[] valors){
        
        int totalPassades = 0;
        int posicio = -1;
        for(int i = 0; i < valors.length && (posicio == -1); i++){
            totalPassades++;
            if(valors[i] == valor)
                posicio = i;
        }
        System.out.println("Total passades: "+ totalPassades);
        return posicio;
    }
}
