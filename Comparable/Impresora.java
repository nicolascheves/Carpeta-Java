public class Impresora implements Comparable<Impresora>{

    private String modelo;

    public String getModelo(){
    return modelo;
    }

    public int compareTo(Impresora o){
        return this.getModelo().compareTo(o.getModelo());
    }
}
