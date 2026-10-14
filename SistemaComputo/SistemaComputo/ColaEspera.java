package SistemaComputo;

import java.util.ArrayList;
// o ColaOrdenada
public class ColaEspera {
    private ArrayList<Object> elementos;
    private Estrategia estrategia;  // MEJOR OBJETO COMPARABLE 


    public void recibirComputadora(Computadora compuLibre){
        if(preocesos.size()>0){
            Proceso enEspera = (Proceso) procesos.remove(0);
            cumpuLibre.ejecutarProceso(enEspera);
            // ejecuto y elimino el proceso MAS requerimientos de la lista ('0')
        } else{
            insertarOrdenado(compuLibre, computadoras);
        }
    }

    public Computadora recibirProceso(Proceso procesoNuevo){
        if(computadora.size()>0){
            Computadora computadoraMasRapida = (Computadora) computadoras.remove(0);
            // Obtengo y elimino la computadora mas rapida de la lista (ordenada)

            computadoraMasRapida.ejecutar(procesoNuevo);
            return computadoraMasRapida;
        } else{
            insertarOrdenada(procesoNuevo, procesos);
            return null;
        }
    }

    // Esto no sirve mas ; accesdemos directamente a elementos en ESTA CLASE
    private void insertarOrdenado(Object elemento, ArrayList<Object> lista){
        int i=0;
        while(i< lista.size() && elemento.getReqMemoria() < lista.get(i).getReqMemoria()){
            i++;
        }// En i me queda el lugar donde debo insertar el proceso
        lista.add(i,elemento);
    }

    public void agregarElemento(Object o){
        int i=0;
        while(i< elementos.size() && elemento.getReqMemoria() < elementos.get(i).getReqMemoria()){
            i++;
        }
        elementos.add(i,elementos);
    }
    //  El casting de antes, me hacia saber si trabajaba con una lista u otra
    //  Ahora cola de espera es algo generico

    //  (proceso)elemento.getReqMemoria() < (Proceso)elementos.get(i).getReqMemoria()
    //  Esto da error en ejecucion

    public Object objetenerElemento(){
        if(elementos.size()>0){
            return elementos.remove(0);
        }
        return null;
    }
    public boolean hayAlgo(){
        return elementos.size() >0;
    }
    public String toString(){
        return "Cola ordenada{"+elementos+ "}";
    }
}
