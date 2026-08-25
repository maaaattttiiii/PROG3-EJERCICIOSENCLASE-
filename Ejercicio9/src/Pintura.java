import java.util.Date;

public class Pintura extends ObjetoDeArte {
    private String tipoPintura;
    private String soporte;
    private String estilo;

    // ----- CONSTRUCTOR -----
    public Pintura(String titulo, String descripcion, Date anoCreacion, String paisOrigen, String cultura, String epoca, Boolean esPrestamo, Date fechaAdq, Double coste, Boolean enExposicion, Date fechaPrestamo, Date fechaDevolucion, Artista artista, String tipoPintura, String soporte, String estilo) {
        super(titulo, descripcion, anoCreacion, paisOrigen, cultura, epoca, esPrestamo, fechaAdq, coste, enExposicion, fechaPrestamo, fechaDevolucion, artista);
        this.tipoPintura = tipoPintura;
        this.soporte = soporte;
        this.estilo = estilo;
    }

    // ----- SETTERS Y GETTERS -----
    public String getTipoPintura() { return tipoPintura; }
    public void setTipoPintura(String tipoPintura) { this.tipoPintura = tipoPintura; }

    public String getSoporte() { return soporte; }
    public void setSoporte(String soporte) { this.soporte = soporte; }

    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }
}