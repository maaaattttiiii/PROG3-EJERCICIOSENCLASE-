import java.util.Date;
import java.util.List;

public class Inscripcion {
    private Participante participante;
    private Prueba prueba;
    private List<Date> fechasCompeticion;
    private float tiempoEmpleado;
    private int posicion;

    public Participante getParticipante() { return participante; }
    public void setParticipante(Participante participante) { this.participante = participante; }
    public Prueba getPrueba() { return prueba; }
    public void setPrueba(Prueba prueba) { this.prueba = prueba; }
    public List<Date> getFechasCompeticion() { return fechasCompeticion; }
    public void setFechasCompeticion(List<Date> fechasCompeticion) { this.fechasCompeticion = fechasCompeticion; }
    public float getTiempoEmpleado() { return tiempoEmpleado; }
    public void setTiempoEmpleado(float tiempoEmpleado) { this.tiempoEmpleado = tiempoEmpleado; }
    public int getPosicion() { return posicion; }
    public void setPosicion(int posicion) { this.posicion = posicion; }
}