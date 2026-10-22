package sociedad;

public class Ccompuesto extends CalculadorRendimiento{
    private CalculadorRendimiento c1,c2;
    public Ccompuesto(CalculadorRendimiento c1, CalculadorRendimiento c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    public double calcular(Bono b){
        return c1.calcular(b)+c2.calcular(b);
    }
}
