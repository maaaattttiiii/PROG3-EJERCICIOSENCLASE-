package Ejercicio6.src;

public class EspecieVegetal extends Especie {
    private String tipoVegetacion;
    private boolean endemica;

    public EspecieVegetal(String nombreCientifico, String nombreComun, String tipoVegetacion, boolean endemica) {
        super(nombreCientifico, nombreComun);
        this.tipoVegetacion = tipoVegetacion;
        this.endemica = endemica;
    }

    public String getTipoVegetacion() {
        return tipoVegetacion;
    }

    public void setTipoVegetacion(String tipoVegetacion) {
        this.tipoVegetacion = tipoVegetacion;
    }

    public boolean isEndemica() {
        return endemica;
    }

    public void setEndemica(boolean endemica) {
        this.endemica = endemica;
    }

    @Override
    public String getClasificacion() {
        return "Vegetal";
    }
}