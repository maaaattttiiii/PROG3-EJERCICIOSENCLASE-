import java.time.LocalDate;
import java.util.Objects;

public class Servicio {
    private LocalDate fecha;
    private double horasInvertidas;
    private String tipoTrabajo;
    private Mecanico mecanico;

    public Servicio(LocalDate fecha, double horasInvertidas, String tipoTrabajo, Mecanico mecanico) {
        this.fecha = fecha;
        this.horasInvertidas = horasInvertidas;
        this.tipoTrabajo = tipoTrabajo;
        this.mecanico = mecanico;
    }

    public LocalDate getFecha() { return fecha; }
    public double getHorasInvertidas() { return horasInvertidas; }
    public String getTipoTrabajo() { return tipoTrabajo; }
    public Mecanico getMecanico() { return mecanico; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicio servicio = (Servicio) o;
        return Objects.equals(fecha, servicio.fecha) && Objects.equals(tipoTrabajo, servicio.tipoTrabajo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fecha, tipoTrabajo);
    }
}