public class LoteComun extends Lote {
    public LoteComun(String id) {
        super(id);
    }

    @Override
    public boolean esEspecial() {
        return false;
    }
}