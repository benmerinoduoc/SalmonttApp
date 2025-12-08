package model;

public class PlantaProceso extends UnidadOperativa {

    private int capacidadDiaria;

    public PlantaProceso(String nombre, String comuna, int capacidadDiaria) {
        super(nombre, comuna);
        this.capacidadDiaria = capacidadDiaria;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Planta de Proceso: " + getNombre()
                + " | Comuna: " + getComuna()
                + " | Capacidad diaria: " + capacidadDiaria + " t/dia");
    }
}
