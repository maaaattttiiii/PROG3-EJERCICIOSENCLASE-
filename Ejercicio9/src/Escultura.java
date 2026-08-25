import java.util.Date;

public class Escultura extends ObjetoDeArte {
    private String material;
    private Double altura;
    private Double peso;
    private String estilo;

    // ----- CONSTRUCTOR -----
    public Escultura(String titulo, String descripcion, Date anoCreacion, String paisOrigen, String cultura, String epoca, Boolean esPrestamo, Date fechaAdq, Double coste, Boolean enExposicion, Date fechaPrestamo, Date fechaDevolucion, Artista artista, String material, Double altura, Double peso, String estilo) {
        super(titulo, descripcion, anoCreacion, paisOrigen, cultura, epoca, esPrestamo, fechaAdq, coste, enExposicion, fechaPrestamo, fechaDevolucion, artista);
        this.material = material;
        this.altura = altura;
        this.peso = peso;
        this.estilo = estilo;
    }

    // ----- SETTERS Y GETTERS -----
    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public Double getAltura() { return altura; }
    public void setAltura(Double altura) { this.altura = altura; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }

    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }
}