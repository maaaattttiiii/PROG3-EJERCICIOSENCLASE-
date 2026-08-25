import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class ObjetoDeArte {
    private Long id;
    private String titulo;
    private String descripcion;
    private Date anoCreacion;
    private String paisOrigen;
    private String cultura;
    private String epoca;
    private Boolean esPrestamo;
    private Date fechaAdq;
    private Double coste;
    private Boolean enExposicion;
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private static Long nroId = 0L;

    private Artista artista;
    private ColeccionDeObras coleccionOrigen; // Null si es propio
    private List<Categoria> categorias;

    // ----- CONSTRUCTOR -----
    public ObjetoDeArte(String titulo, String descripcion, Date anoCreacion, String paisOrigen, String cultura, String epoca, Boolean esPrestamo, Date fechaAdq, Double coste, Boolean enExposicion, Date fechaPrestamo, Date fechaDevolucion, Artista artista) {
        this.id = generarId();
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anoCreacion = anoCreacion;
        this.paisOrigen = paisOrigen;
        this.cultura = cultura;
        this.epoca = epoca;
        this.esPrestamo = esPrestamo;
        this.fechaAdq = fechaAdq;
        this.coste = coste;
        this.enExposicion = enExposicion;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.artista = artista;
        this.categorias = new ArrayList<>();
    }

    // ----- MÉTODOS -----
    private synchronized Long generarId() {
        return ++nroId;
    }

    public void agregarCategoria(Categoria categoria) {
        if (!categorias.contains(categoria)) {
            categorias.add(categoria);
        }
    }

    // ----- SETTERS Y GETTERS -----
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Date getAnoCreacion() { return anoCreacion; }
    public void setAnoCreacion(Date anoCreacion) { this.anoCreacion = anoCreacion; }

    public String getPaisOrigen() { return paisOrigen; }
    public void setPaisOrigen(String paisOrigen) { this.paisOrigen = paisOrigen; }

    public String getCultura() { return cultura; }
    public void setCultura(String cultura) { this.cultura = cultura; }

    public String getEpoca() { return epoca; }
    public void setEpoca(String epoca) { this.epoca = epoca; }

    public Boolean getEsPrestamo() { return esPrestamo; }
    public void setEsPrestamo(Boolean esPrestamo) { this.esPrestamo = esPrestamo; }

    public Date getFechaAdq() { return fechaAdq; }
    public void setFechaAdq(Date fechaAdq) { this.fechaAdq = fechaAdq; }

    public Double getCoste() { return coste; }
    public void setCoste(Double coste) { this.coste = coste; }

    public Boolean getEnExposicion() { return enExposicion; }
    public void setEnExposicion(Boolean enExposicion) { this.enExposicion = enExposicion; }

    public Date getFechaPrestamo() { return fechaPrestamo; }
    public void setFechaPrestamo(Date fechaPrestamo) { this.fechaPrestamo = fechaPrestamo; }

    public Date getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(Date fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }

    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }

    public ColeccionDeObras getColeccionOrigen() { return coleccionOrigen; }
    public void setColeccionOrigen(ColeccionDeObras coleccionOrigen) { this.coleccionOrigen = coleccionOrigen; }

    public List<Categoria> getCategorias() { return categorias; }
}