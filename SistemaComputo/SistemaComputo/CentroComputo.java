package SistemaComputo;
import java.util.ArrayList;
public class CentroComputo {

    private ColaEspera procesos;
    private ColaEspera computadoras;

    // constructores con new ColaEspera()

    public void recibirComputadora(Computdora compuLibre){
        if(procesos.hayAlgo()){     // !computadoras.isEmpty()
            Proceso enEspera =(Proceso) procesos.obtenerElemento();
            compuLibre.ejecutarProcesos(enEspera);
        } else computadoras.agregarElemento(compuLibre);
    }

    public Computadora recibirProceso(Proceso procesoNuevo){
        if(computadoras.hayAlgo()){
            Computadora compuMasRapida = (Computadora) computadora.obtenerElemento();
            CompuMasRapida.ejecutarproceso(procesoNuevo);
            return compuMasRapida //???
        }else  procesos.agregarElemento(procesoNuevo);
    }
    
    // Algo asi necesita un toString() en c/clase
    public void imprimirPorcesoEnEspera(){ System.out.println(procesos);}
    public void imprimirComputadorasDisponibles(){ System.out.println(computadoras);}
}
