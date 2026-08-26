package Ejercicio10.src;

import java.util.ArrayList;
import java.util.List;

public class ComplejoPolideportivo extends ComplejoDeportivo {
    private List<Deporte> deportes;

    public ComplejoPolideportivo(String nombre, String localizacion, String jefe, double areaOcupadaM2) {
        super(nombre, localizacion, jefe, areaOcupadaM2);
        this.deportes = new ArrayList<>();
    }

    public List<Deporte> getDeportes() {
        return deportes;
    }

    public void agregarDeporte(Deporte deporte) {
        if (deporte == null) {
            return;
        }
        if (!deportes.contains(deporte)) {
            deportes.add(deporte);
        }
    }

    @Override
    public String getTipoComplejo() {
        return "Polideportivo";
    }
}
