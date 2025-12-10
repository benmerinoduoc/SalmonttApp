package data;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GestorEntidades {

    public List<Registrable> cargarEntidades() {

        List<Registrable> entidades = new ArrayList<>();

        entidades.add(new CentroCultivo("Centro A", "Puerto Montt", 1200));
        entidades.add(new CentroCultivo("Centro B", "Quellon", 900));
        entidades.add(new PlantaProceso("Planta Sur", "Puerto Montt", 300));
        entidades.add(new PlantaProceso("Planta Norte", "Ancud", 450));
        entidades.add(new Proveedor("Juan Perez", "Alimentos"));
        entidades.add(new Empleado("Ana Perez", "Administrador"));

        return entidades;
    }

    public void recorrerYClasificar(List<Registrable> lista) {
        for (Registrable r : lista) {
            r.mostrarResumen();
            System.out.println();
        }
    }
}
