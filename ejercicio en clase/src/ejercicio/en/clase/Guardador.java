/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.en.clase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author tracy
 */
public class Guardador {
    public static void guardarDatos(List<Pais> paises, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Pais pais : paises) {
                writer.write("Pais: " + pais.getNombreContinente() + "\n");
                writer.write("Continente: " + pais.getNombreContinente() + "\n");
                for (Ciudad ciudad : pais.getCiudades()) {
                    writer.write("\tCiudad: " + ciudad.getNombreCiudad() + " - Población: " + ciudad.getNroPoblacion() + "\n");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
