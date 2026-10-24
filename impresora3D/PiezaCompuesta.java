package impresora3D;
import java.util.ArrayList;
import impresora3D.*;
import impresora3D.condiciones.*;
public class PiezaCompuesta extends ElmImpresora{
    private double segExtras;
    private double multiplicar;
    protected ArrayList<ElmImpresora> elementos;

    public PiezaCompuesta(String nombre, String descripcion, double sgExtra, double multiplicar){
        super(nombre, descripcion);
        this.segExtras =sgExtra;
        this.multiplicar = multiplicar;
    }

    public double getPLA(){
        double suma =0 ;
        for(ElmImpresora e:this.elementos){
            suma += e.getPLA();
        }
        return suma + ( multiplicar * PiezaSimple.getContadorPSimple());
    }

    public double getSeg(){
        double suma =0;
        for(ElmImpresora e:this.elementos){
            suma += e.getSeg();
        }
        return suma + this.getSegExtras();
    }
    public double getSegExtras(){
        return segExtras;
    }

    public ArrayList<String> getColor(){
       
        ArrayList<String> resultado = new ArrayList<>();
        for(ElmImpresora e :this.elementos){
            ArrayList<String> aux = e.getColor();
            for(String s : aux){
                if(!resultado.contains(s)) resultado.add(s);
            }
        }
        return resultado;
    }
    public int getCantPiezasSimples(ElmImpresora p){
        int suma =0;
        for(ElmImpresora e: p.getElementos()){
            suma += getCantPiezasSimples(e);
        }
        return suma;
    }
    public ArrayList<ElmImpresora> getElementos(){
        ArrayList<ElmImpresora> resultado = new ArrayList<>();
        for(ElmImpresora e :this.elementos){
            resultado.add(e);
        }
        return resultado;
    }
    public ArrayList<PiezaSimple> buscar(Condicion cc){
        ArrayList<PiezaSimple> resultado = new ArrayList<>();
        for(ElmImpresora e : this.getElementos()){
            resultado.addAll(e.buscar(cc));
        }
        return resultado;
    }
}
