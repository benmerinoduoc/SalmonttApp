package ui;

import data.GestorEntidades;
import model.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();
        List<Registrable> entidades = new ArrayList<>(gestor.cargarEntidades());

        while (true) {

            String menu = "1 - Agregar Empleado\n" +
                    "2 - Agregar Proveedor\n" +
                    "3 - Mostrar Resumen\n" +
                    "4 - Recorrer Y Clasificar (Consola)\n" +
                    "5 - Salir";

            String input = JOptionPane.showInputDialog(menu);

            if (input == null) break;

            switch (input) {

                case "1":
                    String nombreE = JOptionPane.showInputDialog("Ingrese nombre del empleado");
                    String cargo = JOptionPane.showInputDialog("Ingrese cargo del empleado");
                    if (nombreE != null && cargo != null) {
                        entidades.add(new Empleado(nombreE, cargo));
                        JOptionPane.showMessageDialog(null, "Empleado agregado");
                    }
                    break;

                case "2":
                    String nombreP = JOptionPane.showInputDialog("Ingrese nombre del proveedor");
                    String rubro = JOptionPane.showInputDialog("Ingrese rubro del proveedor");
                    if (nombreP != null && rubro != null) {
                        entidades.add(new Proveedor(nombreP, rubro));
                        JOptionPane.showMessageDialog(null, "Proveedor agregado");
                    }
                    break;

                case "3":
                    StringBuilder sb = new StringBuilder();
                    for (Registrable r : entidades) {
                        if (r instanceof CentroCultivo) {
                            CentroCultivo c = (CentroCultivo) r;
                            sb.append("Centro de Cultivo: ").append(c.getNombre())
                                    .append(" | Comuna: ").append(c.getComuna())
                                    .append(" | Produccion: ").append(c.getToneladasProduccion()).append(" toneladas\n");
                        } else if (r instanceof PlantaProceso) {
                            PlantaProceso p = (PlantaProceso) r;
                            sb.append("Planta de Proceso: ").append(p.getNombre())
                                    .append(" | Comuna: ").append(p.getComuna())
                                    .append(" | Capacidad diaria: ").append(p.getCapacidadDiaria()).append(" t/dia\n");
                        } else if (r instanceof Proveedor) {
                            Proveedor pr = (Proveedor) r;
                            sb.append("Proveedor: ").append(pr.getNombre())
                                    .append(" | Rubro: ").append(pr.getRubro()).append("\n");
                        } else if (r instanceof Empleado) {
                            Empleado e = (Empleado) r;
                            sb.append("Empleado: ").append(e.getNombre())
                                    .append(" | Cargo: ").append(e.getCargo()).append("\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                    break;

                case "4":
                    gestor.recorrerYClasificar(entidades);
                    JOptionPane.showMessageDialog(null, "Recorrido completado. Revisa la consola.");
                    break;

                case "5":
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
            }
        }
    }
}
