package figuritas;
import java.util.ArrayList;
import figuritas.condiciones.Condicion;
public abstract class ElmColeccionable {
    private String nombre;

    public ElmColeccionable(String nombre){
        this.nombre = nombre;
    }

    public abstract double getPrecio();
    public abstract ArrayList<Figurita> buscar(Condicion cc);

    public String getNombre(){
        return this.nombre;
    }
}
