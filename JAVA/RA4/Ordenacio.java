/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m03.ra4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 *
 * @author lalva
 */
public class Ordenacio {

    public static void main(String[] args) {

                
        int[] valors = getValors(10);
        System.out.println("Vector abans d'ordenar");
        //mostraValors(valors);
        
        long tempsInicial = System.currentTimeMillis();
        ordenacioBombolla(valors);                
        
        long tempsFinal = System.currentTimeMillis();
        
        System.out.println("Vector després d'ordenar");
        //mostraValors(valors);
        
        System.out.println("Temps total (ms): " + (tempsFinal-tempsInicial));
    }
    
    
    static int[] getValors(int n) {

        int[] vector = new int[n];
        
        BufferedReader entrada = null;
        try {            
            entrada = new BufferedReader(
                                 new FileReader("valors.txt")); 
        
            
            
            for (int i = 0; i < n; ++i) {
                vector[i] = Integer.parseInt(entrada.readLine());
            }
            
            entrada.close();
            
        } catch (Exception e) {
            System.out.println("S'ha produit un error!");
        } finally {
            try {
                entrada.close();
            } catch (Exception e) {
                System.out.println("No s'ha pogut tancar el fitxer!");
            }
        }

        return vector;
    }
    
    
    static void mostraValors(int[] valors) {
        for (int i = 0; i < valors.length; ++i) {
            System.out.println(valors[i]);
        }
        System.out.println("");        
    }

    
    
    static void ordenacioBombolla(int[] v) {        
        for (int i = 1; i < v.length;++i) {
            for (int j = 0; j < v.length-i; ++j) {                
                if (v[j] > v[j+1]) {
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                }
            }
        }
    }
    
    
}