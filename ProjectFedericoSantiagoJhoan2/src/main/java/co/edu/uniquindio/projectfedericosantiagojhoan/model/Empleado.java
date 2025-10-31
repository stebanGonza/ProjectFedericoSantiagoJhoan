package co.edu.uniquindio.projectfedericosantiagojhoan.model;

import java.util.ArrayList;
import java.util.List;


public abstract class Empleado  implements IAuditable {

    protected String nombre ;
    protected String id ;
    protected String turno ;
    protected double salario ;
    protected int horasExtra;
    protected List<Equipo> listEquipo = new ArrayList<>();

    public Empleado(String nombre, String id, String turno, double salario, int horasExtra, List<Equipo> listEquipo) {
        this.nombre = nombre;
        this.id = id;
        this.turno = turno;
        this.salario = salario;
        this.horasExtra = horasExtra;
        this.listEquipo = listEquipo;
    }

    public Empleado(int id, String nombre, String cargo, double salario) {
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getTurno() {
        return turno;
    }

    public double getSalario() {
        return salario;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public List<Equipo> getListEquipo() {
        return listEquipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public void setListEquipo(List<Equipo> listEquipo) {
        this.listEquipo = listEquipo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", turno='" + turno + '\'' +
                ", salario=" + salario +
                ", horasExtra=" + horasExtra +
                ", listEquipo=" + listEquipo +
                '}';
    }

    public abstract void setCargo(String cargo);
}
