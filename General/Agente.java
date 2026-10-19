package General;
import General.condiciones.Condicion;
import java.util.ArrayList;
public class Agente extends Cuartel implements Comparable<Agente>{
    private int anios;
    private double velocidad,ingenio, exp;
    private ArrayList<String> caracteristicas;

    public Agente(String nombre, int anios, double v, double i, double e){
        super(nombre);
        this.anios =anios;
        this.velocidad =v;
        this.ingenio = i;
        this.exp =e;
        this.caracteristicas = new ArrayList<String>();
    }

    // El orden esta bier?
    //  que tal el super aqui?
    public int compareTo(Agente a){
        int res = this.getAnios()-a.getAnios();
        if(res == 0){
            res = Double.compare(this.getVelocidad(),a.getVelocidad());
            if(res==0) res = super.getNombre().compareTo(a.getNombre());
        }
        return res;
    }

    public ArrayList<Agente> buscar(Condicion condicion){
        ArrayList<Agente> resultado = new ArrayList<>();
        if(condicion.cumple(this)) resultado.add(this);
        return resultado;
    }
    
    public ArrayList<String> getCaracteristicas(){
        ArrayList<String> resultado = new ArrayList<>();
        for(String c :this.caracteristicas){
            if(!caracteristicas.contains(c)) resultado.add(c);      
        }
        return resultado;
    }   
    public int getAnios(){
        return anios;
    }
    public double getVelocidad(){
        return velocidad;
    }
    public double getIngenio(){
        return ingenio;
    }
    public double getExperiencia(){
        return exp;
    }

}