import java.util.ArrayList;
import java.util.List;

public class Hangar {
    private int numero;
    private int capacidad;
    private String ubicacion;
    private List<Avion> avionesGuardados;

    public Hangar(int numero, int capacidad, String ubicacion) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.avionesGuardados = new ArrayList<>();
    }

    public boolean guardarAvion(Avion avion) {
        if (avionesGuardados.size() < capacidad) {
            avionesGuardados.add(avion);
            return true;
        }
        return false;
    }

    public int getNumero() { return numero; }
    public int getCapacidad() { return capacidad; }
    public String getUbicacion() { return ubicacion; }
    public List<Avion> getAvionesGuardados() { return avionesGuardados; }
}