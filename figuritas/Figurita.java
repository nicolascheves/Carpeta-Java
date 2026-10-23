package figuritas;
import java.util.ArrayList;
import figuritas.condiciones.Condicion;

public class Figurita extends ElmColeccionable implements Comparable<Figurita>{
    private double precio;
    private int numero;
    private String album;

    public Figurita(String nombre, double precio, int numero, String album){
        super(nombre);
        this.precio = precio;
        this.numero =numero;
        this.album = album;
    }

    public double getPrecio(){
        return this.precio;
    }
    public ArrayList<Figurita> buscar(Condicion cc){
        ArrayList<Figurita> resultado =new ArrayList<>();
        if(cc.cumple(this)) resultado.add(this);
        return resultado;
    }
    public int compareTo(Figurita f){
        int res = Double.compare(this.getPrecio(),f.getPrecio());
        if(res ==0) res = this.getNombre().compareTo(f.getNombre());
        return res;
    }
}
