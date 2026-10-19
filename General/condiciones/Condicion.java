package General.condiciones;
import General.Agente;

public abstract class Condicion {
    public Condicion(){}

    public abstract boolean cumple(Agente a);
}
