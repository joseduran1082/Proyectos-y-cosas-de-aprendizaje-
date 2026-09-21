/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.ra1.personatges;

import java.util.Locale;

/**
 *
 * @author Jose
 */
public class PRINTF {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double valor = 2.456744;
        double valor2 = 87.934242;
        
        System.out.printf("El valor es %.2f i Valor 2 es: %.3f\n", valor,valor2);
        
        int increment = 12;
        
        System.out.printf("L'incremetn es: %+d\n", increment);
        
        String texto = "joseito";
        
        System.out.printf("El joseito es: %s\n", texto);
    }
    
}
