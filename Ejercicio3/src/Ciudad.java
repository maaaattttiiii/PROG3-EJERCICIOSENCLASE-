public class Ciudad {
    private String nombre;
    private int cantidadHabitantes;
    private float imp1;
    private float imp2;
    private float imp3;
    private float imp4;
    private float imp5;
    private float gastoMantenimiento;

    public float calcularRecaudacionTotal() {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public boolean estaEnDeficit() {
        return gastoMantenimiento > calcularRecaudacionTotal();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCantidadHabitantes() { return cantidadHabitantes; }
    public void setCantidadHabitantes(int cantidadHabitantes) { this.cantidadHabitantes = cantidadHabitantes; }
    public float getImp1() { return imp1; }
    public void setImp1(float imp1) { this.imp1 = imp1; }
    public float getImp2() { return imp2; }
    public void setImp2(float imp2) { this.imp2 = imp2; }
    public float getImp3() { return imp3; }
    public void setImp3(float imp3) { this.imp3 = imp3; }
    public float getImp4() { return imp4; }
    public void setImp4(float imp4) { this.imp4 = imp4; }
    public float getImp5() { return imp5; }
    public void setImp5(float imp5) { this.imp5 = imp5; }
    public float getGastoMantenimiento() { return gastoMantenimiento; }
    public void setGastoMantenimiento(float gastoMantenimiento) { this.gastoMantenimiento = gastoMantenimiento; }
}
