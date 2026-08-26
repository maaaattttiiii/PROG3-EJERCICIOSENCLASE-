package Ejercicio6.src;

import java.util.ArrayList;
import java.util.List;

public class Personal extends Persona {
    private String cargo;
    private Area areaAsignada;
    private List<ProyectoInvestigacion> proyectos;

    public Personal(String nombre, String documento, String telefono, String cargo) {
        super(nombre, documento, telefono);
        this.cargo = cargo;
        this.proyectos = new ArrayList<>();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Area getAreaAsignada() {
        return areaAsignada;
    }

    public void setAreaAsignada(Area areaAsignada) {
        this.areaAsignada = areaAsignada;
    }

    public List<ProyectoInvestigacion> getProyectos() {
        return proyectos;
    }

    public void agregarProyecto(ProyectoInvestigacion proyecto) {
        if (proyecto == null) {
            return;
        }
        if (!proyectos.contains(proyecto)) {
            proyectos.add(proyecto);
        }
        if (!proyecto.getInvestigadores().contains(this)) {
            proyecto.getInvestigadores().add(this);
        }
    }
}