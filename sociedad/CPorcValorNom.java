package sociedad;

public class CPorcValorNom extends CalculadorRendimiento{
    private double porcentaje ;

    public double calcular(Bono b){
        return b.getValorNominal() * porcentaje;
    }
}
