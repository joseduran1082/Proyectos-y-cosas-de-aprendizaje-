/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA3;

/**
 *
 * @author Jose
 */
public class MultiplesDe5 {
    public static void main(String[] args) {
        final int N = 5;    
        final int MAX = 100; 

        System.out.println("Els múltiples de 5 majors que 1 i menors que 100 són:"
                                                                         + " ");
    for (int i = N; i < MAX; i += N) {
            System.out.print(i + " ");
        }
    }
}