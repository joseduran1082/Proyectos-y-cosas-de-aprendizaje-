package cat.copernic.m03.RA4;

public class Cotxe implements Comparable<Cotxe> {
    private String  marca;
    private int     anyFabricacio;
    private int     marxa;
    private int     cilindrada;
    private static String urlNormativa;

    public Cotxe(String marca, int any, int cilindrada) {
        //this.marca = marca;
        //anyFabricacio = any;
        marxa = 0;
        setMarca(marca);
        setAnyFabricacio(any);
        setCilindrada(cilindrada);

    }
    public void arrencar(){
        marxa = 1;
        System.out.println("Cotxe arrencat... ");
    }

    //Setters
    public void setMarca(String m){
        marca = m;
    }

    public void setAnyFabricacio(int any){
        if (any > 1800)
            anyFabricacio = any;
        else
            System.out.println("Error: any incorrecte!!");
    }
    
    public void setMarxa(int marxa) {
        this.marxa = marxa;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    //Getters
    public String getMarca(){
        return this.marca;
    }

    public int getMarxa() {
        return marxa;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int getAnyFabricacio() {
        return this.anyFabricacio;
    }
    public static void setUrlNormativa(String url){
        urlNormativa = url;
        // cilindrada = 10; MUYY MALLLLLLLLL 
    }

    @Override
    public int compareTo(Cotxe altreCotxe){
        return this.cilindrada - altreCotxe.cilindrada;
    }
    
    @Override
    public String toString(){
        return "Marca: "+ getMarca() + 
            "\nAny: " + getAnyFabricacio() + 
            "\nCilindrada: " + getCilindrada();

    }
    @Override
    public boolean equals(Object o){
        Cotxe c = (Cotxe)o;
        return c.marca.equals(this.marca)&&
                c.anyFabricacio == this.anyFabricacio &&
                c.cilindrada == this.cilindrada;
    }

}   
