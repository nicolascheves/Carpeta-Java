import java.time.LocalDate;
public class CondicionVencimiento extends CondicionUnitaria{
    LocalDate actualidad;
    public CondicionVencimiento(LocalDate actualidad, Condicion c){
        super(c);
        this.actualidad = actualidad;
    }
    public boolean cumple(Alquiler a){
        return a.getVencimiento().isAfter(actualidad);
    }
}
