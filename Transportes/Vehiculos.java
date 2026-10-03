package 'transporte';
import java.util.ArrayList;

public abstract class Vehiculos implements Funciones {
    protected String patente;
    protected int anio;
    protected double kilometros;
    protected int cantidadAsientos;
    protected ArrayList<String> caracteristicas;

    public Vehiculos(String p, int a, double k, int cA) {
        this.patente = p;
        this.anio = a;
        this.kilometros = k;
        this.cantidadAsientos = cA;
        caracteristicas = new ArrayList<>();
    }

    public ArrayList<String> getCaracteristica(){
        ArrayList<String> copia = new ArrayList<>();
        for(String c : this.caracteristicas){
            copia.add(c);
        }
        return copia;
    }

    public ArrayList<Vehiculos> buscar(Condicion c) {
        ArrayList<Vehiculos> resultado = new ArrayList<>();
        if(c.cumple(this)) resultado.add(this);
        return resultado;
    }   

    public boolean contiene(String c){
        return this.caracteristicas.contains(c);
    }

    public int getModelo(){
        return this.anio;
    }
    public int getCantidadAsientos(){
        return this.cantidadAsientos;
    }
    public double getKilometros(){
        return this.kilometros;
    }
    public abstract double getCostoMantenimiento();
}
