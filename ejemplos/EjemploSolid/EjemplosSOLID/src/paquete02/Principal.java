/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;


public class Principal {
    public static void main(String[] args) {
        Persona e1 = new Persona("Jelipe",19);
        Persona e2 = new Persona("El pirata",35);
        Persona e3 = new Persona("Pepe el grillo",99);
        ArrayList<Persona> listado = new ArrayList<>();
        listado.add(e1);
        listado.add(e2);
        listado.add(e3);
        OperacionesEstudiantes opes = new OperacionesEstudiantes();
        opes.establecerEstudiante(listado);
        opes.establecerPromedioEdades();
        opes.establecerPromedioEdadesCualitativo();
        System.out.printf("%s\n",opes);
    }
}
