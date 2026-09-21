/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA3;

/**
 *
 * @author Jose
 */
public class CalcularPorcentajeTAE {
    public static void main(String[] args) {
        double quantitatInicial = 100.0;
        double quantitat = quantitatInicial;
        double porcentaje = 2.0;
        int any = 0;
        /*
        for(int i = 1;quantitat <= quantitatInicial*2;i++){
             quantitat += quantitat * porcentaje / 100;
             any++;
             System.out.printf("%.2f\n",quantitat);
             System.out.println(any);
        }
       */     
            
        do {
            any++;         
            quantitat += quantitat * porcentaje /100;
            System.out.printf("%.2f\n",quantitat);
            System.out.println(any);
    }while(quantitat <= quantitatInicial*2);
              
      
       
    }
}
