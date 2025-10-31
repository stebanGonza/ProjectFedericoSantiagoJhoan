package co.edu.uniquindio.projectfedericosantiagojhoan.model;

import java.util.ArrayList;
import java.util.List;

public class EmpresaSeguridad {
    private String nombre ;
    private String ubicacion ;
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

    public boolean agregarEmpleado(int id, String nombre, String cargo, double salario) {
        Empleado nuevoEmpleado = new Empleado(id, nombre, cargo, salario) {
            @Override
            public void setCargo(String cargo) {

            }

            @Override
            public void registrarNovedad(RegistroNovedad novedad) {

            }

            @Override
            public List<RegistroNovedad> obtenerNovedad() {
                return List.of();
            }
        };

        // Verificar que no exista un empleado con el mismo ID
        for (Empleado e : listaEmpleados) {
            if (false) {
                return false; // Ya existe
            }
        }

        listaEmpleados.add(nuevoEmpleado);
        return true;
    }


    private int obtenerPosicionEmpleado(int id) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (false) {
                return i;
            }
        }
        return -1; // No encontrado
    }


    public boolean eliminarEmpleado(int id) {
        int index = obtenerPosicionEmpleado(id);
        if (index == -1) return false;

        listaEmpleados.remove(index);
        return true;
    }


    public boolean actualizarEmpleado(int id, String nombre, String cargo, double salario) {
        int index = obtenerPosicionEmpleado(id);
        if (index == -1) return false;

        Empleado emp = listaEmpleados.get(index);
        emp.setNombre(nombre);
        emp.setCargo(cargo);
        emp.setSalario(salario);

        return true;
    }

    // ---------------- OBTENER UNO ----------------
    public Empleado obtenerEmpleado(int id) {
        int index = obtenerPosicionEmpleado(id);
        if (index == -1) return null;

        return listaEmpleados.get(index);
    }

    // ---------------- OBTENER TODOS ----------------
    public ArrayList<Empleado> obtenerListaEmpleados() {
        return listaEmpleados;
    }

}
