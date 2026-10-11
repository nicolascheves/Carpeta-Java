
import java.util.ArrayList;
public class Combo extends Producto  {
    
    protected ArrayList<Producto>elementos;

    public Combo(String marca){
        super(marca);
        this.elementos = new ArrayList<Producto>();
    }
    public double getPrecioLista(){
        double suma =0;
        for( Producto p : this.elementos){
            suma += p.getPrecioLista();
        }
        return suma;
    }

    public String getMarca(){
        return elementos.get(0).getMarca();
    }

    public ArrayList<String> getCaracteristicas(){
        ArrayList<String> resultado = new ArrayList<>();
        for(Producto p:this.elementos){
            int i=0;
            while(i < p.caracteristicas.size()){
                String aux = p.caracteristicas.get(i);
                if(!resultado.contains(aux)){
                    resultado.add(p.caracteristicas.get(i));
                }    
            }
        }
        return resultado;
    }

    public void addElemento(Producto p){
        if (elementos.get(0)==null|| p.getMarca() == elementos.get(0).getMarca()){
            this.elementos.add(p);
        }
    }
    public void removerElemento(){
        this.elementos = new ArrayList<Producto>();
    }
    public boolean esPromo(Estrategia estrategia){
        double descuento = estrategia.calcularDescuento(this); 
        return descuento>0;

    }

    public ArrayList<Producto> getCopia(Estrategia e){
        ArrayList<Producto> copia =new ArrayList<>();
        if(this.esPromo(e)){

            Combo aux = new Combo(this.marca);
            for(Producto p :this.elementos){
                aux.elementos.addAll(p.getCopia(e));
            }
            copia.add(aux);
        } return copia;
        // solo id ; no elmts
    }
}
