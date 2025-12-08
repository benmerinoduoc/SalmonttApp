package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

    public List<UnidadOperativa> cargarUnidades() {

        List<UnidadOperativa> unidades = new ArrayList<>();

        unidades.add(new CentroCultivo("Centro A", "Puerto Montt", 1200));
        unidades.add(new CentroCultivo("Centro B", "Quellon", 900));
        unidades.add(new CentroCultivo("Centro C", "Chonchi", 1500));

        unidades.add(new PlantaProceso("Planta Sur", "Puerto Montt", 300));
        unidades.add(new PlantaProceso("Planta Norte", "Ancud", 450));

        return unidades;
    }
}
