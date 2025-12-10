package model;

public class Proveedor implements Registrable {

    private String nombre;
    private String rubro;

    public Proveedor(String nombre, String rubro) {
        this.nombre = nombre;
        this.rubro = rubro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRubro() {
        return rubro;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Proveedor: " + nombre + " | Rubro: " + rubro);
    }
}
