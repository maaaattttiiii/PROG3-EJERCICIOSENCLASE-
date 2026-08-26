import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Prueba {
    private String nombre;
    private String tipo;
    private List<Date> fechasPrevistas;
    private Estacion estacion;
    private List<Pista> pistasUtilizadas = new ArrayList<>();

    private Participante vencedor;
    private float tiempoVencedor;

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public List<Date> getFechasPrevistas() { return fechasPrevistas; }
    public void setFechasPrevistas(List<Date> fechasPrevistas) { this.fechasPrevistas = fechasPrevistas; }
    public Estacion getEstacion() { return estacion; }
    public void setEstacion(Estacion estacion) { this.estacion = estacion; }
    public List<Pista> getPistasUtilizadas() { return pistasUtilizadas; }
    public void setPistasUtilizadas(List<Pista> pistasUtilizadas) { this.pistasUtilizadas = pistasUtilizadas; }
    public Participante getVencedor() { return vencedor; }
    public void setVencedor(Participante vencedor) { this.vencedor = vencedor; }
    public float getTiempoVencedor() { return tiempoVencedor; }
    public void setTiempoVencedor(float tiempoVencedor) { this.tiempoVencedor = tiempoVencedor; }
}