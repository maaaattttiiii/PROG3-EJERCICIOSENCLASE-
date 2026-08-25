public class Preferencia_plato {
    private Boolean gusta;
    private String observacion;
    private Persona persona;
    private Restaurante restaurante;
    private Plato plato;

    // ----- CONSTRUCTOR -----
    public Preferencia_plato(Persona persona, Restaurante restaurante, Plato plato, Boolean gusta, String observacion) {
        this.persona = persona;
        this.restaurante = restaurante;
        this.plato = plato;
        this.gusta = gusta;
        this.observacion = observacion;
    }

    // ----- GETTERS Y SETTERS -----
    public Boolean getGusta() { return gusta; }
    public void setGusta(Boolean gusta) { this.gusta = gusta; }

    public String getObservacion() { return observacion; }
    public void setObservacion(String observacion) { this.observacion = observacion; }

    public Persona getPersona() { return persona; }
    public Restaurante getRestaurante() { return restaurante; }
    public Plato getPlato() { return plato; }
}
