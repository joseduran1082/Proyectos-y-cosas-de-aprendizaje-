/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA4;

/**
 *
 * @author Jose
 */
public class CotxesStatic {
    public static void main(String[] args) {
        Cotxe[] cotxes = OrdenacioCotxe.getCotxe();
        
       // Cotxe cotxe0 = cotxes[0];
        
        Cotxe.setUrlNormativa("https://dgt.es/..");
        
        System.out.println(cotxes[0].urlNormativa);
    }
}
