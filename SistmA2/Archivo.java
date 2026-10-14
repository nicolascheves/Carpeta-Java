package sistmA2;
import java.util.ArrayList;
public class Archivo extends ElementoFS{

    public Archivo(String nombre){
        super(nombre);
    }

    public int getCantidadElementos(){
        return 1;
    }
    public ArrayList<Archivo> buscarPorExtension(String ext){
        ArrayList<Archivo> resultado = new ArrayList<Archivo>();
        if(mismaExtension(this,ext)) resultado.add(this);
        return resultado;
    } 

    public boolean equals(Object o){
        if(o ==null) return false;
        Archivo aux = (Archivo) o;
        return aux.getExtension().equals(this.getExtension());
    }
    
}
