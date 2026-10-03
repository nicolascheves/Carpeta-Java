public class FlotaLimitada extends Flota{

    private int modelo;
    public void addFlota(Vehiculos v){
        if(v.getModelo() > modelo) this.flota.add(v);
    }
}
