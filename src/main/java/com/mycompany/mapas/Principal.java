/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mapas;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;


/**
 *
 * @author Jkammilo
 */
public class Principal {

    public Principal() {
        
        Persona hijo1 = new Persona("1", "andres", "parra");
        Persona hijo2 = new Persona("2", "camilo", "casas");
        Persona hijo3 = new Persona("3", "gabriel", "cañon");
        Persona hijo4 = new Persona("4", "carlos", "bustos");
        Persona hijo5 = new Persona("5", "oscar", "martinez");
        Persona hijo6 = new Persona("6", "fernando", "muñoz");
        
        Persona padre1 = new Persona("7", "orlando", "mora");
            padre1.getMapa().put("1", hijo1);
            padre1.getMapa().put("2", hijo2);
            
        Persona padre2 = new Persona("8", "sebastian", "perez");
            padre2.getMapa().put("3", hijo3);
            padre2.getMapa().put("4", hijo4);
            
        Persona padre3 = new Persona("9", "jonatan", "cruz");
            padre3.getMapa().put("5", hijo5);
            padre3.getMapa().put("6", hijo6);
            
        Persona abuelo1 = new Persona("10", "Martin", "Mancilla");
            abuelo1.getMapa().put("7", padre1);
            abuelo1.getMapa().put("8", padre2);
        
        Persona abuelo2 = new Persona("11", "Arturo", "Montenegro");
            abuelo2.getMapa().put("9", padre3);
            
        Map<String, Persona> abuelos = new HashMap<>(); 
            abuelos.put("10", abuelo1);
            abuelos.put("11", abuelo2);
            
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite la cedula: ");
        String ced = entrada.nextLine();
        
        
        if(abuelos.containsKey(ced)){
            Persona abuelo = abuelos.get(ced);
            System.out.println("Soy abuelo, cedula: "+abuelo.getCedula()+" nombre: "+abuelo.getNombre()+" apellido: "+abuelo.getApellido());
            for (String llavePadre : abuelo.getMapa().keySet()) {
                Persona padre = abuelo.getMapa().get(llavePadre);
                System.out.println(" Padre cedula: "+llavePadre+ " nombre: "+padre.getNombre() + " apellido: "+ padre.getApellido());
                Persona hijo = abuelo.getMapa().get(padre.getCedula());
                    for (String llaveHijo : hijo.getMapa().keySet()) {
                        Persona  hij = hijo.getMapa().get(llaveHijo);
                        System.out.println("   Hijo cedula: "+llaveHijo+ " nombre: "+hij.getNombre() + " apellido: "+ hij.getApellido());
                    }
            }
        }
        else{
            for (String llaveAbuelo : abuelos.keySet()) {
                Persona abuelo = abuelos.get(llaveAbuelo);
                for (String llavePadre : abuelo.getMapa().keySet()) {
                    Persona padre = abuelo.getMapa().get(llavePadre);
                    if(ced.equals(llavePadre)){
                        System.out.println("Soy Padre, cedula: "+llavePadre+" nombre: "+padre.getNombre()+" apellido: "+padre.getApellido());
                        for (String llaveHijo : padre.getMapa().keySet()) {
                            Persona hijo = padre.getMapa().get(llaveHijo);
                            System.out.println("  Tengo hijo, cedula: "+llaveHijo+" nombre: "+hijo.getNombre()+" apellido:"+hijo.getApellido());
                        }
                        System.out.println("  Mi padre es, cedula: "+llaveAbuelo+" nombre: "+abuelo.getNombre()+" apellido: "+abuelo.getApellido());
                    }
                    else{
                        for (String llaveHijo : padre.getMapa().keySet()) {
                            Persona hijo = padre.getMapa().get(llaveHijo);
                            if(ced.equals(llaveHijo)){
                                System.out.println("Soy hijo, cedula: "+llaveHijo+" nombre: "+hijo.getNombre()+" apellido: "+hijo.getApellido());
                                System.out.println("  Mi padre es, cedula: "+llavePadre+" nombre: "+padre.getNombre()+" apellido: "+padre.getApellido());
                                System.out.println("  Mi abuelo es, cedula: "+llaveAbuelo+" nombre: "+ abuelo.getNombre()+" apellido: "+abuelo.getApellido());
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void main(String[] args){
        Principal p = new Principal();
    }
    
}
