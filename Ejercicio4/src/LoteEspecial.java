public class LoteEspecial extends Lote {
    public LoteEspecial(String id) {
        super(id);
    }

    @Override
    public boolean esEspecial() {
        return true;
    }
}