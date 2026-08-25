import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private Long id;
    private String nombre;
    private static Long nroId = 0L;
    private Ciudad ciudad;
    private List<Sucursal> sucursales;
    private List<Plato> platos;
    private List<Persona> personasQueFrecuentan;

    // ----- CONSTRUCTOR -----
    public Restaurante(String nombre, Ciudad ciudad, String direccionSucursalInicial) {
        this.id = generarId();
        this.nombre = nombre;
        this.ciudad = ciudad;

        // Composición
        this.sucursales = new ArrayList<>();
        this.sucursales.add(new Sucursal(direccionSucursalInicial));

        this.platos = new ArrayList<>();
        this.personasQueFrecuentan = new ArrayList<>();
    }

    // ----- MÉTODOS -----
    private synchronized Long generarId() {
        return ++nroId;
    }

    public void agregarPlato(Plato plato) {
        if (this.platos.size() < 20) {
            this.platos.add(plato);
        } else {
            throw new IllegalStateException("El restaurante no puede ofrecer más de 20 platos.");
        }
    }

    public void agregarSucursal(String direccion) {
        this.sucursales.add(new Sucursal(direccion));
    }

    // ----- GETTERS Y SETTERS -----
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Ciudad getCiudad() { return ciudad; }
    public void setCiudad(Ciudad ciudad) { this.ciudad = ciudad; }

    public List<Sucursal> getSucursales() { return sucursales; }
    public List<Plato> getPlatos() { return platos; }
    public List<Persona> getPersonasQueFrecuentan() { return personasQueFrecuentan; }
}
