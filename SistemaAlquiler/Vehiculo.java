import java.time.LocalDate;
public class Vehiculo extends Alquiler{
    String marca;
    double klm;
    String patente;
    String tipo;
    boolean disponible;

    public Vehiculo(LocalDate fechaVencimiento, int cantidadDisponible,String marca, double klm, String patente, String tipo) {
        super(fechaVencimiento, cantidadDisponible);
        this.marca = marca;
        this.klm = klm;
        this.patente = patente;
        this.tipo = tipo;
        this.disponible = true;
    }

    public int getCantidadDisponible() {
        if(disponible) return 1; else return 0;
    }

    public void devolver(Alquiler a){
        if(a != null)this.disponible = true;
    }
}
