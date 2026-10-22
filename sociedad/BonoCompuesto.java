package sociedad;
import sociedad.condiciones.Criterio;
import java.util.ArrayList;

public class BonoCompuesto extends Sociedad{
    private ArrayList<Sociedad> elementos;
    public BonoCompuesto(String cuit, CalculadorRendimiento c){
        super(cuit,c);
        this.elementos = new ArrayList<>();
    }
    
    public ArrayList<Bono> buscar(Criterio cc){
        ArrayList<Bono> resultado = new ArrayList<>(); 
        for(Sociedad e :this.getElementos()){
            ArrayList<Bono> aux  = e.buscar(cc);
            resultado.addAll(aux);
        }
        return resultado;
    }
    public double calcularRendimiento(){
        double suma =0;
        for(Sociedad e:this.getElementos()){
            suma += e.calcularRendimiento();
        }
        return suma;
    }

    public ArrayList<Sociedad> getElementos(){
        ArrayList<Sociedad> resultado = new ArrayList<>();
        for(Sociedad e : this.elementos){
            resultado.add(e);
        }
        return resultado;
    }
    public double getValorNominal(){
        double suma=0;
        for(Sociedad e:this.getElementos()){
            suma += e.getValorNominal();
        }
        return suma;
    }
}
