package figuritas;

import java.util.ArrayList;
import figuritas.condiciones.Condicion;
public class ColeccionRestrictiva extends Coleccion{

    public ColeccionRestrictiva(String nombre, int descuento){
        super(nombre, descuento);
    }
    public ArrayList<Figurita> buscar(Condicion cc){
        return new ArrayList<Figurita>();
    }
}
