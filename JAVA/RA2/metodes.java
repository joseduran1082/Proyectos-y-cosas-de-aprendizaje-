package cat.copernic.m03.RA2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
public class metodes {
    public static void main(String[] args) {
        int valor = 5;
        int elevatQuadrat = quadrat(valor);
        
        System.out.println(elevatQuadrat);
        
        int mesGran = elMesGran(4,9);
        System.out.println(mesGran);
    }
    public static int quadrat(int a) {
            int resultat = a*a;
            return resultat;
    }
    public static int elMesGran(int a, int b) {
        int resultat;
        if (a > b)
            resultat = a;
        else
            resultat = b;
        return resultat;
    }
}
