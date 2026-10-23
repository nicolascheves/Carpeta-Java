package figuritas;

public class FiguritaLimitada extends Figurita{
    private static int unidades;
    private Calculador c;
    public FiguritaLimitada(String nombre,double precio, int num, String album, int unidades, Calculador c){
        super(nombre, precio, num, album);
        this.c =c;
    }

    //  Con super aqui no llamamos de nuevo a este getPrecio()
    public double getPrecio(){
        double total = c.calcular(this);
        double precio = super.getPrecio();
        if(total < precio) return precio;
        return total;
    }

}
