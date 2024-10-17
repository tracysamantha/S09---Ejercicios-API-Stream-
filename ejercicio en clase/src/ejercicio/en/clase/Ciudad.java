/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.en.clase;
//van a crear 5 clases, la clase pais, ciudad clase director, genero y pelicula   
 //identificador entero  int idCiudad, string nombreCiudad, int nroPoblacion,  String codCiudad
    // ahora en la clase pais, vamos a tener un string codigo, string nombrePais, string nombreContinente, double areaPoblacion, int idCapital, int poblacion 
    //y una List<Ciudades> ciudades 
    // Para la siguiente clase director, va a tener int idDirector, string nombreDirector, Lis<String>premios
    
    //En la clase Genero va a tener int idGenero, String name 
    
    // en la clase pelicula va a tener idPelica, String tituloPelicula, int year, string ranking y Lis<Directores> directores
    
    // como parte del ejercicio pueden construir un metodo que guarde todas estas estructuras y puedan conectarlo con un archivo txt
    
    // necesito que me busquen las ciudades mas pobladas por cada continente, nada de for, nada de if, es solo declarativo. tenemos que crear nuestros objetos, data, 
/**
 *
 * @author tracy
 */
public class Ciudad {
    private int idCiudad;
    private String nombreCiudad; 
    private int nroPoblacion;
    private String codCiudad;

    public Ciudad(int idCiudad, String nombreCiudad, int nroPoblacion, String codCiudad) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;
        this.nroPoblacion = nroPoblacion;
        this.codCiudad = codCiudad;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public int getNroPoblacion() {
        return nroPoblacion;
    }

    public void setNroPoblacion(int nroPoblacion) {
        this.nroPoblacion = nroPoblacion;
    }

    public String getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(String codCiudad) {
        this.codCiudad = codCiudad;
    }
    
    
    
}