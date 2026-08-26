package Ejercicio6.src;

import java.util.ArrayList;
import java.util.List;

public class ParqueNacional {
    private String nombre;
    private ComunidadAutonoma comunidadAutonoma;
    private Organismo organismoGestor;
    private List<Area> areas;
    private List<ProyectoInvestigacion> proyectosInvestigacion;
    private List<Personal> personal;
    private List<Excursion> excursiones;
    private List<Alojamiento> alojamientos;
    private List<RegistroVisita> registrosVisita;

    public ParqueNacional(String nombre) {
        this.nombre = nombre;
        this.areas = new ArrayList<>();
        this.proyectosInvestigacion = new ArrayList<>();
        this.personal = new ArrayList<>();
        this.excursiones = new ArrayList<>();
        this.alojamientos = new ArrayList<>();
        this.registrosVisita = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ComunidadAutonoma getComunidadAutonoma() {
        return comunidadAutonoma;
    }

    public void setComunidadAutonoma(ComunidadAutonoma comunidadAutonoma) {
        this.comunidadAutonoma = comunidadAutonoma;
        if (comunidadAutonoma != null && !comunidadAutonoma.getParquesNacionales().contains(this)) {
            comunidadAutonoma.getParquesNacionales().add(this);
        }
    }

    public Organismo getOrganismoGestor() {
        return organismoGestor;
    }

    public void setOrganismoGestor(Organismo organismoGestor) {
        this.organismoGestor = organismoGestor;
        if (organismoGestor != null && !organismoGestor.getParquesGestionados().contains(this)) {
            organismoGestor.getParquesGestionados().add(this);
        }
    }

    public List<Area> getAreas() {
        return areas;
    }

    public List<ProyectoInvestigacion> getProyectosInvestigacion() {
        return proyectosInvestigacion;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public List<Excursion> getExcursiones() {
        return excursiones;
    }

    public List<Alojamiento> getAlojamientos() {
        return alojamientos;
    }

    public List<RegistroVisita> getRegistrosVisita() {
        return registrosVisita;
    }

    public void agregarArea(Area area) {
        if (area == null) {
            return;
        }
        if (!areas.contains(area)) {
            areas.add(area);
        }
        if (area.getParqueNacional() != this) {
            area.setParqueNacional(this);
        }
    }

    public void agregarProyectoInvestigacion(ProyectoInvestigacion proyecto) {
        if (proyecto == null) {
            return;
        }
        if (!proyectosInvestigacion.contains(proyecto)) {
            proyectosInvestigacion.add(proyecto);
        }
    }

    public void agregarPersonal(Personal integrante) {
        if (integrante == null) {
            return;
        }
        if (!personal.contains(integrante)) {
            personal.add(integrante);
        }
    }

    public void agregarExcursion(Excursion excursion) {
        if (excursion == null) {
            return;
        }
        if (!excursiones.contains(excursion)) {
            excursiones.add(excursion);
        }
    }

    public void agregarAlojamiento(Alojamiento alojamiento) {
        if (alojamiento == null) {
            return;
        }
        if (!alojamientos.contains(alojamiento)) {
            alojamientos.add(alojamiento);
        }
        if (alojamiento.getParqueNacional() != this) {
            alojamiento.setParqueNacional(this);
        }
    }

    public void agregarRegistroVisita(RegistroVisita registro) {
        if (registro == null) {
            return;
        }
        if (!registrosVisita.contains(registro)) {
            registrosVisita.add(registro);
        }
    }
}