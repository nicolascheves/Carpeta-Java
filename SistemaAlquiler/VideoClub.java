import java.util.ArrayList;
public class VideoClub {
    protected ArrayList<Alquiler> prestados;
    protected ArrayList<Cliente> clientes;

    public VideoClub() {
        this.prestados = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientesMorosos(Condicion c){ 
        ArrayList<Cliente> morosos = new ArrayList<>();
        for(Alquiler a :this.prestados){
            if (c.cumple(a)) morosos.add(a.cliente);
        }
        return morosos;
    }

}
