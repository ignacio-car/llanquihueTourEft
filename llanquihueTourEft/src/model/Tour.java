package model;

public class Tour {

    private String codigo;
    private String destino;
    private double precio;
    private GuiaTuristico guia;
    private Vehiculo vehiculo;

    public Tour(String codigo, String destino, double precio,
                GuiaTuristico guia, Vehiculo vehiculo) {

        this.codigo = codigo;
        this.destino = destino;
        this.precio = precio;
        this.guia = guia;
        this.vehiculo = vehiculo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public GuiaTuristico getGuia() {
        return guia;
    }

    public void setGuia(GuiaTuristico guia) {
        this.guia = guia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\nDestino: " + destino +
                "\nPrecio: $" + precio +
                "\nGuía: " + guia.getNombre() +
                "\nVehículo: " + vehiculo.getPatente();
    }
}