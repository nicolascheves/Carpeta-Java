import java.util.ArrayList;
public class Comprimido {
    //  puede tener cualquier cantidd de elementos randoms
    //  tamaño suma += elm ; * factor de compresion
    private ArrayList<ElementoFS> elementos;
    private double factorDeCompresion;

    //  Llamar al getTamanio DEL PADRE y mltiplicarlo xe l
    //  el factor de compresion
    //      NO USAR PROTECTED, VERIFICAR SI TENGO BIEN LOS SUPER

    //  No repetir codigo del padre, usar super.() ADMS
    //      los elementos del padre son privados, q esta bien

    public double getTamanio(){
        return super.getTamanio()*factorDeCompresion;
    }
}
