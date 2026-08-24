package Ejercicio6.src;

import java.util.ArrayList;
import java.util.List;

public class Area {
    private String nombre;
    private String tipo;
    private ParqueNacional parqueNacional;
    private List<Especie> especies;

    public Area(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.especies = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ParqueNacional getParqueNacional() {
        return parqueNacional;
    }

    public void setParqueNacional(ParqueNacional parqueNacional) {
        this.parqueNacional = parqueNacional;
        if (parqueNacional != null && !parqueNacional.getAreas().contains(this)) {
            parqueNacional.getAreas().add(this);
        }
    }

    public List<Especie> getEspecies() {
        return especies;
    }

    public void agregarEspecie(Especie especie) {
        if (especie == null) {
            return;
        }
        if (!especies.contains(especie)) {
            especies.add(especie);
        }
        if (especie.getAreaHabitat() != this) {
            especie.setAreaHabitat(this);
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}