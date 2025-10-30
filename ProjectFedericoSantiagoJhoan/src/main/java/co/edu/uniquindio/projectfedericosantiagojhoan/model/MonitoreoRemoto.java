package co.edu.uniquindio.projectfedericosantiagojhoan.model;

public class MonitoreoRemoto  extends ServicioSeguridad{

    private int cantidadDips;

    public MonitoreoRemoto(String codigocontrato, String cliente, double tarifaMensual, int cantidadDips) {
        super(codigocontrato, cliente, tarifaMensual);
        this.cantidadDips = cantidadDips;
    }

    public int getCantidadDips() {
        return cantidadDips;
    }

    public void setCantidadDips(int cantidadDips) {
        this.cantidadDips = cantidadDips;
    }
}
