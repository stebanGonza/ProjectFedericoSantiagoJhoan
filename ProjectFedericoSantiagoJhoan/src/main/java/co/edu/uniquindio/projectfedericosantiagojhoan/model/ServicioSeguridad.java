package co.edu.uniquindio.projectfedericosantiagojhoan.model;

public  abstract class ServicioSeguridad  implements IAuditable {

    protected String codigocontrato;
    protected String cliente;
    protected double tarifaMensual;

    public ServicioSeguridad(String codigocontrato, String cliente, double tarifaMensual) {
        this.codigocontrato = codigocontrato;
        this.cliente = cliente;
        this.tarifaMensual = tarifaMensual;
    }

    public String getCodigocontrato() {
        return codigocontrato;
    }

    public void setCodigocontrato(String codigocontrato) {
        this.codigocontrato = codigocontrato;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTarifaMensual() {
        return tarifaMensual;
    }

    public void setTarifaMensual(double tarifaMensual) {
        this.tarifaMensual = tarifaMensual;
    }
}
