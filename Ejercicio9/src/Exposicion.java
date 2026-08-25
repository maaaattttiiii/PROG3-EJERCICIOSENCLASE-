import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exposicion {
    private Long id;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFin;
    private static Long nroId = 0L;

    private List<ObjetoDeArte> objetosExhibidos;

    // ----- CONSTRUCTOR -----
    public Exposicion(String nombre, Date fechaInicio, Date fechaFin) {
        this.id = generarId();
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.objetosExhibidos = new ArrayList<>();
    }

    // ----- NÉTODOS -----
    private synchronized Long generarId() {
        return ++nroId;
    }

    public void agregarObjeto(ObjetoDeArte objeto) {
        if (!objetosExhibidos.contains(objeto)) {
            objetosExhibidos.add(objeto);
        }
    }

    // ----- GETTERS Y SETTERS -----
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }

    public Date getFechaFin() { return fechaFin; }
    public void setFechaFin(Date fechaFin) { this.fechaFin = fechaFin; }

    public List<ObjetoDeArte> getObjetosExhibidos() { return objetosExhibidos; }
}