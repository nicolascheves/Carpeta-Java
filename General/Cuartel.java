package General;
import java.util.ArrayList;

import General.condiciones.Condicion;
public abstract class Cuartel {
    private String nombre;
    public Cuartel(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
    public abstract double getIngenio();
    public abstract double getVelocidad();
    public abstract ArrayList<String> getCaracteristicas();
    public abstract ArrayList<Agente> buscar(Condicion condicion);

    public boolean esMayor(double a, double b){
        return b==0||a>b;
    }
}
