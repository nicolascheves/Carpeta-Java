package impresora3D.condiciones;

import impresora3D.ElmImpresora;
import impresora3D.PiezaSimple;

public abstract class Condicion {
    public abstract boolean cumple(ElmImpresora p);
}
