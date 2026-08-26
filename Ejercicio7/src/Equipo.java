import java.util.List;
import java.util.ArrayList;

public class Equipo extends Participante {
    private String codigo;
    private String entrenador;
    private List<Esquiador> esquiadores = new ArrayList<>();

    public int getCantidadEsquiadores() {
        return esquiadores.size();
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getEntrenador() { return entrenador; }
    public void setEntrenador(String entrenador) { this.entrenador = entrenador; }
    public List<Esquiador> getEsquiadores() { return esquiadores; }
    public void setEsquiadores(List<Esquiador> esquiadores) { this.esquiadores = esquiadores; }
}