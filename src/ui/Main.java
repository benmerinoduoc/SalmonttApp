package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorUnidades gestor = new GestorUnidades();

        List<UnidadOperativa> unidades = gestor.cargarUnidades();

        System.out.println("Lista de Unidades Operativas:\n");

        for (UnidadOperativa u : unidades) {
            u.mostrarInformacion();
        }
    }
}
