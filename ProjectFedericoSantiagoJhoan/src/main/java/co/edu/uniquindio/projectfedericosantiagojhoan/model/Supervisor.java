package co.edu.uniquindio.projectfedericosantiagojhoan.model;

import java.util.List;

public abstract class Supervisor extends Empleado {

    private double bonoCoordinacion;

    public Supervisor(String nombre, String id, String turno, double salario, int horasExtra, List<Equipo> listEquipo, double bonoCoordinacion) {
        super(nombre, id, turno, salario, horasExtra, listEquipo);
        this.bonoCoordinacion = bonoCoordinacion;
    }

    public double getBonoCoordinacion() {
        return bonoCoordinacion;
    }

    public void setBonoCoordinacion(double bonoCoordinacion) {
        this.bonoCoordinacion = bonoCoordinacion;
    }
}
