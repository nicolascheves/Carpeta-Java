package figuritas;
import java.util.*;
import figuritas.condiciones.Condicion;
public class Coleccion extends ElmColeccionable {
    private ArrayList<ElmColeccionable> elementos;
    private int descuento;

    // este descuento ¬= numero en figurita)?
    public Coleccion(String nombre , int descuento){
        super(nombre);
        this.descuento = descuento;
    }

    public double getPrecio(){
        double suma =0;
        for(ElmColeccionable e : this.elementos){
            suma += e.getPrecio();
        }
        return suma *(1- descuento);
    }
    public ArrayList<ElmColeccionable> getElementos(){
        ArrayList<ElmColeccionable> resultado = new ArrayList<>();
        for(ElmColeccionable e :this.elementos){
            resultado.add(e);
        }
        return resultado;
    }

    public ArrayList<Figurita> buscar(Condicion cc){
        ArrayList<Figurita> resultado =new ArrayList<>();
        for(ElmColeccionable e: this.getElementos()){
            ArrayList<Figurita> aux = e.buscar(cc);
            resultado.addAll(aux);
        }
        return resultado;
    }
}
