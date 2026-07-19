package model;

public class Reserva {

    private String codigoReserva;
    private Cliente cliente;
    private Tour tour;
    private int cantidadPersonas;

    public Reserva(String codigoReserva, Cliente cliente,
                   Tour tour, int cantidadPersonas) {

        this.codigoReserva = codigoReserva;
        this.cliente = cliente;
        this.tour = tour;
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tour getTour() {
        return tour;
    }

    public void setTour(Tour tour) {
        this.tour = tour;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        return "Reserva: " + codigoReserva +
                "\nCliente: " + cliente.getNombre() +
                "\nDestino: " + tour.getDestino() +
                "\nCantidad de personas: " + cantidadPersonas;
    }
}