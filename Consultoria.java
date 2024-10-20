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
// lo siguiente es el punto 4 para ordenar paises por numero de ciudades en orden descendente
    public static List<Pais> ordenarPorNumeroDeCiudadesDesc(List<Pais> paises) {
        return paises.stream()
                .sorted(Comparator.comparingInt((Pais pais) -> pais.getCiudades().size()).reversed()) // Orden descendente
                .collect(Collectors.toList());
    }
    
    // lo mismo pero para orden ascendente 
    public static List<Pais> ordenarPorPoblacionAsc(List<Pais> paises) {
    return paises.stream()
            .sorted(Comparator.comparingInt(Pais::getPoblacion)) // Orden ascendente
            .collect(Collectors.toList());
}
   
    public static List<Pelicula> dramaYComedia(List<Pelicula> peliculas) {
        return peliculas.stream()
                .filter(pelicula -> {
                    List<String> generosNombres = pelicula.getGeneros().stream()
                            .map(Genero::getName)
                            .collect(Collectors.toList());
                    System.out.println("Generos de " + pelicula.getTituloPelicula() + ": " + generosNombres);
                    return generosNombres.contains("Drama")
                            && generosNombres.contains("Comedia")
                            && generosNombres.size() == 2;
                })
                .collect(Collectors.toList());
    }
}
