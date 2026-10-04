import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        VideoClub vc = new VideoClub();

        Cliente c1 = new Cliente("12345678");
        Vehiculo v1 = new Vehiculo(LocalDate.of(2024, 6, 30), 5,"Toyota", 10000, "ABC123", "Naftero");
        Pelicula p1 = new Pelicula(LocalDate.of(2024, 6, 30), 5) ;

        v1.setCliente(c1);
        p1.setCliente(c1);
        c1.items.add(v1);
        c1.items.add(p1);

        Condicion c = new CondicionVencimiento(LocalDate.of(2024, 6, 15), null);


        System.out.println(vc.getClientesMorosos(c));
    }
}
