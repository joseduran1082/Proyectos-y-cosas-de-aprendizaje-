/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA3;

import java.util.Scanner;

/**
 *
 * @author Jose
 */


public class EX10_MaximMinim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num;
        int maxim = 0, minim = 0;
        boolean primer = true;
        
        do {
            num = sc.nextInt();
            
            if(primer){
                maxim = num;
                minim = num;
                primer = false;
            }
            if (num != 0){
                if (num > maxim) maxim = num;
                if (num < minim) minim = num;
            }    
        }while (num != 0);
        System.out.println("Mínim: " + minim);
        System.out.println("Màxim: " + maxim);
    }
}