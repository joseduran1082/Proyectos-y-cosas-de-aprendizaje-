/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA3;

/**
 *
 * @author Jose
 */
public class ProgramaCotxes {
    public static void main(String[] args) {
       
        Cotxe elMeuCotxe = new Cotxe();
        elMeuCotxe.marca = "Peugeot";
        elMeuCotxe.model = "308";
        elMeuCotxe.matricula = "4567LWF";
        elMeuCotxe.numBastidor = "64564564HPR";
        elMeuCotxe.numPlaces = 5;
       
        Cotxe elCotxeDelMeuVei = new Cotxe("B4354JZ", "Renault", "Clio",
                "45345G", 3);
       
        System.out.println("La matrícula del cotxe del meu vei és: " +
                                                    elCotxeDelMeuVei.matricula);
       
        System.out.println("El total de places del meu cotxe és: " +
                                                      elMeuCotxe.numPlaces);
       
        elCotxeDelMeuVei.arrencar();
        elCotxeDelMeuVei.accelerar();
        elMeuCotxe.arrencar();
       
        String nom = new String("Manel");
        System.out.println("Nom: " + nom);
       
        int a = 5;
        String nom2 = "Gerard";
        String nom3 = new String("Manel");
       
        if (nom.equals (nom2)) {
            System.out.println("Noms iguals");
        } else {
            System.out.println("Noms diferents");
        }
        if(elMeuCotxe.equals(elCotxeDelMeuVei))
            System.out.println("Son iguals els cotxes");
        else
            System.out.println("Son diferents els cotxes");
        
        
        //Concatenacio de Strings 
        String nom5 = nom + nom2;
        System.out.println(nom5); // asi siempre lo hemos hecho 
        
        String nom4 = nom.concat (nom2); // manera nueva y mejor 
        System.out.println(nom4);
        
        System.out.println("Normativa ITV: "+ Cotxe.normativaITV());
        Cotxe.normativaITV();
        
        //substring
        String s = "EL meu PC no funciona";
        
        String pc = s.substring(7,9);
        System.out.println(pc);
       
       
    }
}
