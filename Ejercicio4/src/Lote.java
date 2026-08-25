import java.util.ArrayList;
import java.util.List;

public abstract class Lote {
    private String id;
    private List<Mineral> mineralesPresentes;
    private List<Cereal> historialSiembras;

    // Constructor para inicializar las listas y evitar NullPointerException
    public Lote(String id) {
        this.id = id;
        this.mineralesPresentes = new ArrayList<>();
        this.historialSiembras = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public List<Mineral> getMineralesPresentes() {
        return mineralesPresentes;
    }

    public List<Cereal> getHistorialSiembras() {
        return historialSiembras;
    }

    public void agregarMineral(Mineral mineral) {
        this.mineralesPresentes.add(mineral);
    }

    public void sembrar(Cereal cereal) {
        this.historialSiembras.add(cereal);
    }

    public boolean satisfaceRequerimientos(Cereal cereal) {
        return mineralesPresentes.containsAll(cereal.getMineralesRequeridos());
    }

    public abstract boolean esEspecial();
}