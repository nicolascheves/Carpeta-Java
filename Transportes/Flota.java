package 'transporte';
import java.util.ArrayList;
public class Flota implements Funciones{
    protected ArrayList<Vehiculos> flota;

    public Flota(){
        this.flota = new ArrayList<>();
    }

    public ArrayList<Vehiculos> buscar(Condicion c) {
        ArrayList<Vehiculos> resultado = new ArrayList<>();
        for(Funciones v : this.flota){
            ArrayList<Vehiculos> aux = v.buscar(c); // TENEMOS MUCHAS LISTAS
            if(!aux.isEmpty()) resultado.addAll(aux);
        }
        return resultado;
    }

    public int getModelo(){
        int modelo =0 ;
        for(Vehiculos v : this.flota){
            if(modelo == 0 || v.getModelo() < modelo){
                modelo = v.getModelo();
            }
        }
        return modelo;
    }
    public void addFlota(Vehiculos v){
        this.flota.add(v);
    }

    public int getCantidadAsientos(){
        int suma =0;
        for(Vehiculos v : this.flota){
            if(v.getCantidadAsientos() > 0){
                suma += v.getCantidadAsientos(); 
            }    
        }
        return suma;
    }
    public double getKilometros(){
        double suma =0;
        for(Vehiculos v : this.flota){
            if(v.getKilometros() > 0){
                suma += v.getKilometros(); 
            }    
        }
        return suma;
    }
    public double getCostoMantenimiento(){
        double suma =0;
        for(Vehiculos v : this.flota){
            if(v.getCostoMantenimiento() > 0){
                suma += v.getCostoMantenimiento(); 
            }    
        }
        return suma; 
    }
    public boolean contiene(String c){
        boolean contiene = false;
        int i = 0;
        while(i < this.flota.size()-1 && !contiene){
            if(this.flota.get(i).contiene(c)){
                contiene = true;
            }
            i++;
        }
        return contiene;
    }
}
