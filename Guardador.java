/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.en.clase;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author tracy
 */
public class Guardador {

    public static void guardarDatos(List<Pais> paises, List<Pelicula> peliculas, Map<String, Ciudad> ciudadesPorContinente,
            Optional<Ciudad> ciudadMasPoblada, List<Pais> paisesOrdenadosPorCiudades, List<Pais> paisesOrdenadosPorPoblacion, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
 
            writer.write("Ciudades mas pobladas por continente:\n");
            for (Map.Entry<String, Ciudad> entry : ciudadesPorContinente.entrySet()) {
                writer.write("Continente: " + entry.getKey() + ", Ciudad: " + (entry.getValue() != null ? entry.getValue().getNombreCiudad() : "N/A") + "\n");
            }

            writer.write("\nCiudad mas poblada de todos los continentes: ");
            ciudadMasPoblada.ifPresent(ciudad -> {
                try {
                    writer.write(ciudad.getNombreCiudad() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            writer.write("\nPeliculas con generos Drama y Comedia:\n");
            if (peliculas.isEmpty()) {
                writer.write("No se encontraron peliculas que tengan solo los generos 'Drama' y 'Comedia'.\n");
            } else {
                for (Pelicula pelicula : peliculas) {
                    writer.write(pelicula.getTituloPelicula() + "\n");
                }
            }

            writer.write("\nPaises ordenados por numero de ciudades (descendente):\n");
            for (Pais pais : paisesOrdenadosPorCiudades) {
                writer.write(pais.getNombrePais() + ": " + pais.getCiudades().size() + " ciudades\n");
            }

            writer.write("\nPaises ordenados por poblacion (ascendente):\n");
            for (Pais pais : paisesOrdenadosPorPoblacion) {
                writer.write(pais.getNombrePais() + ": " + pais.getPoblacion() + " habitantes\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
