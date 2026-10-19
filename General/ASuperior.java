package General;

public class ASuperior extends Agente{
    private int numero;
    public ASuperior(String nombre, int anios, double v, double i, double e, int multiplicador){
        super(nombre, anios,v,i,e);
        this.numero = multiplicador;
    }

    public double getVelocidad(){
        return super.getVelocidad()*numero;
    }
    public double getIngenio(){
        return super.getIngenio()*numero;
    }
    public double getExperiencia(){
        return super.getExperiencia()*numero;
    }
}
