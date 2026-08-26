public abstract class Persona {
    private String nroSeguridadSocial;
    private String nombre;
    private String direccion;
    private String telefono;

    public Persona(String nroSeguridadSocial, String nombre, String direccion, String telefono) {
        this.nroSeguridadSocial = nroSeguridadSocial;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNroSeguridadSocial() { return nroSeguridadSocial; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
}