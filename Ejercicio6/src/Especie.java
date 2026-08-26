package Ejercicio6.src;

public abstract class Especie {
    private String nombreCientifico;
    private String nombreComun;
    private Area areaHabitat;

    public Especie(String nombreCientifico, String nombreComun) {
        this.nombreCientifico = nombreCientifico;
        this.nombreComun = nombreComun;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public Area getAreaHabitat() {
        return areaHabitat;
    }

    public void setAreaHabitat(Area areaHabitat) {
        this.areaHabitat = areaHabitat;
        if (areaHabitat != null && !areaHabitat.getEspecies().contains(this)) {
            areaHabitat.getEspecies().add(this);
        }
    }

    public abstract String getClasificacion();

    @Override
    public String toString() {
        return nombreComun + " [" + nombreCientifico + "]";
    }
}