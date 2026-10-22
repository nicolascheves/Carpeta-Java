package sociedad;

import java.time.LocalDate;
import sociedad.condiciones.Criterio;
import java.util.ArrayList;

public class BonoTemporal extends Bono{
    private LocalDate fechaInicio, fechaFin;
    private Sociedad referenciado;
    private static int promedio; 

    public BonoTemporal(String cuit, CalculadorRendimiento c, int ne, double vn,LocalDate ini, LocalDate fin, Sociedad referenciado){
        super(cuit,c, ne, vn);
        this.fechaInicio =ini;
        this.fechaFin = fin;
        this.referenciado = referenciado;
        
    }
    public Sociedad getReferenciado(){
        return this.referenciado;
    }
    public LocalDate getFechaFin(){
        return this.fechaFin;
    }
    public ArrayList<Bono> buscar(Criterio c){
        ArrayList<Bono> resultado = new ArrayList<>();
        if(this.getFechaFin().isBefore(LocalDate.now())) resultado.add(this);
        return resultado;
    }
    public double getValorNominal(){
        double total = this.getReferenciado().getValorNominal();
        if(!this.getFechaFin().isBefore(LocalDate.now())){
            return total *(1- promedio); 
        } else return total;
        
    }
}
