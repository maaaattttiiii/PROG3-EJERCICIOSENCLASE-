import java.util.Date;

public class Otros extends ObjetoDeArte {
    private String tipo;

    // ----- CONSTRUCTOR -----
    public Otros(String titulo, String descripcion, Date anoCreacion, String paisOrigen, String cultura, String epoca, Boolean esPrestamo, Date fechaAdq, Double coste, Boolean enExposicion, Date fechaPrestamo, Date fechaDevolucion, Artista artista, String tipo) {
        super(titulo, descripcion, anoCreacion, paisOrigen, cultura, epoca, esPrestamo, fechaAdq, coste, enExposicion, fechaPrestamo, fechaDevolucion, artista);
        this.tipo = tipo;
    }

    // ----- SETTERS Y GETTERS -----
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}