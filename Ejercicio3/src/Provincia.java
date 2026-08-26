import java.util.List;
import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades = new ArrayList<>();

    public List<Ciudad> obtenerCiudadesEnDeficit() {
        List<Ciudad> ciudadesEnDeficit = new ArrayList<>();
        for (Ciudad ciudad : ciudades) {
            // Solo evaluamos ciudades con más de 100.000 habitantes
            if (ciudad.getCantidadHabitantes() > 100000 && ciudad.estaEnDeficit()) {
                ciudadesEnDeficit.add(ciudad);
            }
        }
        return ciudadesEnDeficit;
    }

    public boolean tieneMayoriaCiudadesEnDeficit() {
        int totalCiudadesEvaluadas = 0;
        int ciudadesEnDeficit = 0;

        for (Ciudad ciudad : ciudades) {
            if (ciudad.getCantidadHabitantes() > 100000) {
                totalCiudadesEvaluadas++;
                if (ciudad.estaEnDeficit()) {
                    ciudadesEnDeficit++;
                }
            }
        }
        return totalCiudadesEvaluadas > 0 && ciudadesEnDeficit > (totalCiudadesEvaluadas / 2);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<Ciudad> getCiudades() { return ciudades; }
    public void setCiudades(List<Ciudad> ciudades) { this.ciudades = ciudades; }
}
