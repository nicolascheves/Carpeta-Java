package condiciones;

public class CondicionNot extends Condicion{
    private Condicion directaPositiva;
    public CondicionNot(Condicion directaPositiva){
        this.directaPositiva = directaPositiva;
    }

    public boolean cumple(Archivo a){
        return !directaPositiva.cumple(a);
    }
}
