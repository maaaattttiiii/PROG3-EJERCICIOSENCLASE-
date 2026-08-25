import java.util.ArrayList;
import java.util.List;

public class Persona {
    private Long id;
    private String nombre;
    private String telefono;
    private static Long nroId = 0L;
    private List<Restaurante> restaurantesFrecuentados;
    private List<Preferencia_plato> preferencias;

    // ----- CONSTRUCTOR -----
    public Persona(String nombre, String telefono) {
        this.id = generarId();
        this.nombre = nombre;
        this.telefono = telefono;
        this.restaurantesFrecuentados = new ArrayList<>();
        this.preferencias = new ArrayList<>();
    }


    // ----- MÉTODOS -----
    private synchronized Long generarId() {
        return ++nroId;
    }

    public void frecuentarRestaurante(Restaurante restaurante) {
        if (!restaurantesFrecuentados.contains(restaurante)) {
            restaurantesFrecuentados.add(restaurante);
        }
    }

    public void agregarPreferencia(Restaurante restaurante, Plato plato, Boolean gusta, String observacion) {
        Preferencia_plato pref = new Preferencia_plato(this, restaurante, plato, gusta, observacion);
        this.preferencias.add(pref);
    }

    // ----- SETTERS Y GETTERS -----
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public List<Restaurante> getRestaurantesFrecuentados() { return restaurantesFrecuentados; }
    public List<Preferencia_plato> getPreferencias() { return preferencias; }
}
