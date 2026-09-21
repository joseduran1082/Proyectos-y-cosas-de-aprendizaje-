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
public class Ex23_TaulaDivisioEntera {
        public static void main(String[] args) {
        
        long x = EntradaNumero();
      
        for (long i = 1; i <= 10 ; i++){
            long divisio = x / i,
            residu = x % i;
            System.out.println(x+ " / "+ i +": quocient = " + divisio +" i "
                                                        + "residu = "+ residu);
            }
        
       }
        public static long EntradaNumero(){
        Scanner sc  = new Scanner(System.in);
       
        long n;
        System.out.print("Dame un numero entero: ");
        
        while(!sc.hasNextLong()||(n = sc.nextLong()) < 0 ){
            System.out.print("Dame un numero entero: ");
            sc.nextLine();           
        
        }
            return n;
    }
}

