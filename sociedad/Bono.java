package sociedad;
import java.util.ArrayList;
import sociedad.condiciones.Criterio;

public class Bono extends Sociedad{
    private int numEmision;
    private double valorNominal;
    
    public Bono(String cuit,CalculadorRendimiento cc ,int numEmision, double vNominal){
        super(cuit, cc);
        this.numEmision = numEmision;
        this.valorNominal = vNominal;
    }
    public double calcularRendimiento(){
        return this.getCalculador().calcular(this);
    }

    public ArrayList<Bono> buscar(Criterio cc){
        ArrayList<Bono> resultado = new ArrayList<>();
        if(cc.cumple(this)) resultado.add(this);
        return resultado;
    }
    public double getValorNominal(){
        return this.valorNominal;
    }
}