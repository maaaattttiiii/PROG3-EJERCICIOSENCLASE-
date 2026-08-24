package Ejercicio10.src;

import java.util.ArrayList;
import java.util.List;

public abstract class ComplejoDeportivo {
    private String nombre;
    private String localizacion;
    private String jefe;
    private double areaOcupadaM2;
    private SedeOlimpica sedeOlimpica;
    private List<AreaDesignada> areasDesignadas;
    private List<Evento> eventos;

    public ComplejoDeportivo(String nombre, String localizacion, String jefe, double areaOcupadaM2) {
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.jefe = jefe;
        this.areaOcupadaM2 = areaOcupadaM2;
        this.areasDesignadas = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public double getAreaOcupadaM2() {
        return areaOcupadaM2;
    }

    public void setAreaOcupadaM2(double areaOcupadaM2) {
        this.areaOcupadaM2 = areaOcupadaM2;
    }

    public SedeOlimpica getSedeOlimpica() {
        return sedeOlimpica;
    }

    public void setSedeOlimpica(SedeOlimpica sedeOlimpica) {
        this.sedeOlimpica = sedeOlimpica;
        if (sedeOlimpica != null && !sedeOlimpica.getComplejosDeportivos().contains(this)) {
            sedeOlimpica.getComplejosDeportivos().add(this);
        }
    }

    public List<AreaDesignada> getAreasDesignadas() {
        return areasDesignadas;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void agregarAreaDesignada(AreaDesignada areaDesignada) {
        if (areaDesignada == null) {
            return;
        }
        if (!areasDesignadas.contains(areaDesignada)) {
            areasDesignadas.add(areaDesignada);
        }
        if (areaDesignada.getComplejoDeportivo() != this) {
            areaDesignada.setComplejoDeportivo(this);
        }
    }

    public void agregarEvento(Evento evento) {
        if (evento == null) {
            return;
        }
        if (!eventos.contains(evento)) {
            eventos.add(evento);
        }
        if (evento.getComplejoDeportivo() != this) {
            evento.setComplejoDeportivo(this);
        }
    }

    public abstract String getTipoComplejo();
}
