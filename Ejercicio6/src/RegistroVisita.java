package Ejercicio6.src;

public class RegistroVisita {
    private Entrada entrada;
    private Excursion excursion;
    private Hospedaje hospedaje;
    private String observaciones;

    public RegistroVisita(Entrada entrada, Excursion excursion, Hospedaje hospedaje, String observaciones) {
        this.entrada = entrada;
        this.excursion = excursion;
        this.hospedaje = hospedaje;
        this.observaciones = observaciones;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Excursion getExcursion() {
        return excursion;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}