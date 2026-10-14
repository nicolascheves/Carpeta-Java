package sistmA2;
import java.time.LocalDate;
import java.util.ArrayList;
public abstract class ElementoFS {
    private String nombre;
    private double tamanio;
    private LocalDate fechaCr;

    public ElementoFS(String nombre){
        this.nombre = nombre;
        this.fechaCr = LocalDate.now();
    }
    
    public abstract int getCantidadElementos();
    // public abstract int cantidadCarpetadas()
    // int suma = 0     

    public String getNombre(){
        return this.nombre;
    }

    public boolean mismaExtension(ElementoFS e,String ext){
        return e.getExtension().equals(ext);
    }
    public abstract ArrayList<Archivo> buscarPorExtension(String ext);
}
