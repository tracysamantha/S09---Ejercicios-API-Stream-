/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.en.clase;

/**
 *
 * @author tracy
 */
public class Genero {

    private int idGenero;
    private String name;
    
    public Genero(){
        
    }

    public Genero(int idGenero, String nombreGenero) {
        this.idGenero = idGenero;
        this.name = name;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
