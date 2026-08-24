package Ejercicio2.src;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;
    private Ciudad capital;
    private List<Provincia> limitesProvincias;
    private List<Pais> limitesPaises;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
        this.limitesProvincias = new ArrayList<>();
        this.limitesPaises = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void agregarCiudad(Ciudad ciudad) {
        if (ciudad == null) {
            throw new IllegalArgumentException("La ciudad no puede ser nula.");
        }
        if (!this.ciudades.contains(ciudad)) {
            this.ciudades.add(ciudad);
        }
    }

    public void setCapital(Ciudad capital) {
        if (capital == null) {
            this.capital = null;
            return;
        }
        if (!this.ciudades.contains(capital)) {
            throw new IllegalArgumentException("La capital debe pertenecer a la provincia.");
        }
        this.capital = capital;
    }

    public List<Provincia> getLimitesProvincias() {
        return limitesProvincias;
    }

    public List<Pais> getLimitesPaises() {
        return limitesPaises;
    }

    public void agregarLimiteProvincia(Provincia provincia) {
        if (provincia == null || this == provincia) {
            return;
        }
        if (!this.limitesProvincias.contains(provincia)) {
            this.limitesProvincias.add(provincia);
        }
        if (!provincia.getLimitesProvincias().contains(this)) {
            provincia.getLimitesProvincias().add(this);
        }
    }

    public void agregarLimitePais(Pais pais) {
        if (pais == null) {
            return;
        }
        if (!this.limitesPaises.contains(pais)) {
            this.limitesPaises.add(pais);
        }
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "nombre='" + nombre + '\'' +
                ", ciudades=" + ciudades +
                ", capital=" + capital +
                ", limitesProvincias=" + limitesProvincias +
                ", limitesPaises=" + limitesPaises +
                '}';
    }
}
