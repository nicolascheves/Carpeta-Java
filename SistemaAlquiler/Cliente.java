import java.util.ArrayList;
public class Cliente{
    protected String dni;
    protected ArrayList<Alquiler> items;

    public Cliente(String dni) {
        this.dni = dni;
        this.items = new ArrayList<>();
    }

    //void devolver(Alquiler a){
    //    for (Alquiler i : items){
    //        if(i.equals(a)){
    //            i.devolver(a);
    //        }
    //    }
    //}

}
