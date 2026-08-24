package Ejercicio6.src;

public class EspecieAnimal extends Especie {
    private String dieta;
    private boolean enPeligro;

    public EspecieAnimal(String nombreCientifico, String nombreComun, String dieta, boolean enPeligro) {
        super(nombreCientifico, nombreComun);
        this.dieta = dieta;
        this.enPeligro = enPeligro;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public boolean isEnPeligro() {
        return enPeligro;
    }

    public void setEnPeligro(boolean enPeligro) {
        this.enPeligro = enPeligro;
    }

    @Override
    public String getClasificacion() {
        return "Animal";
    }
}