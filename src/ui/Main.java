package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

public class Main {
    public static void main(String[] args) {

        GestorUnidades gestor = new GestorUnidades();

        UnidadOperativa[] unidades = gestor.crearUnidades();

        System.out.println("=== Unidades Operativas Creadas ===");
        for (UnidadOperativa u : unidades) {
            System.out.println(u.toString());
        }
    }
}
