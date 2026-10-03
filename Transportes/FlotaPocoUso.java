public class FlotaPocoUso extends Flota {
    private double  KilometrosRecorridos; 

    public void addFlota(Vehiculos v){
        if(v.getKilometros() < KilometrosRecorridos) this.flota.add(v);
    }
}
