package data;

import model.*;
import utils.LeerArchivos;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorEntidades {



    private ArrayList<Cliente> clientes;
    private ArrayList<GuiaTuristico> guias;
    private ArrayList<ColaboradorExterno> colaboradores;
    private ArrayList<Vehiculo> vehiculos;
    private ArrayList<Tour> tours;
    private ArrayList<Reserva> reservas;

    public GestorEntidades() {

        clientes = new ArrayList<>();
        guias = new ArrayList<>();
        colaboradores = new ArrayList<>();
        vehiculos = new ArrayList<>();
        tours = new ArrayList<>();
        reservas = new ArrayList<>();

        cargarClientes();
        cargarGuias();
        cargarColaboradores();
        cargarVehiculos();
        cargarTours();
        cargarReservas();
    }

    //==========================
    // CLIENTES
    //==========================

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String rut) {

        for (Cliente cliente : clientes) {

            if (cliente.getRut().equalsIgnoreCase(rut)) {
                return cliente;
            }

        }

        return null;
    }


    // GUIAS


    public void agregarGuia(GuiaTuristico guia) {
        guias.add(guia);
    }

    public ArrayList<GuiaTuristico> getGuias() {
        return guias;
    }

    public GuiaTuristico buscarGuia(String rut) {

        for (GuiaTuristico guia : guias) {

            if (guia.getRut().equalsIgnoreCase(rut)) {
                return guia;
            }

        }

        return null;
    }


    // COLABORADORES


    public void agregarColaborador(ColaboradorExterno colaborador) {
        colaboradores.add(colaborador);
    }

    public ArrayList<ColaboradorExterno> getColaboradores() {
        return colaboradores;
    }

    public ColaboradorExterno buscarColaborador(String rut) {

        for (ColaboradorExterno colaborador : colaboradores) {

            if (colaborador.getRut().equalsIgnoreCase(rut)) {
                return colaborador;
            }

        }

        return null;
    }


    // VEHICULOS


    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Vehiculo buscarVehiculo(String patente) {

        for (Vehiculo vehiculo : vehiculos) {

            if (vehiculo.getPatente().equalsIgnoreCase(patente)) {
                return vehiculo;
            }

        }

        return null;
    }


    // TOURS


    public void agregarTour(Tour tour) {
        tours.add(tour);
    }

    public ArrayList<Tour> getTours() {
        return tours;
    }

    public Tour buscarTour(String codigo) {

        for (Tour tour : tours) {

            if (tour.getCodigo().equalsIgnoreCase(codigo)) {
                return tour;
            }

        }

        return null;
    }


    // RESERVAS


    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }


    // CARGA DE ARCHIVOS


    private void cargarClientes() {

        try {

            BufferedReader br = LeerArchivos.leerArchivo("clientes.txt");

            if (br == null) return;

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                Direccion direccion = new Direccion(
                        datos[4].trim(),
                        Integer.parseInt(datos[5].trim()),
                        datos[6].trim(),
                        datos[7].trim()
                );

                Cliente cliente = new Cliente(
                        datos[0].trim(),
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        direccion,
                        Integer.parseInt(datos[8].trim())
                );

                clientes.add(cliente);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al cargar clientes.");

        }

    }

    private void cargarGuias() {

        try {

            BufferedReader br = LeerArchivos.leerArchivo("guias.txt");

            if (br == null) return;

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                Direccion direccion = new Direccion(
                        datos[4].trim(),
                        Integer.parseInt(datos[5].trim()),
                        datos[6].trim(),
                        datos[7].trim()
                );

                GuiaTuristico guia = new GuiaTuristico(
                        datos[0].trim(),
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        direccion,
                        datos[8].trim()
                );

                guias.add(guia);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al cargar guías.");

        }

    }

    private void cargarColaboradores() {

        try {

            BufferedReader br = LeerArchivos.leerArchivo("colaboradores.txt");

            if (br == null) return;

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                Direccion direccion = new Direccion(
                        datos[4].trim(),
                        Integer.parseInt(datos[5].trim()),
                        datos[6].trim(),
                        datos[7].trim()
                );

                ColaboradorExterno colaborador = new ColaboradorExterno(
                        datos[0].trim(),
                        datos[1].trim(),
                        datos[2].trim(),
                        datos[3].trim(),
                        direccion,
                        datos[8].trim()
                );

                colaboradores.add(colaborador);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al cargar colaboradores.");

        }

    }

    private void cargarVehiculos() {

        try {

            BufferedReader br = LeerArchivos.leerArchivo("vehiculos.txt");

            if (br == null) return;

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                Vehiculo vehiculo = new Vehiculo(
                        datos[0].trim(),
                        datos[1].trim(),
                        datos[2].trim(),
                        Integer.parseInt(datos[3].trim())
                );

                vehiculos.add(vehiculo);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al cargar vehículos.");

        }

    }

    private void cargarTours() {

        try {

            BufferedReader br = LeerArchivos.leerArchivo("tours.txt");

            if (br == null) return;

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                GuiaTuristico guia = buscarGuia(datos[3].trim());
                Vehiculo vehiculo = buscarVehiculo(datos[4].trim());

                if (guia == null) {
                    System.out.println("No existe el guía con RUT: " + datos[3].isEmpty());
                    continue;
                }

                if (vehiculo == null) {
                    System.out.println("No existe el vehículo con patente: " + datos[4].isEmpty());
                    continue;
                }

                Tour tour = new Tour(
                        datos[0].trim(),
                        datos[1].trim(),
                        Double.parseDouble(datos[2].trim()),
                        guia,
                        vehiculo
                );

                tours.add(tour);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al cargar tours.");

        }

    }

    private void cargarReservas() {

        try {

            BufferedReader br = LeerArchivos.leerArchivo("reservas.txt");

            if (br == null) return;

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                Cliente cliente = buscarCliente(datos[1].trim());
                Tour tour = buscarTour(datos[2].trim());

                Reserva reserva = new Reserva(
                        datos[0].trim(),
                        cliente,
                        tour,
                        Integer.parseInt(datos[3].trim())
                );

                reservas.add(reserva);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al cargar reservas.");

        }

    }

    public String mostrarTipoPersona(Persona persona) {

        if (persona instanceof Cliente) {
            return persona.getNombre() + " es un Cliente.";
        }

        if (persona instanceof GuiaTuristico) {
            return persona.getNombre() + " es un Guía Turístico.";
        }

        if (persona instanceof ColaboradorExterno) {
            return persona.getNombre() + " es un Colaborador Externo.";
        }

        return "Tipo de persona desconocido.";
    }

}