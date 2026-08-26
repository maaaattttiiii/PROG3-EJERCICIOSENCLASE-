import java.util.Date;

public class Esquiador extends Participante {
    private String DNI;
    private String nombre;
    private Date fechaNacimiento;
    private Federacion federacion;

    public int getEdad() {
        return 0;
    }

    public String getDNI() { return DNI; }
    public void setDNI(String DNI) { this.DNI = DNI; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public Federacion getFederacion() { return federacion; }
    public void setFederacion(Federacion federacion) { this.federacion = federacion; }
}