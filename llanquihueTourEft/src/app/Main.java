package app;

import data.GestorEntidades;
import model.Cliente;
import model.GuiaTuristico;
import model.ColaboradorExterno;
import model.Vehiculo;
import model.Tour;
import model.Reserva;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();

        int opcion;

        do {

            try {

                String input = JOptionPane.showInputDialog(
                        """
                        ========= LLANQUIHUE TOUR =========
                        
                        1. Ver Clientes
                        2. Ver Guías Turísticos
                        3. Ver Colaboradores Externos
                        4. Ver Vehículos
                        5. Ver Tours
                        6. Ver Reservas
                        7. Mostrar tipo de personas (instanceof)
                        0. Salir
                        
                        Seleccione una opción:
                        """
                );

                // Si el usuario cierra con la X o presiona Cancelar, input es null
                if (input == null) {
                    opcion = 0;
                    continue;
                }

                opcion = Integer.parseInt(input);

                switch (opcion) {

                    case 1 -> {

                        StringBuilder sb = new StringBuilder();

                        for (Cliente cliente : gestor.getClientes()) {

                            sb.append(cliente)
                                    .append("\n---------------------------------------\n");

                        }

                        JOptionPane.showMessageDialog(null, sb.toString(),
                                "CLIENTES", JOptionPane.INFORMATION_MESSAGE);

                    }

                    case 2 -> {

                        StringBuilder sb = new StringBuilder();

                        for (GuiaTuristico guia : gestor.getGuias()) {

                            sb.append(guia)
                                    .append("\n---------------------------------------\n");

                        }

                        JOptionPane.showMessageDialog(null, sb.toString(),
                                "GUÍAS", JOptionPane.INFORMATION_MESSAGE);

                    }

                    case 3 -> {

                        StringBuilder sb = new StringBuilder();

                        for (ColaboradorExterno colaborador : gestor.getColaboradores()) {

                            sb.append(colaborador)
                                    .append("\n---------------------------------------\n");

                        }

                        JOptionPane.showMessageDialog(null, sb.toString(),
                                "COLABORADORES", JOptionPane.INFORMATION_MESSAGE);

                    }

                    case 4 -> {

                        StringBuilder sb = new StringBuilder();

                        for (Vehiculo vehiculo : gestor.getVehiculos()) {

                            sb.append(vehiculo)
                                    .append("\n---------------------------------------\n");

                        }

                        JOptionPane.showMessageDialog(null, sb.toString(),
                                "VEHÍCULOS", JOptionPane.INFORMATION_MESSAGE);

                    }

                    case 5 -> {

                        StringBuilder sb = new StringBuilder();

                        for (Tour tour : gestor.getTours()) {

                            sb.append(tour)
                                    .append("\n---------------------------------------\n");

                        }

                        JOptionPane.showMessageDialog(null, sb.toString(),
                                "TOURS", JOptionPane.INFORMATION_MESSAGE);

                    }

                    case 6 -> {

                        StringBuilder sb = new StringBuilder();

                        for (Reserva reserva : gestor.getReservas()) {

                            sb.append(reserva)
                                    .append("\n---------------------------------------\n");

                        }

                        JOptionPane.showMessageDialog(null, sb.toString(),
                                "RESERVAS", JOptionPane.INFORMATION_MESSAGE);

                    }

                    case 7 -> {

                        StringBuilder sb = new StringBuilder();

                        for (Cliente cliente : gestor.getClientes()) {
                            sb.append(gestor.mostrarTipoPersona(cliente))
                                    .append("\n");
                        }

                        for (GuiaTuristico guia : gestor.getGuias()) {
                            sb.append(gestor.mostrarTipoPersona(guia))
                                    .append("\n");
                        }

                        for (ColaboradorExterno colaborador : gestor.getColaboradores()) {
                            sb.append(gestor.mostrarTipoPersona(colaborador))
                                    .append("\n");
                        }

                        JOptionPane.showMessageDialog(null,
                                sb.toString(),
                                "USO DE INSTANCEOF",
                                JOptionPane.INFORMATION_MESSAGE);

                    }

                    case 0 -> JOptionPane.showMessageDialog(null,
                            "Gracias por utilizar Llanquihue Tour.");

                    default -> JOptionPane.showMessageDialog(null,
                            "Opción inválida.");

                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null,
                        "Debe ingresar un número.");

                opcion = -1;

            }

        } while (opcion != 0);



        System.out.println("========================================");
        System.out.println("       CLIENTES REGISTRADOS");
        System.out.println("========================================");



        for (Cliente cliente : gestor.getClientes()) {
            System.out.println(cliente);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n========================================");
        System.out.println("      GUÍAS TURÍSTICOS");
        System.out.println("========================================");

        for (GuiaTuristico guia : gestor.getGuias()) {
            System.out.println(guia);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n========================================");
        System.out.println("   COLABORADORES EXTERNOS");
        System.out.println("========================================");

        for (ColaboradorExterno colaborador : gestor.getColaboradores()) {
            System.out.println(colaborador);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n========================================");
        System.out.println("        VEHÍCULOS");
        System.out.println("========================================");

        for (Vehiculo vehiculo : gestor.getVehiculos()) {
            System.out.println(vehiculo);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n========================================");
        System.out.println("           TOURS");
        System.out.println("========================================");

        for (Tour tour : gestor.getTours()) {
            System.out.println(tour);
            System.out.println("----------------------------------------");
        }

        System.out.println("\n========================================");
        System.out.println("         RESERVAS");
        System.out.println("========================================");

        for (Reserva reserva : gestor.getReservas()) {
            System.out.println(reserva);
            System.out.println("----------------------------------------");
        }

        for (Cliente cliente : gestor.getClientes()) {
            gestor.mostrarTipoPersona(cliente);
        }

        for (GuiaTuristico guia : gestor.getGuias()) {
            gestor.mostrarTipoPersona(guia);
        }

        for (ColaboradorExterno colaborador : gestor.getColaboradores()) {
            gestor.mostrarTipoPersona(colaborador);
        }

    }

}