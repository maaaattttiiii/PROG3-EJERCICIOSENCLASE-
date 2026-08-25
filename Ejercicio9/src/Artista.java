import java.util.Date;

public class Artista {
    private Long id;
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaDeuncion;
    private String paisOrigen;
    private String epoca;
    private String estiloPrincipal;
    private String descripcion;
    private static Long nroId = 0L;

    // ----- CONSTRUCTOR -----
    public Artista(String nombre, Date fechaNacimiento, Date fechaDeuncion, String paisOrigen, String epoca, String estiloPrincipal, String descripcion) {
        this.id = generarId();
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDeuncion = fechaDeuncion;
        this.paisOrigen = paisOrigen;
        this.epoca = epoca;
        this.estiloPrincipal = estiloPrincipal;
        this.descripcion = descripcion;
    }

    // ----- MÉTODOS -----
    private synchronized Long generarId() {
        return ++nroId;
    }

    // ----- SETTERS Y GETTERS -----
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Date getFechaDeuncion() { return fechaDeuncion; }
    public void setFechaDeuncion(Date fechaDeuncion) { this.fechaDeuncion = fechaDeuncion; }

    public String getPaisOrigen() { return paisOrigen; }
    public void setPaisOrigen(String paisOrigen) { this.paisOrigen = paisOrigen; }

    public String getEpoca() { return epoca; }
    public void setEpoca(String epoca) { this.epoca = epoca; }

    public String getEstiloPrincipal() { return estiloPrincipal; }
    public void setEstiloPrincipal(String estiloPrincipal) { this.estiloPrincipal = estiloPrincipal; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
