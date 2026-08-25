import java.util.ArrayList;
import java.util.List;

public abstract class Cereal {
    private String nombre;
    private List<Mineral> mineralesRequeridos;

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.mineralesRequeridos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Mineral> getMineralesRequeridos() {
        return mineralesRequeridos;
    }

    public void agregarMineralRequerido(Mineral mineral) {
        this.mineralesRequeridos.add(mineral);
    }
}