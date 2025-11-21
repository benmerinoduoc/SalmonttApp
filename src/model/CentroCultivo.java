package model;

public class CentroCultivo {
    private String nombre;
    private String comuna;
    private int toneladas;

    //Constructor con validacion
    public CentroCultivo(String nombre, String comuna, int toneladas) {
        if(nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if(comuna == null || comuna.isEmpty()) {
            throw new IllegalArgumentException("La comuna no puede estar vacia");
        }
        if(toneladas < 0) {
            throw new IllegalArgumentException("La produccion no puede ser negativa");
        }

        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladas = toneladas;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacio, no se cambia");
        }
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        if(comuna != null && !comuna.isEmpty()) {
            this.comuna = comuna;
        } else {
            System.out.println("La comuna no puede estar vacia, no se cambia");
        }
    }

    public int getToneladas() {
        return toneladas;
    }

    public void setToneladas(int toneladas) {
        if(toneladas < 0) {
            System.out.println("La produccion no puede ser negativa, no se cambia");
            return;
        }
        this.toneladas = toneladas;
    }

    //toString para mostrar info del objeto
    @Override
    public String toString() {
        return nombre + " - " + comuna + " - " + toneladas + " toneladas";
    }
}
