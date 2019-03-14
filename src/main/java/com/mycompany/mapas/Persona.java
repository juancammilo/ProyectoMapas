/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapas;

import java.util.Map;
import java.util.HashMap;


/**
 *
 * @author Jkammilo
 */
public class Persona {
    
    private String cedula;
    
    private String nombre;
    
    private String apellido;
    
    Map<String, Persona> mapa;

    public Persona(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        mapa = new HashMap<>();
    }    

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Map<String, Persona> getMapa() {
        return mapa;
    }

    public void setMapa(Map<String, Persona> mapa) {
        this.mapa = mapa;
    }

    
    
    
}
