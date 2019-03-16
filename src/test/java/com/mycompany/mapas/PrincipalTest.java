/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapas;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jkammilo
 */
public class PrincipalTest {
    
    static Logica p;
    
    public PrincipalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
       p = new Logica();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testRecibeCedHijo(){
        String esperado = "Soy hijo, cedula: 1 nombre: andres apellido: parra\n  Mi padre es, cedula: 7 nombre: orlando apellido: mora\n    Mi abuelo es, cedula: 10 nombre: Martin apellido: Mancilla";
        String resultado = p.recibeCed(1);
        assertEquals(esperado, resultado);
    }

    @Test
    public void testRecibeCedPadre(){
        String esperado = "Soy Padre, cedula: 8 nombre: sebastian apellido: perez\n  Tengo hijo, cedula: 3 nombre: gabriel apellido:cañon\n  Tengo hijo, cedula: 4 nombre: carlos apellido:bustos\n   Mi padre es, cedula: 10 nombre: Martin apellido: Mancilla";
        String resultado = p.recibeCed(8);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testRecibeCedAbuelo(){
        String esperado = "Soy abuelo, cedula: 11 nombre: Arturo apellido: Montenegro\n Padre cedula: 9 nombre: jonatan apellido: cruz\n   Hijo cedula: 5 nombre: oscar apellido: martinez\n   Hijo cedula: 6 nombre: fernando apellido: muñoz";
        String resultado = p.recibeCed(11);
        assertEquals(esperado, resultado);
    }
    
}
