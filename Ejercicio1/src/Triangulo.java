import java.util.List;

public class Triangulo extends Poligono{
    public Triangulo(List<Lado> lados) {
        super(lados);
        if (lados.size() != 3) {
            throw new IllegalArgumentException("Un triángulo debe tener exactamente 3 lados.");
        }
    }
}
