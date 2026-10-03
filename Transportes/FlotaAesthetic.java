public class FlotaAesthetic extends Flota{
    private String caracteristica;
    public FlotaAesthetic(String caracteristica){
        super();
        this.caracteristica = caracteristica;
    }
    public void addFlota(Vehiculos v){
        if(v.getCaracteristica().contains(caracteristica)) this.flota.add(v);
    }
}
