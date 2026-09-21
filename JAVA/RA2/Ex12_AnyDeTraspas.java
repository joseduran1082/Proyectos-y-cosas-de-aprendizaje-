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
public class Ex12_AnyDeTraspas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introdueix un any: ");
        int any = sc.nextInt();
        
        if(esAnyDeTraspas(any) == true)
            System.out.println("L'any " + any + " és de traspas");
        else
            System.out.println("L'any " + any + " NO és de traspas" );
           
    }
    public static boolean esAnyDeTraspas(int any){
        //boolean anyTraspas;
        //OPCION A = boolean anyTraspas = (any % 4 == 0 && any % 100 != 0 || any % 400 == 0);
        /*if(any % 4 == 0 && any % 100 != 0 || any % 400 == 0){
            anyTraspas = true;       
        }*/
       /*Opcion B*/ 
       return (any % 4 == 0 && (any % 100 != 0) || (any % 400 == 0));
    }
}