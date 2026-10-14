package sistmA2;
import java.util.ArrayList;
public class Carpeta extends ElementoFS{
    private ArrayList<ElementoFS> elementos;

    public String toString(){
        String retorno = this.getNombre();
        int i =0;
        while(i < elementos.size()){
            retorno += elementos.get(i).toString();
            if(i!=elementos.size()-1) retorno += ";";
            i++;
        }
    }

    public int getCantidadElementos(){
        int suma = 1;                           // Si este tipo cuenta en la suma
        for(ElementoFS e: this.elementos){
            suma += e.getCantidadElementos();
        }
        return suma;
    }
    public ArrayList<Archivo> buscarPorExtension(String ext){
        ArrayList<Archivo> resultado = new ArrayList<Archivo>();
        for(ElementoFS e: this.elementos){
            if(mismaExtension(e,ext)){
                //si no esta vacio lo agrego ?
                resultado.addAll(e.buscarPorExtension(ext));
            }
        }
        return resultado;
    } 
    //  if(condicion.cumple(this))
    // addAll(e.buscar(condicion))
    

}
