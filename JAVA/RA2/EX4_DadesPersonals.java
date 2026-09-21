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
public class EX4_DadesPersonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digueu el nom...............................: ");
        String nom = sc.nextLine();
        
        System.out.print("Digueu l'edat...............................: ");
        int edat = sc.nextInt();
        sc.nextLine(); // consumir el salt de línea important
        
        System.out.print("Digueu l'adreça.............................: ");
        String adreca = sc.nextLine();
        
        System.out.print("Digueu el telèfon...........................: ");
        String num = sc.nextLine();
        
        System.out.print("Digueu el sexe [Home/Dona]..................: ");
        String sexe = sc.nextLine().toLowerCase().trim();
        
        String majorMenor = (edat >= 18) ? "major d'edat" : "menor d'edat";
        /*
        String major;
        if (edat >= 18) {
            major = "major d’edat";
        } else {
            major = "menor d’edat";
        }
        */
        /*
        String genere = "";
        if (sexe.equals("home") )
            genere = "home";
        else if (sexe.equals("dona"))
            genere = "dona";
        */
        
        System.out.printf("Em dic %s, tinc %d anys (%s), soc %s la meva adreça "
                + "es \"%s\". El meu telèfon és %s.%n",
                nom, edat, majorMenor, sexe, adreca, num);
    }
}