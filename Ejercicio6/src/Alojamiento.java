package Ejercicio6.src;

import java.util.ArrayList;
import java.util.List;

public class Alojamiento {
    private String nombre;
    private String tipo;
    private int capacidad;
    private ParqueNacional parqueNacional;
    private List<Hospedaje> hospedajes;

    public Alojamiento(String nombre, String tipo, int capacidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.hospedajes = new ArrayList<>();
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ParqueNacional getParqueNacional() {
        return parqueNacional;
    }

    public void setParqueNacional(ParqueNacional parqueNacional) {
        this.parqueNacional = parqueNacional;
        if (parqueNacional != null && !parqueNacional.getAlojamientos().contains(this)) {
            parqueNacional.getAlojamientos().add(this);
        }
    }

    public List<Hospedaje> getHospedajes() {
        return hospedajes;
    }

    public void registrarHospedaje(Hospedaje hospedaje) {
        if (hospedaje == null) {
            return;
        }
        if (!hospedajes.contains(hospedaje)) {
            hospedajes.add(hospedaje);
        }
        if (hospedaje.getAlojamiento() != this) {
            hospedaje.setAlojamiento(this);
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ", cap=" + capacidad + ")";
    }
}