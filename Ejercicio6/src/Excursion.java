package Ejercicio6.src;

import java.util.ArrayList;
import java.util.List;

public class Excursion {
    private String nombre;
    private Area area;
    private Personal guia;
    private int cupoMaximo;
    private Vehiculo vehiculo;
    private List<Visitante> visitantes;

    public Excursion(String nombre, Area area, Personal guia, int cupoMaximo) {
        this.nombre = nombre;
        this.area = area;
        this.guia = guia;
        this.cupoMaximo = cupoMaximo;
        this.visitantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Personal getGuia() {
        return guia;
    }

    public void setGuia(Personal guia) {
        this.guia = guia;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        if (cupoMaximo < visitantes.size()) {
            throw new IllegalArgumentException("El cupo no puede ser menor a los visitantes registrados.");
        }
        this.cupoMaximo = cupoMaximo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null && vehiculo.getCapacidad() < visitantes.size()) {
            throw new IllegalArgumentException("Capacidad del vehiculo insuficiente para visitantes actuales.");
        }
        this.vehiculo = vehiculo;
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }

    public void agregarVisitante(Visitante visitante) {
        if (visitante == null) {
            return;
        }
        if (visitantes.contains(visitante)) {
            return;
        }
        if (visitantes.size() >= cupoMaximo) {
            throw new IllegalStateException("No hay cupo disponible para la excursion.");
        }
        if (vehiculo != null && visitantes.size() >= vehiculo.getCapacidad()) {
            throw new IllegalStateException("Capacidad del vehiculo alcanzada.");
        }
        visitantes.add(visitante);
        if (!visitante.getExcursionesReservadas().contains(this)) {
            visitante.getExcursionesReservadas().add(this);
        }
    }
}