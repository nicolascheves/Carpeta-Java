package figuritas;

import java.util.ArrayList;
import java.util.Collections;
import figuritas.*;
import figuritas.condiciones.Condicion;
 
public class Sistema {
    private ArrayList<ElmColeccionable> productos;

    public ArrayList<Figurita> buscar(Condicion cc){
        ArrayList<Figurita> resultado =new ArrayList<>();
        //  HACER FOR EN ESTE METODO, NO HAY BUSCAR() EN ARRAYLIST
  
        for(ElmColeccionable e :this.productos){
            resultado.addAll(e.buscar(cc));
        }

        Collections.sort(resultado);
        return resultado;
    }
}
