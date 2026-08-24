public class Lado {
    private int idLado;
    private double longitud;
    private Punto punto1;
    private Punto punto2;

    public Lado(int idLado, double longitud, Punto punto1, Punto punto2) {
        if (punto1 == null || punto2 == null) {
            throw new IllegalArgumentException("Un lado debe estar definido por exactamente 2 puntos.");
        }
        this.idLado = idLado;
        this.longitud = longitud;
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public int getIdLado() {
        return idLado;
    }

    public void setIdLado(int idLado) {
        this.idLado = idLado;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }
}
