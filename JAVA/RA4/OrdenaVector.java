package cat.copernic.m03.RA4;

import java.util.Arrays;

/**
 *
 * @author Jose
 */
public class OrdenaVector {
    public static void main(String[] args) {
        int[] v = generarVector(600);
        mostraVector(v);
        //ordenaBombolla(v);
        //Arrays.sort(v);
        OrdenacioPorSeleccio(v);
        mostraVector(v);
    }
    public static int[] generarVector(int numElements){
        int[] vector = new int [numElements];
        for(int i = 0 ; i < vector.length; i++)
            vector[i] = vector.length-i;
        return vector;
        
    }

    public static void mostraVector(int[] vector){
        System.out.print("{");
        for(int i = 0 ; i < vector.length; i++){
            System.out.print(vector[i]);
            if(i < vector.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
    }

    public static void ordenaBombolla(int[] numeros){
        int passades = 0;
        for (int i = 1; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - i; j++) {
                passades++;
                if (numeros[j] > numeros[j +1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
            System.out.println(passades);
        }
    }
    public static void OrdenacioPorSeleccio(int[] lista){
        int passades = 0;
        for (int i = 1; i < lista.length; i++) {
            int minimo = i - 1;
            for (int j = i ; j < lista.length; j++) {
                passades++;
                if (lista[j] < lista[minimo]) {
                    minimo = j;
                }
            }
            // Intercambiar elementos
            int temp = lista[i-1];
            lista[i-1] = lista[minimo];
            lista[minimo] = temp;
        }
        System.out.println(passades);
    }

}