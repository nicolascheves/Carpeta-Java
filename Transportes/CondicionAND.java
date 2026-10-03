public class CondicionAND extends CondicionBinaria{
    public CondicionAND(Condicion c1, Condicion c2){
        super(c1,c2);
    }
    public boolean cumple(Vehiculos v){
        return c1.cumple(v)&& c2.cumple(v);
    }
}
