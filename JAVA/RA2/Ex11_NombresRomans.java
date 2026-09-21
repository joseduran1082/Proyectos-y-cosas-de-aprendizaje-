package cat.copernic.m03.RA2;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
public class Ex11_NombresRomans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueixi un nombre natural entre 1 i 3999: ");
        int num = sc.nextInt();
        String romans = "";

        if (num < 1 || num > 3999) 
            romans = "ERROR";
        
        else {
            int milers = num / 1000;
            if (milers == 1) 
                romans = "M";
            else if (milers == 2) 
                romans = "MM";
            else if (milers == 3) 
                romans = "MMM";
           
            int centenes = (num % 1000) / 100;
            
            if (centenes == 1) 
                romans += "C";
            else if (centenes == 2) 
                romans += "CC";
            else if (centenes == 3) 
                romans += "CCC";
            else if (centenes == 4) 
                romans += "CD";
            else if (centenes == 5) 
                romans += "D";
            else if (centenes == 6) 
                romans += "DC";
            else if (centenes == 7) 
                romans += "DCC";
            else if (centenes == 8) 
                romans += "DCCC";
            else if (centenes == 9) 
                romans += "CM";
            
            int desenes = (num % 100) / 10;
            
            if (desenes == 1) 
                romans += "X";
            else if (desenes == 2) 
                romans += "XX";
            else if (desenes == 3) 
                romans += "XXX";
            else if (desenes == 4) 
                romans += "XL";
            else if (desenes == 5) 
                romans += "L";
            else if (desenes == 6) 
                romans += "LX";
            else if (desenes == 7) 
                romans += "LXX";
            else if (desenes == 8) 
                romans += "LXXX";
            else if (desenes == 9) 
                romans += "XC";
            
            int unitats = num % 10;
            
            if (unitats == 1) 
                romans += "I";
            else if (unitats == 2) 
                romans += "II";
            else if (unitats == 3) 
                romans += "III";
            else if (unitats == 4) 
                romans += "IV";
            else if (unitats == 5)
                romans += "V";
            else if (unitats == 6) 
                romans += "VI";
            else if (unitats == 7) 
                romans += "VII";
            else if (unitats == 8) 
                romans += "VIII";
            else if (unitats == 9) 
                romans += "IX";
        }

        System.out.println("El nombre romans és: " + romans);
    }
    
}
