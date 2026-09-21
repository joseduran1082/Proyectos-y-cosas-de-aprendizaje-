package m03.ra4;

import java.util.Arrays;

public class Ex01_OrdenaVector {
    public static void main(String[] args) {

        int numElements = 6;

        int[] vector1 = generaVector(numElements);
        int[] vector2 = generaVector(numElements);
        int[] vector3 = generaVector(numElements);

        System.out.println("Vector original:");
        mostraVector(vector1);

        System.out.println("\n--- Ordenació per Selecció ---");
        ordenaSeleccio(vector1);
        mostraVector(vector1);

        System.out.println("\n--- Ordenació per Bombolla ---");
        ordenaBombolla(vector2);
        mostraVector(vector2);

        System.out.println("\n--- Ordenació amb Arrays.sort() ---");
        Arrays.sort(vector3);
        mostraVector(vector3);
    }

    // Genera un vector amb valors de numElements a 1
    public static int[] generaVector(int numElements) {
        int[] vector = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            vector[i] = numElements - i;
        }

        return vector;
    }

    // Mostra el vector per pantalla
    public static void mostraVector(int[] vector) {
        System.out.print("{ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("}");
    }

    // Ordenació per selecció
    public static void ordenaSeleccio(int[] vector) {
        int passades = 0;
        int n = vector.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (vector[j] < vector[minIndex]) {
                    minIndex = j;
                }
            }

            // Intercanvi
            int temp = vector[i];
            vector[i] = vector[minIndex];
            vector[minIndex] = temp;

            passades++;
        }

        System.out.println("Passades realitzades: " + passades);
    }

    // Ordenació per bombolla
    public static void ordenaBombolla(int[] vector) {
        int passades = 0;
        int n = vector.length;
        boolean intercanvi;

        for (int i = 0; i < n - 1; i++) {
            intercanvi = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                    intercanvi = true;
                }
            }

            passades++;

            if (!intercanvi) {
                break;
            }
        }

        System.out.println("Passades realitzades: " + passades);
    }
}