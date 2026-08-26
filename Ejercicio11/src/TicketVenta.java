import java.util.Date;

public class TicketVenta {
    private Date fechaEmision;
    private float precioAbonado;

    private RepresentanteVentas representante; // Quién lo compró a la empresa
    private Producto producto;                 // Qué producto es (1 por ticket)
    private Cliente clienteFinal;              // A quién se lo vendió (se completa después)

    public Date getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(Date fechaEmision) { this.fechaEmision = fechaEmision; }
    public float getPrecioAbonado() { return precioAbonado; }
    public void setPrecioAbonado(float precioAbonado) { this.precioAbonado = precioAbonado; }
    public RepresentanteVentas getRepresentante() { return representante; }
    public void setRepresentante(RepresentanteVentas representante) { this.representante = representante; }
    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
    public Cliente getClienteFinal() { return clienteFinal; }
    public void setClienteFinal(Cliente clienteFinal) { this.clienteFinal = clienteFinal; }
}