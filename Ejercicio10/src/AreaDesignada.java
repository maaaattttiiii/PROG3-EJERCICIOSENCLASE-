package Ejercicio10.src;

public class AreaDesignada {
    private String nombre;
    private String situacion;
    private Deporte deporte;
    private ComplejoDeportivo complejoDeportivo;

    public AreaDesignada(String nombre, String situacion, Deporte deporte) {
        this.nombre = nombre;
        this.situacion = situacion;
        this.deporte = deporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public void setDeporte(Deporte deporte) {
        this.deporte = deporte;
    }

    public ComplejoDeportivo getComplejoDeportivo() {
        return complejoDeportivo;
    }

    public void setComplejoDeportivo(ComplejoDeportivo complejoDeportivo) {
        this.complejoDeportivo = complejoDeportivo;
        if (complejoDeportivo != null && !complejoDeportivo.getAreasDesignadas().contains(this)) {
            complejoDeportivo.getAreasDesignadas().add(this);
        }
    }
}
