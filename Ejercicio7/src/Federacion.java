import java.util.List;
import java.util.ArrayList;

public class Federacion {
    private String nombre;
    private List<Estacion> estacionesAdministradas = new ArrayList<>();

    public int getNumeroFederados() {
        return 0;
    }


    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Estacion> getEstacionesAdministradas() { return estacionesAdministradas; }
    public void setEstacionesAdministradas(List<Estacion> estaciones) { this.estacionesAdministradas = estaciones; }
}