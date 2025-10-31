package co.edu.uniquindio.projectfedericosantiagojhoan.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaSeguridad {
    private String nombre;
    private String ubicacion;
    private ArrayList<Empleado> listaEmpleados;

    public EmpresaSeguridad(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "EmpresaSeguridad{" +
                "nombre='" + nombre + '\'' +
                ", ubicación='" + ubicacion + '\'' +
                '}';
    }

}