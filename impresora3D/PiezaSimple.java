package impresora3D;

import java.util.ArrayList;
import impresora3D.condiciones.Condicion;
public class PiezaSimple extends ElmImpresora{
    private double pla;
    private String color;
    private double tiempo;
    private static int contador =0;
    

    public PiezaSimple(String nombre, String descripcion, double pla, double tiempo, String color){
        super(nombre, descripcion);
        this.pla = pla;
        this.tiempo = tiempo;
        this.color = color;
        contador++;
    }

    public double getPLA(){
        return pla;
    }
    public double getSeg(){
        return tiempo;
    }
    
    public static int getContadorPSimple(){
        return contador;
    }
    public ArrayList<String> getColor(){
        ArrayList<String> resultado = new ArrayList<>();
        resultado.add(color);
        return resultado;
    }
    public int getCantPiezasSimples(ElmImpresora p){
        return 1;
    }
    public ArrayList<ElmImpresora> getElementos(){
        return new ArrayList<>();
    }
    public ArrayList<PiezaSimple> buscar(Condicion cc){
        ArrayList<PiezaSimple> resultado = new ArrayList<>();
        if(cc.cumple(this))resultado.add(this);
        return resultado;
    }
}