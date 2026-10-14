package sistmA2;
import java.util.ArrayList;
public class AccesoDirecto extends ElementoFS{
    private static final int TAMANIO =1;
    private static final String PREFIJO = "Los que apunta";
    private ElementoFS destino;
        // apunta a un solo elemento random

    public AccesoDirecto(ElementoFS destino){
        super(PREFIJO + destino.getNombre());
        this.destino = destino;
    }
    public ElementoFS getDestino(){
        return destino;
    }

    public int getCantidadElementos(){
        int suma = destino.getCantidadElementos();
        return suma;
    }
    public ArrayList<Archivo> buscarPorExtension(String ext){
        return destino.buscarPorExtension(ext);
    }

    //  Hace el equals tamb en LINK ?

    public boolean equals(Object o){
        if(o == null) return false;
        AccesoDirecto aux = (AccesoDirecto) o;
        return aux.getNombre().equals(this.getNombre())&& this.getDestino().equals(aux.getDestino());
    }
}
