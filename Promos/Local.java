import java.util.ArrayList;
public class Local{
    private String nombre;
    private ArrayList<Producto> comercializable;
    private Estrategia estrategia;

    public Local(String nombre){
        this.nombre = nombre;
    }

    // Local, 2) 
    //  getPrecio + getPromo
    //  Que no sea Negativo el retorno 

    //  Notas GetCopia:
    //      verificar si lo que retorno encaja en los auxiliares apropiadamente
    //      1*)     solo se copia a si mismo & sin elements
    //      2*)     se copian SOLO si ALGUN elemto en promo 
    //      3*)     CASTEO x necesidad 

    public void setEstrategia(Estrategia e){
        this.estrategia =e;
    }  

    public boolean esPromo(Producto p){
        double descuento = estrategia.calcularDescuento(p); 
        if (comercializable.contains(p) && descuento > 0) return true;
        else return false;
    }  

    public double getPromo(Estrategia e){
        double suma=0;
        for (Producto p :this.comercializable){
            suma += e.calcularDescuento(p) ;
        }
        return suma;
    }
    public double getPrecioTolal(Producto p){
        double precio, descuento;
        precio = p.getPrecioLista();
        descuento = estrategia.calcularDescuento(p);
        if(descuento >= precio) return precio;
        else return precio - descuento;

    }

    public ArrayList<Producto> getCopia(Estrategia e){
        ArrayList<Producto> copia =new ArrayList<>();
        boolean copiado = false;

        for(Producto p : this.comercializable){
            ArrayList<Producto> arrLaux = p.getCopia(e);

            if(!(arrLaux.isEmpty()) && p.esPromo(e) ){  //   1*)
                arrLaux.get(0).removerElemento();     
                copia.addAll(arrLaux); 

            } else if(!(arrLaux.isEmpty()) && !p.esPromo(e)){   //  2*)

                Combo comAux  = (Combo) p;  // 3*)
                if(!comAux.elementos.isEmpty()) {
                    int i = 0;
                    while(i<= comAux.elementos.size() && !copiado){ 
        
                        if(comAux.elementos.get(i).esPromo(e)){       
                            copia.addAll(arrLaux); 
                            if(!copiado)copiado = true;
                        }    
                        i++;
                    }    
                }
            }    
        }     
        return copia;
    }
}