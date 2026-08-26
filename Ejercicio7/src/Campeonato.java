import java.util.List;
import java.util.ArrayList;

public class Campeonato {
    private String nombre;
    private int anio;
    private List<Prueba> pruebas = new ArrayList<>();

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }
    public List<Prueba> getPruebas() { return pruebas; }
    public void setPruebas(List<Prueba> pruebas) { this.pruebas = pruebas; }
}