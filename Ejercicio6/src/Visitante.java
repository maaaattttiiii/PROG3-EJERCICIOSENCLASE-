package Ejercicio6.src;

import java.util.ArrayList;
import java.util.List;

public class Visitante extends Persona {
    private String origen;
    private List<Entrada> entradas;
    private List<Excursion> excursionesReservadas;
    private Hospedaje hospedajeActual;

    public Visitante(String nombre, String documento, String telefono, String origen) {
        super(nombre, documento, telefono);
        this.origen = origen;
        this.entradas = new ArrayList<>();
        this.excursionesReservadas = new ArrayList<>();
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public List<Excursion> getExcursionesReservadas() {
        return excursionesReservadas;
    }

    public Hospedaje getHospedajeActual() {
        return hospedajeActual;
    }

    public void setHospedajeActual(Hospedaje hospedajeActual) {
        this.hospedajeActual = hospedajeActual;
    }

    public void agregarEntrada(Entrada entrada) {
        if (entrada == null) {
            return;
        }
        if (!entradas.contains(entrada)) {
            entradas.add(entrada);
        }
        if (entrada.getVisitante() != this) {
            entrada.setVisitante(this);
        }
    }

    public void reservarExcursion(Excursion excursion) {
        if (excursion == null) {
            return;
        }
        if (!excursionesReservadas.contains(excursion)) {
            excursion.agregarVisitante(this);
        }
    }
}