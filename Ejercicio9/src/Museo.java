import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Museo {
    private Long id;
    private String nombre;
    private static Long nroId = 0L;

    // Composición
    private List<Exposicion> exposiciones;

    // Agregación
    private List<ObjetoDeArte> coleccionObjetos;

    // Asociación
    private List<ColeccionDeObras> coleccionesIntercambio;

    // ----- CONSTRUCTOR -----
    public Museo(String nombre) {
        this.id = generarId();
        this.nombre = nombre;
        this.exposiciones = new ArrayList<>();
        this.coleccionObjetos = new ArrayList<>();
        this.coleccionesIntercambio = new ArrayList<>();
    }

    // ----- MÉTODOS -----
    private synchronized Long generarId() {
        return ++nroId;
    }

    // Composición con Exposicion
    public void crearExposicion(String nombre, Date fechaInicio, Date fechaFin) {
        Exposicion expo = new Exposicion(nombre, fechaInicio, fechaFin);
        this.exposiciones.add(expo);
    }

    // Agregación con ObjetoDeArte
    public void agregarObjetoDeArte(ObjetoDeArte objeto) {
        if (!coleccionObjetos.contains(objeto)) {
            coleccionObjetos.add(objeto);
        }
    }

    // Asociación con ColeccionDeObras
    public void agregarColeccionIntercambio(ColeccionDeObras coleccion) {
        if (!coleccionesIntercambio.contains(coleccion)) {
            coleccionesIntercambio.add(coleccion);
        }
    }


    // ----- GETTERS Y SETTERS -----
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Exposicion> getExposiciones() { return exposiciones; }
    public List<ObjetoDeArte> getColeccionObjetos() { return coleccionObjetos; }
    public List<ColeccionDeObras> getColeccionesIntercambio() { return coleccionesIntercambio; }
}