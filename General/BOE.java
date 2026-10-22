package General;

public class BOE extends Escuadron{
    public BOE(String nombre){
        super(nombre);
    }
    public double getVelocidad(){
        double suma =0;
         
        for(Cuartel e: this.getElementos()){
            double aux = e.getIngenio();
            if(esMayor(aux,suma)) suma = aux;   
        }
        return suma;
    }
    public double getIngenio(){
        double suma =0;
        for (Cuartel e : this.getElementos()){
            suma += e.getVelocidad();
        }
        return suma/this.getElementos().size();
    }
}
