/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.en.clase;

import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author tracy
 */
public class Consultoria {

    public static Map<String, Ciudad> ciudadesMasPobladasPorContinente(List<Pais> paises) {
        return paises.stream()
                .collect(Collectors.toMap(
                        Pais::getNombreContinente,
                        pais -> pais.getCiudades().stream().max(Comparator.comparingInt(Ciudad::getNroPoblacion)).orElse(null),
                        (ciudad1, ciudad2) -> ciudad1
                ));
    }

    public static Optional<Ciudad> ciudadMasPobladaContinentes(List<Pais> paises) {
        return paises.stream()
                .flatMap(pais -> pais.getCiudades().stream())
                .max(Comparator.comparingInt(Ciudad::getNroPoblacion));
    }

    public static List<Pelicula> dramaYComedia(List<Pelicula> peliculas) {
        return peliculas.stream()
                .filter(pelicula -> {
                    List<String> generosNombres = pelicula.getGeneros().stream()
                            .map(Genero::getName) 
                            .collect(Collectors.toList());
                    return generosNombres.contains("Drama")
                            && generosNombres.contains("Comedia")
                            && generosNombres.size() == 2;
                })
                .collect(Collectors.toList());
    }
}
