package cat.copernic.m03.RA4;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose
 */
public class arrayDinamicCotxesProva {
    public static void main(String[] args) {
        arrayDinamicCotxes cotxes=new  arrayDinamicCotxes(4);
       
       
        cotxes.addCotxe(new Cotxe("Seat",2023,1800));
        cotxes.addCotxe(new Cotxe("Tesla",2026,0));
        cotxes.addCotxe(new Cotxe("BMW",2003,2100));
     
       
       
        cotxes.addCotxe(new Cotxe("Chevrolet",1993,2000));
          System.out.println("Abans d'afegir Toyota la mida és: "+ cotxes.size());
        cotxes.addCotxe(new Cotxe("Toyota",2016,1300));
        System.out.println("Despres d'afegir Toyota la mida és: "+ cotxes.size());
        
        System.out.println("Eliminant el 3er cotxe...");
        cotxes.remove(3);
        cotxes.mostrarArrayCotxes();
        Cotxe c = cotxes.get(4);
        
        c = new Cotxe("BMW", 2003, 2100);
        int pos = cotxes.contains(c);
        System.out.println("Posicio: "+  pos);
        
        ArrayList<Cotxe> alCotxes = new ArrayList<>();
        System.out.println("Mida inicial : "+ alCotxes.size());
        alCotxes.add(new Cotxe("Seat",2023,1800));
        alCotxes.add(new Cotxe("Tesla",2026,0));
        alCotxes.add(new Cotxe("BMW",2003,2100));
        System.out.println("Mida actual: "+ alCotxes.size());
    }
}