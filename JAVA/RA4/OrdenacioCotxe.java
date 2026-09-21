package cat.copernic.m03.RA4;

import java.util.Arrays;

public class OrdenacioCotxe {

    public static void main(String[] args) {
        
        Cotxe[] cotxes = getCotxe();
        
        ordenaBombolla(cotxes);

        //ordenacioBombolla(cotxes);
        Arrays.sort(cotxes);
        
        //Mostra array de cotxes
        System.out.printf("***Llistat de cotxes***\n");
        for(Cotxe c : cotxes){
            System.out.println(c);
            System.out.println();
        }
        
        /*OrdenacioCotxe programa = new OrdenacioCotxe();
        programa.executarPrograma();*/
    }
    /*
    
   
    void executarPrograma(){
        
    }
*/
    void executarPrograma(){
        mostrarMissatge();
    }
    
    static void mostrarMissatge(){
        System.out.println("Executando programa...");
    }
    public static void ordenaBombolla( Cotxe[] cotxes) {
        // Ordenació bombolla de més petit a més gran
        for (int passades = 1; passades < cotxes.length; passades++) {
            for (int j = 0; j < cotxes.length - passades; j++) {
                if (cotxes[j].compareTo(cotxes[j + 1]) > 0) {
                    Cotxe aux = cotxes[j];
                    cotxes[j] = cotxes[j + 1];
                    cotxes[j + 1] = aux;
                }
            }
        }
    }
    
    public static Cotxe[] getCotxe(){
        Cotxe cotxe1 = new Cotxe("Tesla",2025,1490);
        //cotxe1.urlNormativa = "https://dgt.es/.."; // MALLLLLL 
        Cotxe.urlNormativa = "https://dgt.es/..";
        Cotxe[] cotxes = new Cotxe[5];
        cotxes[0] = cotxe1;
        cotxes[1] = new Cotxe("Toyota",2023,900);
        cotxes[2] = new Cotxe("BMW",2022,2000);
        cotxes[3] = new Cotxe("Chevreolete",2024,1200);
        cotxes[4] = new Cotxe("SEAT",2019,900);
        
        return cotxes;
    }
}