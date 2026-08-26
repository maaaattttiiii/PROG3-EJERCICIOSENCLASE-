import java.util.List;
import java.util.ArrayList;

public class Pais {
    private String nombre;
    private List<Provincia> provincias = new ArrayList<>();

    public List<Ciudad> obtenerCiudadesEnDeficit() {
        List<Ciudad> ciudadesEnDeficit = new ArrayList<>();
        for (Provincia prov : provincias) {
            ciudadesEnDeficit.addAll(prov.obtenerCiudadesEnDeficit());
        }
        return ciudadesEnDeficit;
    }

    public List<Provincia> obtenerProvinciasEnDeficit() {
        List<Provincia> provinciasEnDeficit = new ArrayList<>();
        for (Provincia prov : provincias) {
            if (prov.tieneMayoriaCiudadesEnDeficit()) {
                provinciasEnDeficit.add(prov);
            }
        }
        return provinciasEnDeficit;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Provincia> getProvincias() { return provincias; }
    public void setProvincias(List<Provincia> provincias) { this.provincias = provincias; }
}
