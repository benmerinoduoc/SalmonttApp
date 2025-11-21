package data;

import model.CentroCultivo;
import java.io.*;
import java.util.ArrayList;

public class GestorDatos {

    //Metodo que lee los datos desde un archivo y crea los objetos
    public ArrayList<CentroCultivo> cargarCentros(String rutaArchivo) {
        ArrayList<CentroCultivo> lista = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                //Separo los datos por punto y coma
                String[] partes = linea.split(";");

                //Creo el objeto con los datos del archivo
                String nombre = partes[0];
                String comuna = partes[1];
                int toneladas = Integer.parseInt(partes[2]);

                CentroCultivo c = new CentroCultivo(nombre, comuna, toneladas);

                //Lo agrego al arraylist
                lista.add(c);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error de formato numerico en el archivo");
        }

        return lista;
    }
}
