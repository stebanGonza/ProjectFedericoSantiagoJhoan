package co.edu.uniquindio.projectfedericosantiagojhoan.model;

import java.util.List;

public abstract class OperadorMonitoreo extends Empleado{

    private int numZonas ;

    public OperadorMonitoreo(String nombre, String id, String turno, double salario, int horasExtra, List<Equipo> listEquipo, int numZonas) {
        super(nombre, id, turno, salario, horasExtra, listEquipo);
        this.numZonas = numZonas;
    }

    public int getNumZonas() {
        return numZonas;
    }

    public void setNumZonas(int numZonas) {
        this.numZonas = numZonas;
    }
}
