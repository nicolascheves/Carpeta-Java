public abstract class CondicionBinaria implements Condicion {
    protected Condicion c1;
    protected Condicion c2;

    public CondicionBinaria(Condicion c1, Condicion c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    public abstract boolean cumple(Vehiculos v);
  
}
