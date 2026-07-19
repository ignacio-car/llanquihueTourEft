package model;

public class Cliente extends Persona {

    private int cantidadReservas;

    public Cliente(String rut, String nombre, String telefono,
                   String correo, Direccion direccion,
                   int cantidadReservas) {

        super(rut, nombre, telefono, correo, direccion);
        this.cantidadReservas = cantidadReservas;
    }

    public int getCantidadReservas() {
        return cantidadReservas;
    }

    public void setCantidadReservas(int cantidadReservas) {
        this.cantidadReservas = cantidadReservas;
    }

    @Override
    public void registrar() {
        System.out.println("Cliente registrado correctamente.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCantidad de reservas: " + cantidadReservas;
    }
}