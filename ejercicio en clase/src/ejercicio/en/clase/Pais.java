/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.en.clase;

import java.util.List;

/**
 *
 * @author tracy
 */
public class Pais {

    private String codigo;
    private String nombrePais;
    private String nombreContinente;
    private double areaPoblacion;
    private int idCapital;
    private int poblacion;
    private List<Ciudad> ciudades;

    public Pais(String codigo, String nombrePais, String nombreContinente, double areaPoblacion, int idCapital, int poblacion, List<Ciudad> ciudades) {
        this.codigo = codigo;
        this.nombrePais = nombrePais;
        this.nombreContinente = nombreContinente;
        this.areaPoblacion = areaPoblacion;
        this.idCapital = idCapital;
        this.poblacion = poblacion;
        this.ciudades = ciudades;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombreContinente() {
        return nombreContinente;
    }

    public void setNombreContinente(String nombreContinente) {
        this.nombreContinente = nombreContinente;
    }

    public double getAreaPoblacion() {
        return areaPoblacion;
    }

    public void setAreaPoblacion(double areaPoblacion) {
        this.areaPoblacion = areaPoblacion;
    }

    public int getIdCapital() {
        return idCapital;
    }

    public void setIdCapital(int idCapital) {
        this.idCapital = idCapital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    
    
}
