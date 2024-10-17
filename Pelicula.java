package ejercicio.en.clase;


import ejercicio.en.clase.Director;
import ejercicio.en.clase.Genero;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// recomendaciones; 
// quedarme con las ciudadas mas pobladas por cada continente
// poblar nuestra informacion creando objetos en duro, en codigo , crean sus listas sus objetos 
// cual es la condicion para que una ciudad sea las mas poblada,pero cuales son las mas pobladas, son aquellas que tienen cierta condicion , quedarnos con la ciudad mas poblada de todo los continentes 
// y la tercera recomendacion es encontras la lista de las peliculas que solo contengan los generos de drama y comedia 
/**
 *
 * @author tracy
 */
public class Pelicula {
    private int idPelicula;
    private String tituloPelicula;
    private int year;
    private String ranking; 
    private List<Director> directores;
    private List<Genero> generos;

    public Pelicula(int idPelicula, String tituloPelicula, int year, String ranking, List<Director> directores, List<Genero> generos) {
        this.idPelicula = idPelicula;
        this.tituloPelicula = tituloPelicula;
        this.year = year;
        this.ranking = ranking;
        this.directores = directores;
        this.generos = generos;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    
    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public List<Director> getDirectores() {
        return directores;
    }

    public void setDirectores(List<Director> directores) {
        this.directores = directores;
    }
    
    

}
