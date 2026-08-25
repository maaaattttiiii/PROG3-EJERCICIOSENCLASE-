public class ColeccionDeObras {
    private Long id;
    private String nombre;
    private String tipo;
    private String descripcion;
    private String direccion;
    private String telefono;
    private String personaContacto;
    private static Long nroId = 0L;

    // ----- CONSTRUCTOR -----
    public ColeccionDeObras(String nombre, String tipo, String descripcion, String direccion, String telefono, String personaContacto) {
        this.id = generarId();
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personaContacto = personaContacto;
    }

    // ----- MÉTODOS -----
    private synchronized Long generarId() {
        return ++nroId;
    }

    // ----- GETTERS Y SETTERS -----
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getPersonaContacto() { return personaContacto; }
    public void setPersonaContacto(String personaContacto) { this.personaContacto = personaContacto; }
}