public abstract class CondicionUnitaria implements Condicion {
    protected Condicion condicion;

    public CondicionUnitaria(Condicion condicion){
        this.condicion = condicion;
    }
    public abstract boolean cumple(Vehiculos v);
    
}
