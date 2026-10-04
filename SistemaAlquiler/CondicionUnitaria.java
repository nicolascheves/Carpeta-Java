public abstract class CondicionUnitaria implements Condicion {
    protected Condicion c;
    public CondicionUnitaria(Condicion c){
        this.c = c;
    }
}
