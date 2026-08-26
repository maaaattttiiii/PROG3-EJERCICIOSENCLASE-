import java.util.List;
import java.util.ArrayList;

public class Estacion {
    private String codigoIdentificativo;
    private String nombre;
    private List<String> contactos;
    private String direccion;
    private String telefono;
    private List<Pista> pistas = new ArrayList<>();

    public float getKmEsquiables() {
        float total = 0;
        for(Pista p : pistas) {
            total += p.getLongitudKm();
        }
        return total;
    }

    public int getNumPistas() {
        return pistas.size();
    }


    public String getCodigoIdentificativo() { return codigoIdentificativo; }
    public void setCodigoIdentificativo(String codigoIdentificativo) { this.codigoIdentificativo = codigoIdentificativo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public List<String> getContactos() { return contactos; }
    public void setContactos(List<String> contactos) { this.contactos = contactos; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public List<Pista> getPistas() { return pistas; }
    public void setPistas(List<Pista> pistas) { this.pistas = pistas; }
}