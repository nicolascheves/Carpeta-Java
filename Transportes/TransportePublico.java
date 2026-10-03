//import java.util.ArrayList;

package 'transporte';
public abstract class TransportePublico extends Vehiculos{
    // no hace falta que implemente ya que hereda de vehiculos que ya implementa funciones
    protected int costoDiario;
    public TransportePublico(String p, int a, double k, int cA, int cD){
        super(p, a, k, cA);
        this.costoDiario = cD;
    }
}
