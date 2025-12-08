package model;

public class CentroCultivo extends UnidadOperativa {

    private int toneladasProduccion;

    public CentroCultivo(String nombre, String comuna, int toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Centro de Cultivo: " + nombre + " | Comuna: " + comuna + " | Produccion: " + toneladasProduccion + " toneladas");
    }
}
