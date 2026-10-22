package sociedad;

public class BonoDescrito extends Bono{
    private String descripccion;
    public BonoDescrito(String cuit, CalculadorRendimiento c,int ne,double vn, String descripccion){
        super(cuit, c,ne,vn);
        this.descripccion = descripccion;
    }
}
