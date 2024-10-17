/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.en.clase;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 *
 * @author tracy
 */
public class Main {

    public static void main(String[] args) {
        Genero drama = new Genero(1, "Drama");
        Genero comedia = new Genero(2, "Comedia");
        List<Ciudad> ciudadesAsia = List.of(new Ciudad(1, "Tokio", 37000000, "xx"));
        List<Ciudad> ciudadesEuropa = List.of(new Ciudad(2, "Londres", 14000000, "xx"));
        List<Ciudad> ciudadesAfrica = List.of(new Ciudad(3, "Lagos", 21000000, "xx"));
        List<Ciudad> ciudadesAmerica = List.of(new Ciudad(4, "Ciudad de Mexico", 21000000, "xx"));
        List<Ciudad> ciudadesOceania = List.of(new Ciudad(5, "Sydney", 5000000, "xx"));
        List<Ciudad> ciudadesSudamerica = List.of(new Ciudad(6, "Sao Paulo", 22000000, "xx"));
        List<Pais> paises = List.of(
                new Pais("JP", "Japon", "Asia", 2000, 1, 125000000, ciudadesAsia),
                new Pais("RU", "Reino Unido", "Europa", 1500, 2, 675000000, ciudadesEuropa),
                new Pais("NG", "Nigeria", "Africa", 1000, 3, 206000000, ciudadesAfrica),
                new Pais("MX", "Mexico", "America", 1500, 4, 128000000, ciudadesAmerica),
                new Pais("AU", "Australia", "Oceania", 12000, 5, 25000000, ciudadesOceania),
                new Pais("BR", "Brasil", "America del Sur", 1521, 6, 212000000, ciudadesSudamerica)
        );
        List<Genero> genero = List.of(new Genero(1, "Drama"), new Genero(2, "Comedia"));
        List<Director> directoresForrestGump = List.of(new Director(1, "Robert Zemeckis", List.of("Oscar")));
        List<Director> directoresTrumanShow = List.of(new Director(2, "Peter Weir", List.of("Golden Globe")));
        List<Director> directoresLittleMissSunshine = List.of(new Director(3, "Jonathan Dayton", List.of("BAFTA")), new Director(4, "Valerie Faris", List.of("Independent Spirit Award")));
        List<Director> directoresJuno = List.of(new Director(5, "Jason Reitman", List.of("Oscar Nominee")));
        List<Director> directoresGrandBudapest = List.of(new Director(6, "Wes Anderson", List.of("BAFTA")));

        List<Pelicula> peliculas = List.of(
                new Pelicula(101, "Forrest Gump", 1994, "A", directoresForrestGump, List.of(drama, comedia)),
                new Pelicula(102, "The Truman Show", 1998, "B", directoresTrumanShow, List.of(drama, comedia)),
                new Pelicula(103, "Little Miss Sunshine", 2006, "A", directoresLittleMissSunshine, List.of(drama, comedia)),
                new Pelicula(104, "Juno", 2007, "A", directoresJuno, List.of(drama, comedia)),
                new Pelicula(105, "The Grand Budapest Hotel", 2014, "A", directoresGrandBudapest, List.of(drama, comedia))
        );

        Map<String, Ciudad> ciudadesPorContinente = Consultoria.ciudadesMasPobladasPorContinente(paises);
        System.out.println("Ciudades mas pobladas por continente:");
        ciudadesPorContinente.forEach((continente, ciudad) -> {
            System.out.println("Continente: " + continente + ", Ciudad: " + (ciudad != null ? ciudad.getNombreCiudad() : "N/A"));
        });
        Optional<Ciudad> ciudadMasPoblada = Consultoria.ciudadMasPobladaContinentes(paises);
        ciudadMasPoblada.ifPresent(ciudad -> System.out.println("Ciudad mas poblada de todos los continentes: " + ciudad.getNombreCiudad()));

        List<Pelicula> peliculasDramaYComedia = Consultoria.dramaYComedia(peliculas);
        System.out.println("Peliculas con generos 'Drama' y 'Comedia':");

        if (peliculasDramaYComedia.isEmpty()) {
            System.out.println("No se encontraron peliculas que tengan solo los generos 'Drama' y 'Comedia'.");
        } else {
            peliculasDramaYComedia.forEach(pelicula -> System.out.println(pelicula.getTituloPelicula()));
        }
    }
}
