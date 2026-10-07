public class Archivo implements Comparable<Archivo>{
    private double tamanio;
    
    public double getTamanio(){
        return tamanio;
    }

    // Cambiadno el orden de los parametros, Cambiaremos el ORDENAMIENTO
    // objeto Double posee un precsiso compare()

    public int compareTo(Archivo o){
        return Double.compare(this.getTamanio(), o.getTamanio());
    }
}
