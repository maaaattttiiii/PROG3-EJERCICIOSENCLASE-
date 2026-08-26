package Ejercicio10.src;

import java.util.ArrayList;
import java.util.List;

public class SedeOlimpica {
    private String nombre;
    private String ciudad;
    private List<ComplejoDeportivo> complejosDeportivos;

    public SedeOlimpica(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.complejosDeportivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<ComplejoDeportivo> getComplejosDeportivos() {
        return complejosDeportivos;
    }

    public void agregarComplejoDeportivo(ComplejoDeportivo complejo) {
        if (complejo == null) {
            return;
        }
        if (!complejosDeportivos.contains(complejo)) {
            complejosDeportivos.add(complejo);
        }
        if (complejo.getSedeOlimpica() != this) {
            complejo.setSedeOlimpica(this);
        }
    }
}
