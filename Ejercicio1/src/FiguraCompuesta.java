import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta {
    private List<Figura> figuras;

    public FiguraCompuesta() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        if (figura != null) {
            this.figuras.add(figura);
        }
    }

    public void eliminarFigura(Figura figura) {
        this.figuras.remove(figura);
    }

    public List<Figura> getFiguras() {
        return figuras;
    }
}
