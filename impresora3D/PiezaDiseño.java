package impresora3D;

import impresora3D.condiciones.Condicion;

public class PiezaDiseño extends PiezaCompuesta{
    
    public PiezaDiseño(String nombre, String descripcion, double sgExtra, double multiplicar){
        super(nombre, descripcion, sgExtra, multiplicar);
    }
    public void addElementoCondicion(ElmImpresora e, Condicion cc){
        if(cc.cumple(e)) this.elementos.add(e);
        
    }
}
