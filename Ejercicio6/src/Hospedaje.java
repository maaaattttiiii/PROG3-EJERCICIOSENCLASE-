package Ejercicio6.src;

public class Hospedaje {
    private Visitante visitante;
    private Alojamiento alojamiento;
    private String fechaIngreso;
    private String fechaSalida;

    public Hospedaje(Visitante visitante, Alojamiento alojamiento, String fechaIngreso, String fechaSalida) {
        this.visitante = visitante;
        this.alojamiento = alojamiento;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;

        if (visitante != null) {
            visitante.setHospedajeActual(this);
        }
        if (alojamiento != null && !alojamiento.getHospedajes().contains(this)) {
            alojamiento.getHospedajes().add(this);
        }
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
        if (visitante != null) {
            visitante.setHospedajeActual(this);
        }
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
        if (alojamiento != null && !alojamiento.getHospedajes().contains(this)) {
            alojamiento.getHospedajes().add(this);
        }
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}