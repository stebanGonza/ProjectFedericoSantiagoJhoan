package co.edu.uniquindio.projectfedericosantiagojhoan.model;

public class CusrtodiaFija extends ServicioSeguridad{

    private double calcularCostoMensual;

    public CusrtodiaFija(String codigocontrato, String cliente, double tarifaMensual, double calcularCostoMensual) {
        super(codigocontrato, cliente, tarifaMensual);
        this.calcularCostoMensual = calcularCostoMensual;
    }

    public double getCalcularCostoMensual() {
        return calcularCostoMensual;
    }

    public void setCalcularCostoMensual(double calcularCostoMensual) {
        this.calcularCostoMensual = calcularCostoMensual;
    }
}
