// Quienes tienen alquiler vencido
import java.time.LocalDate;
import java.util.ArrayList;
public abstract class Alquiler implements Sistema{
    LocalDate fechaVencimiento; 
    int cantidadDisponible;
    Cliente cliente;

    public Alquiler(LocalDate fechaVencimiento, int cantidadDisponible) {
        this.fechaVencimiento = fechaVencimiento;
        this.cantidadDisponible = cantidadDisponible;
        
    }

    public ArrayList<Cliente> getVencidos(Condicion c){
        ArrayList<Cliente> vencidos = new ArrayList<>();
        if(c.cumple(this)){
            vencidos.add(this.cliente);
        }
        return vencidos;
    };

    public LocalDate getVencimiento() {
        return this.fechaVencimiento;
    }

    public void setCliente(Cliente c){
        this.cliente = c;
    }

    public abstract int getCantidadDisponible();
    public abstract void alquilar(Alquiler a);
    public abstract void devolver(Alquiler a);
}
