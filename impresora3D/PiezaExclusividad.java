package impresora3D;

import java.util.ArrayList;

import impresora3D.condiciones.Condicion;

public class PiezaExclusividad extends PiezaSimple{
    private double costoExclusividad;
    public PiezaExclusividad(String nombre, String descripcion, double pla, double tiempo, String color, double costoExc){
        super(nombre, descripcion,pla, tiempo, color);
        this.costoExclusividad = costoExc;
    }
    public ArrayList<PiezaSimple> buscar(Condicion cc){
        return new ArrayList<PiezaSimple>();
    }
    public double getCosto(){
        return super.getCosto() + costoExclusividad;
    }
    
}
