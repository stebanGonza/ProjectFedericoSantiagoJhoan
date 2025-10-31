package co.edu.uniquindio.projectfedericosantiagojhoan.model;

import java.util.List;

public class Equipo implements IAuditable  {
    private String nombre;
    private String codigo;
    private String estado;
    private double valorReposicion;

    public Equipo(String nombre, String codigo, String estado, double valorReposicion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.estado = estado;
        this.valorReposicion = valorReposicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValorReposicion() {
        return valorReposicion;
    }

    public void setValorReposicion(double valorReposicion) {
        this.valorReposicion = valorReposicion;
    }

    @Override
    public void registrarNovedad(RegistroNovedad novedad) {

    }

    @Override
    public List<RegistroNovedad> obtenerNovedad() {
        return List.of();
    }
}
