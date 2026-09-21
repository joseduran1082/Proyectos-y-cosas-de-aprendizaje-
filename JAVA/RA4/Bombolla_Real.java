/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA4;

import java.util.Arrays;

/**
 *
 * @author Jose
 */
public class Bombolla_Real {
    
    public static void main(String[] args) {
        
        int[] numeros = {2,4,1,8,7,5,9};
        OrdenacioBombollaPetitGran(numeros);
        
        Arrays.sort(numeros);
        
        MostrarArray(numeros);
                
              
    }
    public static void OrdenacioBombollaPetitGran(int[] numeros){
        for (int i = 1; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - i; j++) {
                if (numeros[j] > numeros[j +1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
    }
    public static void MostrarArray(int[] numeros){
        for (int num  : numeros) {
            System.out.print(num + " ");          
        }
        System.out.println("");
    }
}
