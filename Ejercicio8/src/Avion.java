import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String matricula;
    private LocalDate fechaAdquisicion;
    private TipoAvion tipoAvion;
    private List<Propietario> propietarios;
    private List<Servicio> serviciosRealizados;

    public Avion(String matricula, LocalDate fechaAdquisicion, TipoAvion tipoAvion) {
        this.matricula = matricula;
        this.fechaAdquisicion = fechaAdquisicion;
        this.tipoAvion = tipoAvion;
        this.propietarios = new ArrayList<>();
        this.serviciosRealizados = new ArrayList<>();
    }

    public void agregarPropietario(Propietario propietario) {
        if (!propietarios.contains(propietario)) {
            propietarios.add(propietario);
        }
    }

    public boolean registrarServicio(Servicio nuevoServicio) {
        if (serviciosRealizados.contains(nuevoServicio)) {
            return false;
        }
        serviciosRealizados.add(nuevoServicio);
        return true;
    }

    public String getMatricula() { return matricula; }
    public LocalDate getFechaAdquisicion() { return fechaAdquisicion; }
    public TipoAvion getTipoAvion() { return tipoAvion; }
    public List<Propietario> getPropietarios() { return propietarios; }
    public List<Servicio> getServiciosRealizados() { return serviciosRealizados; }
}