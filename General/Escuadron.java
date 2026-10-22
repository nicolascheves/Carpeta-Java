package General;
import General.condiciones.Condicion;
import java.util.ArrayList;
public abstract class Escuadron extends Cuartel{
    private ArrayList<Cuartel> elementos;

    public Escuadron(String nombre){
        super(nombre);
    }
    public abstract double getVelocidad();
    public abstract double getIngenio();

    public ArrayList<Agente> buscar(Condicion condicion){
        ArrayList<Agente> resultado = new ArrayList<>();
        for(Cuartel e :this.elementos){
            ArrayList<Agente> aux = e.buscar(condicion);
            resultado.addAll(aux);
        }
        return resultado;
    }

    public ArrayList<String> getCaracteristicas(){
        ArrayList<String> resultado = new ArrayList<>();
        for(Cuartel e :this.elementos){
            ArrayList<String> aux = e.getCaracteristicas();
            for(String c :aux ){
                if(!resultado.contains(c)) resultado.add(c); 
            }     
        }
        return resultado;
    }   
  
    // importante el getElementos
    public ArrayList<Cuartel> getElementos(){
        ArrayList<Cuartel> resultado = new ArrayList<>();
        for(Cuartel e :this.elementos){
            resultado.add(e);
        }
        return resultado;
    }
}
