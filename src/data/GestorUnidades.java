package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

public class GestorUnidades {

    public UnidadOperativa[] crearUnidades() {

        CentroCultivo c1 = new CentroCultivo("IslaHuar", "Calbuco", 1200);
        CentroCultivo c2 = new CentroCultivo("ChaitenSur", "Chaitén", 800);

        PlantaProceso p1 = new PlantaProceso("Planta A", "Puerto Montt", 5000);
        PlantaProceso p2 = new PlantaProceso("Planta B", "Castro", 3500);

        return new UnidadOperativa[]{c1, c2, p1, p2};
    }
}
