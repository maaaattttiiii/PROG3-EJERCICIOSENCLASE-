package Ejercicio6.src;

public class Vehiculo {
    private String patente;
    private String tipo;
    private int capacidad;
    private Personal conductor;

    public Vehiculo(String patente, String tipo, int capacidad, Personal conductor) {
        this.patente = patente;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.conductor = conductor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
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

    public Personal getConductor() {
        return conductor;
    }

    public void setConductor(Personal conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return tipo + " " + patente + " (cap=" + capacidad + ")";
    }
}