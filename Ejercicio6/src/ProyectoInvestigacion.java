package Ejercicio6.src;

import java.util.ArrayList;
import java.util.List;

public class ProyectoInvestigacion {
    private String titulo;
    private String objetivo;
    private Area area;
    private List<Personal> investigadores;
    private List<Especie> especiesObjetivo;

    public ProyectoInvestigacion(String titulo, String objetivo, Area area) {
        this.titulo = titulo;
        this.objetivo = objetivo;
        this.area = area;
        this.investigadores = new ArrayList<>();
        this.especiesObjetivo = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Personal> getInvestigadores() {
        return investigadores;
    }

    public List<Especie> getEspeciesObjetivo() {
        return especiesObjetivo;
    }

    public void agregarInvestigador(Personal investigador) {
        if (investigador == null) {
            return;
        }
        if (!investigadores.contains(investigador)) {
            investigadores.add(investigador);
        }
        if (!investigador.getProyectos().contains(this)) {
            investigador.getProyectos().add(this);
        }
    }

    public void agregarEspecieObjetivo(Especie especie) {
        if (especie == null) {
            return;
        }
        if (!especiesObjetivo.contains(especie)) {
            especiesObjetivo.add(especie);
        }
    }
}