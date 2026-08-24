package Ejercicio10.src;

public class ComplejoUnicoDeporte extends ComplejoDeportivo {
    private Deporte deportePrincipal;

    public ComplejoUnicoDeporte(String nombre, String localizacion, String jefe, double areaOcupadaM2, Deporte deportePrincipal) {
        super(nombre, localizacion, jefe, areaOcupadaM2);
        this.deportePrincipal = deportePrincipal;
    }

    public Deporte getDeportePrincipal() {
        return deportePrincipal;
    }

    public void setDeportePrincipal(Deporte deportePrincipal) {
        this.deportePrincipal = deportePrincipal;
    }

    @Override
    public String getTipoComplejo() {
        return "Unico deporte";
    }
}
