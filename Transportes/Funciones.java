package 'transporte';
import java.util.ArrayList;

public interface Funciones {

    public double getCostoMantenimiento();
    public double getKilometros();
    public int getCantidadAsientos();
    public int getModelo();
    public boolean contiene(String c);
    public ArrayList<Vehiculos> buscar(Condicion c);
}
 