import java.util.ArrayList;
import java.util.List;

public class Mecanico extends Persona {
    private double salario;
    private String turno;
    private List<TipoAvion> tiposHabilitados;

    public Mecanico(String nroSeguridadSocial, String nombre, String direccion, String telefono, double salario, String turno) {
        super(nroSeguridadSocial, nombre, direccion, telefono);
        this.salario = salario;
        this.turno = turno;
        this.tiposHabilitados = new ArrayList<>();
    }

    public void agregarTipoHabilitado(TipoAvion tipo) {
        if (!tiposHabilitados.contains(tipo)) {
            tiposHabilitados.add(tipo);
        }
    }

    public List<TipoAvion> getTiposHabilitados() { return tiposHabilitados; }
    public double getSalario() { return salario; }
    public String getTurno() { return turno; }
}