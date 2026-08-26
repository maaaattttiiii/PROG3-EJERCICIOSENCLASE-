import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public abstract class RepresentanteVentas {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected Date fechaNacimiento;
    protected String cuitCuil;
    protected Date fechaIncorporacion;

    protected List<Cliente> clientes = new ArrayList<>();

    protected List<TicketVenta> ticketsComprados = new ArrayList<>();

    public abstract float calcularComision(Date desde);

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getCuitCuil() { return cuitCuil; }
    public void setCuitCuil(String cuitCuil) { this.cuitCuil = cuitCuil; }
    public Date getFechaIncorporacion() { return fechaIncorporacion; }
    public void setFechaIncorporacion(Date fechaIncorporacion) { this.fechaIncorporacion = fechaIncorporacion; }
    public List<Cliente> getClientes() { return clientes; }
    public void setClientes(List<Cliente> clientes) { this.clientes = clientes; }
    public List<TicketVenta> getTicketsComprados() { return ticketsComprados; }
    public void setTicketsComprados(List<TicketVenta> ticketsComprados) { this.ticketsComprados = ticketsComprados; }
}