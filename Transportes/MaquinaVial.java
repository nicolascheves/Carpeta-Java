public class MaquinaVial extends Vehiculos {
    protected double horaTrabajadas;
    protected static double cxHora;
    public MaquinaVial(String p, int m,double k, int cA,double hT, double cH){
        super(p,m,k,cA);
        this.horaTrabajadas = hT;
        cxHora = cH;            // varia para todos
    }

    public double getCostoMantenimiento(){
        return horaTrabajadas * cxHora;
    }
}
