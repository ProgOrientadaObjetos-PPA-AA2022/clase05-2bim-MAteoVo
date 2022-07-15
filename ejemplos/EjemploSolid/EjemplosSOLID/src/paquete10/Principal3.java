/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author mateovalarezoojeda
 */
public class Principal3 {

    public static void main(String[] args) {
        String nombreArchivo = "data/peliculas.data";
        LecturaArchivoSecuencial lectura
                = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerPeliculas();
        System.out.println(lectura);
    }
}
