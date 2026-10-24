package impresora3D;

import java.util.ArrayList;
import impresora3D.condiciones.*;

public abstract class ElmImpresora {
    private String nombre;
    private String descripcion;
    private static double costoSeg;
    private static double costoGrm;

    public ElmImpresora(String nombre,String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract int getCantPiezasSimples(ElmImpresora p);
    public abstract ArrayList<PiezaSimple> buscar(Condicion cc);
    public abstract ArrayList<ElmImpresora> getElementos();

    public abstract double getPLA();
    public abstract double getSeg(); 
    public abstract ArrayList<String> getColor();  
    
    public String getNombre(){
        return this.nombre;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
   
    public double getCosto(){
        return (this.getPLA() * ElmImpresora.getCostoGr()) + (this.getSeg() * ElmImpresora.getCostoSg());
    }

    public static double getCostoGr(){ return costoGrm;}
    public static double getCostoSg(){ return costoSeg;}
    
}
