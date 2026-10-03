package 'transporte';
public class Taxi extends TransportePublico {
    protected int extra, modelo;
    public Taxi(String p, int a, double k, int cA, int cD, int extra, int modelo){ 
        super(p, a, k, cA, cD);
        this.extra = extra;
        this.modelo = modelo;
    }

    // hay que escribir los campos no como en ESTE cosntructor sino como en el de arriba, 
    // ya que este es el constructor de la clase y no de la superclase
    public double getCostoMantenimiento(){
        if(this.anio < modelo) return this.costoDiario * this.kilometros + extra;
        else return this.costoDiario * this.kilometros;
    }
}
