package co.edu.uniquindio.projectfedericosantiagojhoan.model;

import java.util.List;

public abstract class Vigilante extends Empleado{

    private int numPuesto;

    public Vigilante(String nombre, String id, String turno, double salario, int horasExtra, List<Equipo> listEquipo, int numPuesto) {
        super(nombre, id, turno, salario, horasExtra, listEquipo);
        this.numPuesto = numPuesto;
    }

    public int getNumPuesto() {
        return numPuesto;
    }

    public void setNumPuesto(int numPuesto) {
        this.numPuesto = numPuesto;
    }
}
