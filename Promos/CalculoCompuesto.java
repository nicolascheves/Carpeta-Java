public class CalculoCompuesto extends Estrategia{

    Estrategia c1;
    Estrategia c2;

    public CalculoCompuesto(Estrategia c1, Estrategia c2){
        this.c1 =c1;
        this.c2= c2;
    }

    public double calcularDescuento(Producto p){
        return c1.calcularDescuento(p)+c2.calcularDescuento(p);
    }
}