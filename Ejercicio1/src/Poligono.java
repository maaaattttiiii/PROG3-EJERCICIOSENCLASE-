import java.util.List;

public class Poligono {
    private int numLados;
    private List<Lado> lados;

    public Poligono(List<Lado> lados) {
        if (lados == null || lados.isEmpty()) {
            throw new IllegalArgumentException("Un polígono debe tener al menos 1..N lados.");
        }
        this.lados = lados;
        this.numLados = lados.size();
    }

    public int getNumLados() {
        return numLados;
    }

    public List<Lado> getLados() {
        return lados;
    }
}
