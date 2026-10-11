public class SimpleCLimit extends Simple{
    private int limiteCaracteristicas;

    public SimpleCLimit(double precioLista,String marca, int limiteCaracteristicas){
        super(precioLista,marca);
        this.limiteCaracteristicas = limiteCaracteristicas;
    }

    public void addCaracteristicas(String c){
        if(caracteristicas.size() < limiteCaracteristicas) caracteristicas.add(c);
    }
}