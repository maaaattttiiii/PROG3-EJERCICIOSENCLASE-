package Ejercicio6.src;

import java.util.ArrayList;
import java.util.List;

public class ComunidadAutonoma {
    private String nombre;
    private List<ParqueNacional> parquesNacionales;

    public ComunidadAutonoma(String nombre) {
        this.nombre = nombre;
        this.parquesNacionales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<ParqueNacional> getParquesNacionales() {
        return parquesNacionales;
    }

    public void agregarParqueNacional(ParqueNacional parque) {
        if (parque == null) {
            return;
        }
        if (!parquesNacionales.contains(parque)) {
            parquesNacionales.add(parque);
        }
        if (parque.getComunidadAutonoma() != this) {
            parque.setComunidadAutonoma(this);
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
}