import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Lider extends RepresentanteVentas {
    private Date fechaPromocion;

    private List<Vendedor> equipo = new ArrayList<>();

    @Override
    public float calcularComision(Date desde) {
        float totalComision = 0;

        float ventasPropias = 0;
        for (TicketVenta ticket : ticketsComprados) {
            if (ticket.getFechaEmision().after(desde)) {
                ventasPropias += ticket.getPrecioAbonado();
            }
        }
        totalComision += ventasPropias * ReunionGeneral.getPorcentajeComision();

        float ventasEquipo = 0;
        for (Vendedor v : equipo) {
            for (TicketVenta ticketVendedor : v.getTicketsComprados()) {
                if (ticketVendedor.getFechaEmision().after(desde)) {
                    ventasEquipo += ticketVendedor.getPrecioAbonado();
                }
            }
        }
        totalComision += ventasEquipo * ReunionGeneral.getPorcentajeComision();

        return totalComision;
    }

    public Date getFechaPromocion() { return fechaPromocion; }
    public void setFechaPromocion(Date fechaPromocion) { this.fechaPromocion = fechaPromocion; }
    public List<Vendedor> getEquipo() { return equipo; }
    public void setEquipo(List<Vendedor> equipo) { this.equipo = equipo; }
}