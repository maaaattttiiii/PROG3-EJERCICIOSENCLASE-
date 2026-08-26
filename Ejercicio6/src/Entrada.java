package Ejercicio6.src;

public class Entrada {
    private String codigo;
    private String fecha;
    private ParqueNacional parqueNacional;
    private Visitante visitante;

    public Entrada(String codigo, String fecha, ParqueNacional parqueNacional) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.parqueNacional = parqueNacional;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ParqueNacional getParqueNacional() {
        return parqueNacional;
    }

    public void setParqueNacional(ParqueNacional parqueNacional) {
        this.parqueNacional = parqueNacional;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public void setVisitante(Visitante visitante) {
        this.visitante = visitante;
        if (visitante != null && !visitante.getEntradas().contains(this)) {
            visitante.getEntradas().add(this);
        }
    }

    @Override
    public String toString() {
        return codigo + " - " + fecha;
    }
}