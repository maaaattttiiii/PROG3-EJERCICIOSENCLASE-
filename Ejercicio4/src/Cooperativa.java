import java.util.List;

public class Cooperativa {

    public boolean aconsejarCereal(Lote lote, Cereal cereal) {
        if (!lote.satisfaceRequerimientos(cereal)) {
            return false;
        }

        if (cereal instanceof Pastura) {
            List<Cereal> historial = lote.getHistorialSiembras();
            if (!historial.isEmpty()) {
                Cereal ultimaSiembra = historial.get(historial.size() - 1);
                if (ultimaSiembra instanceof Pastura) {
                    return false;
                }
            }
        }

        return true;
    }
}