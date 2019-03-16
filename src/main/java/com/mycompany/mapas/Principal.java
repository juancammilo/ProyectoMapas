/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapas;

/**
 *
 * @author Jkammilo
 */
public class Principal {

    public Principal() {
        Logica logica = new Logica();
        logica.pideCed();
        logica.recibeCed(logica.getCed());
        logica.mostrarDatos();
    }
    
    public static void main(String[] args){
        Principal m = new Principal();
    }
}
