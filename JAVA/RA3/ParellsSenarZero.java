package cat.copernic.m03.RA3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Jose
 */

public class ParellsSenarZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaParells = 0;
        int sumaSenars = 0;

        int n = sc.nextInt();  

        while (n != 0) {
            if (n % 2 == 0) {
                sumaParells += n;
            } else {
                sumaSenars += n;
            }
            n = sc.nextInt();   
        }
        System.out.println("La suma dels parells introduïts és: " + sumaParells);
        System.out.println("La suma dels senars introduïts és: " + sumaSenars);
    }
}
