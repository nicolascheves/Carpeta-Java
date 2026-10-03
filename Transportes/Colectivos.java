
public class Colectivos extends TransportePublico {

    public Colectivos(String p, int a, double k, int cA, int cD) {
        super(p, a, k, cA, cD);
    }
    
    public double getCostoMantenimiento() {
        return costoDiario * cantidadAsientos;
    }
}
