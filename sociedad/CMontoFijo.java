package sociedad;

public class CMontoFijo extends CalculadorRendimiento{
    private double monto;
    public CMontoFijo(double monto){
        this.monto = monto;
    }
    public double calcular(Bono b){
        return monto;
    }

}
