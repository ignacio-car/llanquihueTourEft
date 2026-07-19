package model;

import interfaces.Registrable;

public class Persona implements Registrable {

    private String rut;
    private String nombre;
    private String telefono;
    private String correo;
    private Direccion direccion;

    public Persona(String rut, String nombre, String telefono, String correo, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public void registrar() {
        System.out.println(nombre + " registrado correctamente.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Rut: " + rut +
                "\nNombre: " + nombre +
                "\nTeléfono: " + telefono +
                "\nCorreo: " + correo +
                "\nDirección: " + direccion;
    }
}