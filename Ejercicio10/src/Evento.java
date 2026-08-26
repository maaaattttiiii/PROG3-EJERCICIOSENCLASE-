package Ejercicio10.src;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fecha;
    private int duracionHoras;
    private int nroParticipantes;
    private AreaDesignada areaDesignada;
    private ComplejoDeportivo complejoDeportivo;
    private List<Comisario> comisarios;
    private List<Material> materiales;

    public Evento(String nombre, String fecha, int duracionHoras, int nroParticipantes, AreaDesignada areaDesignada) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracionHoras = duracionHoras;
        this.nroParticipantes = nroParticipantes;
        this.areaDesignada = areaDesignada;
        this.comisarios = new ArrayList<>();
        this.materiales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public int getNroParticipantes() {
        return nroParticipantes;
    }

    public void setNroParticipantes(int nroParticipantes) {
        this.nroParticipantes = nroParticipantes;
    }

    public AreaDesignada getAreaDesignada() {
        return areaDesignada;
    }

    public void setAreaDesignada(AreaDesignada areaDesignada) {
        this.areaDesignada = areaDesignada;
    }

    public ComplejoDeportivo getComplejoDeportivo() {
        return complejoDeportivo;
    }

    public void setComplejoDeportivo(ComplejoDeportivo complejoDeportivo) {
        this.complejoDeportivo = complejoDeportivo;
        if (complejoDeportivo != null && !complejoDeportivo.getEventos().contains(this)) {
            complejoDeportivo.getEventos().add(this);
        }
    }

    public List<Comisario> getComisarios() {
        return comisarios;
    }

    public List<Material> getMateriales() {
        return materiales;
    }

    public void agregarComisario(Comisario comisario) {
        if (comisario == null) {
            return;
        }
        if (!comisarios.contains(comisario)) {
            comisarios.add(comisario);
        }
        if (!comisario.getEventos().contains(this)) {
            comisario.getEventos().add(this);
        }
    }

    public void agregarMaterial(Material material) {
        if (material == null) {
            return;
        }
        if (!materiales.contains(material)) {
            materiales.add(material);
        }
    }
}
