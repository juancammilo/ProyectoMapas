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
    
    private int cedula;
    
    private String nombre;
    
    private String apellido;
    
    Map<Integer, Persona> mapa;

    public Persona(int cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        mapa = new HashMap<>();
    }    

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    public Map<Integer, Persona> getMapa() {
        return mapa;
    }

    public void setMapa(Map<Integer, Persona> mapa) {
        this.mapa = mapa;
    }

    
    
    
}
