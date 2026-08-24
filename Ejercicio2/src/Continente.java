package Ejercicio2.src;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nombre;
    private List<Pais> paises;

    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pais> getPaises() {
        return paises;
    }

    public void agregarPais(Pais pais) {
        if (pais == null) {
            return;
        }
        if (!this.paises.contains(pais)) {
            this.paises.add(pais);
        }
    }

    @Override
    public String toString() {
        return "Continente{" +
                "nombre='" + nombre + '\'' +
                ", paises=" + paises +
                '}';
    }
}
