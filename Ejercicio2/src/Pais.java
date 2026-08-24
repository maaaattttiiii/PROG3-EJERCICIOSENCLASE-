package Ejercicio2.src;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private List<Provincia> provincias;
    private Ciudad capital;
    private List<Pais> limitesPaises;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
        this.limitesPaises = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public Ciudad getCapital() {
        return capital;
    }

    public void agregarProvincia(Provincia provincia) {
        if (provincia == null) {
            return;
        }
        if (!this.provincias.contains(provincia)) {
            this.provincias.add(provincia);
        }
    }

    public void setCapital(Ciudad capital) {
        if (capital == null) {
            this.capital = null;
            return;
        }
        boolean pertenece = false;
        for (Provincia provincia : this.provincias) {
            if (provincia.getCiudades().contains(capital)) {
                pertenece = true;
                break;
            }
        }
        if (!pertenece) {
            throw new IllegalArgumentException("La capital debe pertenecer a alguna provincia del país.");
        }
        this.capital = capital;
    }

    public List<Pais> getLimitesPaises() {
        return limitesPaises;
    }

    public void agregarLimitePais(Pais pais) {
        if (pais == null || this == pais) {
            return;
        }
        if (!this.limitesPaises.contains(pais)) {
            this.limitesPaises.add(pais);
        }
        if (!pais.getLimitesPaises().contains(this)) {
            pais.getLimitesPaises().add(this);
        }
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", provincias=" + provincias +
                ", capital=" + capital +
                ", limitesPaises=" + limitesPaises +
                '}';
    }
}
