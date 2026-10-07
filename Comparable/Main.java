import java.util.ArrayList;
import java.util.Collections;
public class Main {
    //  Una interface es un COMPROMISO de comportamineto de acceso global/GENERICO

    //  compareTo() es nativamente interfaz usada con String
    //      no usamos equals() p/comparar String 

    //  Los calculadores y condiciones sin de cierta forma especificos, no genericos 
    //  ElementFS ; 

    public static void main(String[] args) {

       final ArrayList<String> ciudades;

        Collections.sort(ciudades);   
        Collections.sor(ciudades, orden);
        Collections.sort(ciudades, Collections.reverseOrder());
    }
}
