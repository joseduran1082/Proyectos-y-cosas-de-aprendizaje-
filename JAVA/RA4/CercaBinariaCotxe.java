/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA4;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author lalva
 */
public class CercaBinariaCotxe {
    public static void main(String[] args) {
        Cotxe[] cotxes = cat.copernic.m03.RA4.OrdenacioCotxe.getCotxe();
                
        Arrays.sort(cotxes);
        
        //Mostra array de cotxes
        System.out.printf("***Llistat de cotxes***\n");
        for(Cotxe c : cotxes){
            System.out.println(c);
            System.out.println();
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Any del cotxe: ");
        int any = sc.nextInt();
        
        System.out.print("Marca del cotxe: ");
        String marca = sc.next();
        
        System.out.print("Introdueix la cilindrada d'un cotxe: ");
        int cilindr = sc.nextInt();
        
        int pos = cercaBinariaCotxe(new Cotxe(marca,any,cilindr),cotxes);
        if(pos >= 0){
            System.out.println("Trobat a la posició: "+ pos);
            System.out.println(cotxes[pos]);
        }else{
            System.out.println("No trobat!");
        }
    }

    
    public static int cercaBinariaCotxe(Cotxe cotxe, Cotxe[] cotxes){
        int totalPassades = 0;
        int posIni = 0, posFin = cotxes.length - 1;
        int puntMig = -1;
        boolean trobat = false;
        while(posIni <= posFin){
            totalPassades++;
            puntMig = (posIni + posFin) / 2;
            if(cotxes[puntMig].compareTo(cotxe) < 0){
                posIni = puntMig + 1;
            } else if(cotxes[puntMig].compareTo(cotxe) > 0){
                posFin = puntMig - 1;
            } else {
                trobat = true;
                break;
            }
        }
        System.out.println("Total passades: " + totalPassades);
        if(trobat){
            return puntMig;
        } else {
            return -1;
        }
    }
}
