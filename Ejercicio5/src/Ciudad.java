public class Ciudad {
    private Long id;
    private String nombre;
    private static Long nroId = 0L;

    // ----- CONSTRUCTOR -----
    public Ciudad(String nombre) {
        this.id = generarId();
        this.nombre = nombre;
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
}