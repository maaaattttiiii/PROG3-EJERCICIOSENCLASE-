package Ejercicio6.src;

import java.util.ArrayList;
import java.util.List;

public class Organismo {
    private String nombre;
    private String tipo;
    private List<ParqueNacional> parquesGestionados;

    public Organismo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.parquesGestionados = new ArrayList<>();
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

    public List<ParqueNacional> getParquesGestionados() {
        return parquesGestionados;
    }

    public void agregarParqueGestionado(ParqueNacional parque) {
        if (parque == null) {
            return;
        }
        if (!parquesGestionados.contains(parque)) {
            parquesGestionados.add(parque);
        }
        if (parque.getOrganismoGestor() != this) {
            parque.setOrganismoGestor(this);
        }
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + ")";
    }
}