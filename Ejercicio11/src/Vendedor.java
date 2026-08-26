import java.util.Date;

public class Vendedor extends RepresentanteVentas {

    @Override
    public float calcularComision(Date desde) {
        float totalVentas = 0;
        for (TicketVenta ticket : ticketsComprados) {
            if (ticket.getFechaEmision().after(desde)) {
                totalVentas += ticket.getPrecioAbonado();
            }
        }
        return totalVentas * ReunionGeneral.getPorcentajeComision();
    }
}