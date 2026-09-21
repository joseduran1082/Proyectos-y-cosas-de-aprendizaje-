/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cat.copernic.m03.RA4;

/**
 *
 * @author Jose
 */
public class arrayDinamicCotxes {
    private final int midaDefecte= 10;
     private Cotxe[] cotxes;
     private int indexPrimeraPosLliura;
     
     public arrayDinamicCotxes(){
       cotxes=new Cotxe[midaDefecte];
       indexPrimeraPosLliura=0;
    }
     public arrayDinamicCotxes(int mida){
       cotxes=new Cotxe[mida];
       indexPrimeraPosLliura=0;
       
    }
     public void addCotxe(Cotxe cotxe){
         if(indexPrimeraPosLliura==cotxes.length){
             resize();
         }
         cotxes[indexPrimeraPosLliura++]=cotxe;
         //indexPrimeraPosLliura++;
    }
     public void resize(){
         Cotxe[] cotxes2=new Cotxe[(int)(cotxes.length*1.5)];
         for(int i=0;i<cotxes.length;i++){
             cotxes2[i]=cotxes[i];
         }
         cotxes=cotxes2;
     }
     public int size(){
         
         return cotxes.length;
     }
     public int numElements(){
         return indexPrimeraPosLliura;
}
     public void remove(int index){
         for (int i = index; i < indexPrimeraPosLliura-1; i++) {
             cotxes[i] = cotxes[i+1];
         }
         indexPrimeraPosLliura--;
     }
    public void mostrarArrayCotxes(){
        System.out.println("***ARRAY DE COTXES***");
        for(int i=0;i< indexPrimeraPosLliura;i++){
            System.out.println(cotxes[i]);
            System.out.println("------------------");
        }
    }
    public Cotxe get(int index){      
        Cotxe valorRetorn = null;
        if (index < indexPrimeraPosLliura) 
            valorRetorn = cotxes[index];
        
            return valorRetorn;
        
    }
    public void clear(){
       indexPrimeraPosLliura = 0;
    }
    public int contains(Cotxe c){
        /*boolean trobar = false;
        int pos = -1;
        for (int i = 0; i < indexPrimeraPosLliura && !trobar; i++) {
            if(cotxes[i].equals(c)){
                trobar = true;
                pos = i;
            }
        }*/
        for (int i = 0; i < indexPrimeraPosLliura; i++) {
            if(cotxes[i].equals(c))
                return i ;
        }
        return -1;

    }
   
   
}
