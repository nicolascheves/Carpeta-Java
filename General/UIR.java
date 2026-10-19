package General;

public class UIR extends Escuadron {
    public UIR(String nombre){
        super(nombre);
    }
    public double getVelocidad(){
        double suma =0;
        // importante el super 
        for(Cuartel e: super.getElementos()){
            double aux = e.getVelocidad();
            if(esMayor(aux,suma)) suma = aux;   
        }
        return suma;
    }
    public double getIngenio(){
        return super.getElementos().get(0).getIngenio();
    }
   
}
