/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA4;

/**
 *
 * @author Jose
 */
public class Vehicle implements Comparable<Vehicle>{
    private String tipusVehicle;
    private String matricula;
    //private int metrosEslora;

    public Vehicle(String tipusVehicle, String matricula) {
        this.tipusVehicle = tipusVehicle;
        this.matricula = matricula;
    }

    public String getTipusVehicle() {
        return tipusVehicle;
    }

    public void setTipusVehicle(String tipusVehicle) {
        this.tipusVehicle = tipusVehicle;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String toString(){
        return "Tipus " + tipusVehicle + ", matricula: " + matricula;
    }
    @Override
    public int compareTo(Vehicle altreVehicle){
       return matricula.compareTo(altreVehicle.matricula);
    }
    
}
