package co.edu.uniquindio.projectfedericosantiagojhoan.model;

public class EmpresaSeguridad {
    private String nombre ;
    private String ubicación ;

    public EmpresaSeguridad(String nombre, String ubicación) {
        this.nombre = nombre;
        this.ubicación = ubicación;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicación() {
        return ubicación;
    }

    public void setUbicación(String ubicación) {
        this.ubicación = ubicación;
    }

    @Override
    public String toString() {
        return "EmpresaSeguridad{" +
                "nombre='" + nombre + '\'' +
                ", ubicación='" + ubicación + '\'' +
                '}';
    }

}
