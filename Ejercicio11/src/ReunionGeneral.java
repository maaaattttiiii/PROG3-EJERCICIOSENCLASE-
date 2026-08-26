import java.util.Date;

public class ReunionGeneral {
    private static Date fechaUltima;
    private static Date fechaProxima;
    private static float porcentajeComision = 0.15f;

    public static Date getFechaUltima() { return fechaUltima; }
    public static void setFechaUltima(Date fecha) { fechaUltima = fecha; }
    public static Date getFechaProxima() { return fechaProxima; }
    public static void setFechaProxima(Date fecha) { fechaProxima = fecha; }
    public static float getPorcentajeComision() { return porcentajeComision; }
    public static void setPorcentajeComision(float porcentaje) { porcentajeComision = porcentaje; }
}