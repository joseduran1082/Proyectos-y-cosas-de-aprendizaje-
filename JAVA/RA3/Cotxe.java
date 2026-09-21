/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA3;

/**
 *
 * @author Jose
 */
public class Cotxe {
   
    String matricula;
    String marca;
    String model;
    String numBastidor;
    int numPlaces;
   
    public Cotxe() {
        matricula = "0000AAA";
    }
    public Cotxe(String matricula, String marca, String model,
            String numBastidor, int numPlaces) {
        this.matricula   = matricula;
        this.marca       = marca;
        this.model       = model;
        this.numBastidor = numBastidor;
        this.numPlaces   = numPlaces;
    }
    public void arrencar() {
        System.out.printf("Arrencat el cotxe de matricula: %s. \n", this.matricula);
    }
    public void frenar() {
        System.out.printf("Frenant el cotxe de matricula: %s. \n", this.matricula);
    }
    public void accelerar() {
        System.out.printf("Accelerant el cotxe de matricula: %s. \n", this.matricula);
    }
    public static String normativaITV(){
        return "la ITV l'han de pasar vehicles de xx anys...";
    }
}
