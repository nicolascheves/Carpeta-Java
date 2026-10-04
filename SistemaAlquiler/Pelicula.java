import java.time.LocalDate;
import java.util.ArrayList;
public class Pelicula extends Alquiler{
    ArrayList<String> informacion;

    public Pelicula(LocalDate fechaVencimiento, int cantidadDisponible) {
        super(fechaVencimiento, cantidadDisponible);
        this.informacion = new ArrayList<>();
        
    }

    public int getCantidadDisponible() {
        return this.cantidadDisponible;
    }

    public void devolver(Alquiler a){
        if(a != null)this.cantidadDisponible++;
    }
}
