import java.util.List;

public class Cuadrilatero extends Poligono {
    public Cuadrilatero(List<Lado> lados) {
        super(lados);
        if (lados.size() != 4) {
            throw new IllegalArgumentException("Un cuadrilátero debe tener exactamente 4 lados.");
        }
    }
}
