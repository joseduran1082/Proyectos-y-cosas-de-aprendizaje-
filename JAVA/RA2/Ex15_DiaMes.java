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
public class Ex15_DiaMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Mes: ");
        int mes = sc.nextInt();
       
        if(mes >= 1 && mes <= 12){
            if(mes == 2)
                System.out.println("Numero de dies: 28");
            else if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
                System.out.println("Numero de dies: 30");
            else
                System.out.println("Numero de dies: 31");
    }
        else
            System.out.println("Mes incorrecte. ");
   }  
}
