package General;
import General.condiciones.Condicion;
import java.util.ArrayList;
import java.util.Collections;
public class General {
    private ArrayList<Cuartel> elementos;

    public ArrayList<Agente> buscar(Condicion condicion){
        ArrayList<Agente> resultado = new ArrayList<>();
        for(Cuartel e:this.elementos){
            resultado.addAll(e.buscar(condicion));
        }
        Collections.sort(resultado);
        System.out.println(resultado);
        return resultado;
    }
}
