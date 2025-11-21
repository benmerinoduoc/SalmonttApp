package app;

import data.GestorDatos;
import model.CentroCultivo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();
        ArrayList<CentroCultivo> centros = gestor.cargarCentros("resources/centros.txt");

        // Mostrar todos los centros
        System.out.println("Lista completa de centros de cultivo:");
        for (CentroCultivo c : centros) {
            System.out.println(c);
        }

        // Filtro dinamico por produccion
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese cantidad minima de toneladas para filtrar centros:");
        int minimo = sc.nextInt();

        System.out.println("Centros con produccion mayor o igual a " + minimo + " toneladas:");
        for (CentroCultivo c : centros) {
            if (c.getToneladas() >= minimo) {
                System.out.println(c);
            }
        }

        sc.close();
    }
}
