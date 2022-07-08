/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private String promedioEdadesCualitativo;
    // private double edadminima;

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }
    public void establecerPromedioEdadesCualitativo(){
        if (promedioEdades <= 0 && promedioEdades <= 24) {
            promedioEdadesCualitativo = "Promedio jovenes";
        }else{
            promedioEdadesCualitativo = "Promedio adultos";
        }
    }
    public String obtenerPromedioEdadesCualitativo(){
        return promedioEdadesCualitativo;
    }
    @Override
    public String toString() {
        String cadena = String.format("Listado de estudiantes\n\n");
        for (Persona e : obtenerEstudiante()) {
            cadena = String.format("%sNombre: %s\n",
                    cadena, e.obtenerNombre());
        }
        cadena = String.format("%s\nPromedio de edades: %.2f\nPromedio edades Cualitativo: %s\n", cadena, promedioEdades,promedioEdadesCualitativo);
        return cadena;
    }

}
