public class TipoAvion {
    private String nroModelo;
    private int capacidad;
    private double peso;

    public TipoAvion(String nroModelo, int capacidad, double peso) {
        this.nroModelo = nroModelo;
        this.capacidad = capacidad;
        this.peso = peso;
    }

    public String getNroModelo() { return nroModelo; }
    public int getCapacidad() { return capacidad; }
    public double getPeso() { return peso; }
}