package model;

public class CentroCultivo extends UnidadOperativa {

    private int toneladasProduccion;

    public CentroCultivo(String nombre, String comuna, int toneladasProduccion) {
        super(nombre, comuna);
        this.toneladasProduccion = toneladasProduccion;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Producción (ton): " + toneladasProduccion;
    }
}
