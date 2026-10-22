package sociedad;
import java.util.ArrayList;
import sociedad.condiciones.Criterio;

public abstract class Sociedad {
    private String cuit;
    protected CalculadorRendimiento calculadorReq;
    
    public Sociedad(String cuit, CalculadorRendimiento c){
        this.cuit = cuit;
        this.calculadorReq = c;
    }

    public abstract ArrayList<Bono> buscar(Criterio b);
    public abstract double calcularRendimiento();
    public abstract double getValorNominal();

    public CalculadorRendimiento getCalculador(){
        return this.calculadorReq;
    }

    public void setCalculador(CalculadorRendimiento cr){
        this.calculadorReq = cr;
    }

}
