package co.edu.uniquindio.projectfedericosantiagojhoan.model;

public abstract class PatrullajeMovil extends ServicioSeguridad {

    private int cantidadAutos ;
    private double kilometrosRecorridos;

    public PatrullajeMovil(String codigocontrato, String cliente, double tarifaMensual, int cantidadAutos, double kilometrosRecorridos) {
        super(codigocontrato, cliente, tarifaMensual);
        this.cantidadAutos = cantidadAutos;
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public int getCantidadAutos() {
        return cantidadAutos;
    }

    public void setCantidadAutos(int cantidadAutos) {
        this.cantidadAutos = cantidadAutos;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }
}
