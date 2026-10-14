/** Distinto niveles de organizacion, ramificaciones y subconjuntos
 * 
 *  Servicios)) getTamanio() getCantidad()  1*))
 * 
 *      El campo referente al tiempo actual LocalDate.now()
 *      no se pasa por parametro al constructor, se valua en el mismo 
 *      al metodo/mensaje de invocacion.
 *      Al contrario al campo referencial al asignado de objetos
 *         que no perteneces al contructor. Sino que se hace un metodo set
 * 
 *      *) Como no se como va a calculr cada en objeto x(), lo declaro abstracto
 *         haciendo la calse abstracta y comun. 
 *         Esta clase asbtracta, como representa varios objetos, 
 *           no la puedo instanciar como por si misma.
 *
 *      **) if(es un archivo)       IF PELIGROSO
 *              DICEÑO ATADA AL DISEÑ0 EXISTENTE
 *              PIERDO FLEXIBILDIAD QUE TENGO X LA HERENCIA DEL POLIMORFISMO
 *              (for (ElementoFS e : this.elementos))
 * 
 *          mejor hacer 3 metodos? 2 en un archivo, y uno recurisvo en los demas
 *          
 *      [[Acceso directo, tipo 'comun' para redireccionar a metodos especificos de metodos?]]
 *          objeto nuevo en el sistema, referencia a otro nombre de otro objeto, seguido de un 'accesoDirecto'; tamaño static
 * 
 *      [[Acceso Directo]]
 *          private ElementoFS loqueapunto;     set/get
 * 
 *      1*)
 *      getCantidad()    No con condicion, sino consingando(cant/ archivos)
 *          similar a getPrecioTotal() ?    
 * 
 *      Implementado en Carpeta'''
 *          getCantElmentos()   incializa suma cn 1; sumo 1 al return
 *          != 
 *          getCantArhcivos()   suma= 0.0;
 * 
 *      )) Los toString() los copio porque son raros
 * 
 *      2*) ArrayList<Archivo> buscarporExtension(String ext)
 *      
 *      **) PESIMO : DEPENDEMOS DE UN TIPO
 * 
 *      [[  for ( e : this.) ..]]
 *      [[      if( e es un archivo  )  ]]    
 *      [[          retorno att         ]]
 *      [[      else   busco dentro del conjunto  ]]  
 * 
 *       **))   Las clases CONDICIONES [[ cumple(objeto) ]]
 *              vienen a ayudar el dilema de la estuctura para la comparacion repetitiva
 *              PASAMOS COMO ARGUMENTOS EL ELEMENTO Y EL ATRIBUTO/LOGICA 
 *              LO ESPECIFICA LA CLASE HIJA DE CONDICION
 * 
 *      p/this.getExtension().equals(ext)
 *      p.getTamaño()>tamanioMin
 * 
 *      ArrayList<> buscarTamañoMayor(String)
 *          pasa a ser buscar(Filtro condicion)           abstracto Filtro.cumple()
 *      NO TENGO QUE NI IMPLEMENTARLO NI EXTENEDERLO
 * 
 *      import act.condiciones.Condicion;
 *      import java.util.ArrayList
 *      import java.time.LocalDate
 *      public abstract class ElementoFS{}
 * 
 *      **) FILTRO NEGADO DE CUALQUIER CONDICION::
 * 
 *      CondiconNot extends Condicion
 *          private Co
 *      
 * 
 *      
 * */