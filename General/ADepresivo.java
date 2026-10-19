package General;
import java.util.ArrayList;

public class ADepresivo extends Agente {
    private int reductor ;
    private int divisor;
    public ADepresivo(String nombre, int anios, double v, double i, double e, int resta, int divisor){
        super(nombre, anios, v, i, e);
        this.reductor = resta;
        this.divisor = divisor;
    }
    public double getVelocidad(){
        return this.getVelocidad()-reductor;
    }
    public double getIngenio(){
        return this.getIngenio()/divisor;
    }
    public ArrayList<String> getCaracteristicas(){
        ArrayList<String> resultado = new ArrayList<String>();
        resultado.add(super.getCaracteristicas().get(0));
        return resultado;
    }
}
