package model;

public class PlantaProceso extends UnidadOperativa {

    private int capacidadDiaria;

    public PlantaProceso(String nombre, String comuna, int capacidadDiaria) {
        super(nombre, comuna);
        this.capacidadDiaria = capacidadDiaria;
    }

    public int getCapacidadDiaria() {
        return capacidadDiaria;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Planta de Proceso: " + nombre + " | Comuna: " + comuna + " | Capacidad diaria: " + capacidadDiaria + " t/dia");
    }
}
