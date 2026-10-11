import java.util.ArrayList;
public abstract class Producto {
    // unico
    protected static int contador =0;
    protected final int idProducto; 
    protected String marca;
    protected ArrayList<String> caracteristicas;

    public Producto(String marca){
        contador++;
        this.idProducto = contador;
        this.marca = marca;
        this.caracteristicas = new ArrayList<>();

    }
    public int getId(){
        return this.idProducto;
    }
    public String getMarca(){
        return this.marca;
    }
    public void addCaracteristica(String c){
        this.caracteristicas.add(c);
    }

    public abstract double getPrecioLista();
    public abstract ArrayList<String> getCaracteristicas();

    public abstract boolean esPromo(Estrategia e);
    public abstract ArrayList<Producto> getCopia(Estrategia e);
    public abstract void removerElemento();

    //public abstract void addCaracteristica(String c);
}
