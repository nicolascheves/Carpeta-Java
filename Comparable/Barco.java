public class Barco implements Comparable<Barco>{
    private int capacidad;

    public int getCapacidad(){
        return capacidad;
    }

    // Si no especificamos la clase COMPARADA
    public int compareTo(Object o){
        if(this.getCapacidad() > ((Barco) o).getCapacidad()){
            return 1; // positivo
        } else if (this.getCapacidad() < ((Barco) o).getCapacidad()){
            return -1; // negativo
        } else return 0; // empate
    }

    // ESPECIFICANDO LA CLASE COMPARADA en el implements <>
    public int compareTo(Barco o){
        if(this.getCapacidad() > o.getCapacidad()) return 1;
        else if(this.getCapacidad() < o.getCapacidad()) return -1;
        else return 0;
    }

    // RESTA ; solo para Integers
    public int compareTo(Barco o){
        return this.getCapacidad()-o.getCapacidad();
    }
}
