/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1.personatges;

/**
 *
 * @author Jose
 */
public class CALCULODOUBLES {
    public static void main(String[] args) {
        int a = 2;
        double b = 3.0;
        float c = (float) (20000*a/b + 5);
        System.out.println("Valor en format float: " + c);
        System.out.println("Valor en format double: " + (double) c);
        System.out.println("Valor en format byte: "+ (byte) c);
        System.out.println("Valor en format short: "+ (short) c);
        System.out.println("Valor en format int: " + (int) c);
        System.out.println("Valor en format long: "+ (long) c);

        int enter = 300;
        byte b1 = (byte) enter;

        System.out.println(b1);

        int divident = 14, divisor = 3;

        System.out.println("cocient: " + divident / divisor );
        System.out.println("residu: " + divident % divisor );

        int nouValor = ++divisor;
        System.out.println(nouValor);

        int valor = 5;
        valor += 3;
        System.out.println(valor);

        valor = 2;

        valor -=3;
        System.out.println(valor);
        
        valor = 5;
        
        valor *= 2;
        
        System.out.println(valor);
        
        valor = 4;
        
        valor /= 2;
        
        System.out.println(valor);
        
        valor = 4;
        
        valor %= 2;
        
        System.out.println(valor);
        
        




    }
}
