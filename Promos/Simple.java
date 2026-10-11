import java.util.ArrayList;
public class Simple extends Producto{

    private double precioLista;

    public Simple(double precioLista, String marca){
        super(marca);
        this.precioLista = precioLista;
    }

    public double getPrecioLista(){
        return this.precioLista;
    }

    public String getMarca(){
        return this.marca;
    }
    public void addCaracteristica(String c){
        this.caracteristicas.add(c);
    }

    public ArrayList<String> getCaracteristicas(){
        ArrayList<String> resultado =new ArrayList<>();
        for(String c:this.caracteristicas){
            if(!resultado.contains(c)) resultado.add(c);
        }  
        return resultado;
    }
    
    public boolean esPromo(Estrategia estrategia){
        double descuento = estrategia.calcularDescuento(this); 
        return descuento>0;

    }

    public ArrayList<Producto> getCopia(Estrategia e){
        ArrayList<Producto> copia = new ArrayList<>();
        
        if(this.esPromo(e)){ 
            Simple aux = new Simple(this.precioLista, this.marca);
            for (String c:this.caracteristicas){
                aux.addCaracteristica(c);
            }        
            copia.add(aux); 
        }
        return copia;
    }
   
    public void removerElemento(){
        return;
    }
    
}
