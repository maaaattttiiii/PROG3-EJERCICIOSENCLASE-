public class Sucursal {
    private Long id;
    private String direccion;
    private static Long nroId = 0L;

    // ----- CONSTRUCTOR -----
    public Sucursal(String direccion) {
        this.id = generarId();
        this.direccion = direccion;
    }

    // ----- MÉTODOS -----
    private synchronized Long generarId() {
        return ++nroId;
    }

    // ----- GETTERS Y SETTERS -----
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}