package cat.copernic.m03.RA2;

import java.util.Scanner;

public class Ex10_DiaSetmana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix un nombre del 1 al 7: ");
        int numero = sc.nextInt();

        String dia;

        switch (numero) {
            case 1:
                dia = "dilluns";
                break;
            case 2:
                dia = "dimarts";
                break;
            case 3:
                dia = "dimecres";
                break;
            case 4:
                dia = "dijous";
                break;
            case 5:
                dia = "divendres";
                break;
            case 6:
                dia = "dissabte";
                break;
            case 7:
                dia = "diumenge";
                break;
            default:
                dia = "incorrecte";
                break;
        }

        System.out.println("El dia de la setmana és: " + dia + ".");
    }
}
