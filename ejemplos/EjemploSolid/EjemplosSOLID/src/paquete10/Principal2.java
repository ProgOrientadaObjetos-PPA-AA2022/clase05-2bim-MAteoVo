/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author mateovalarezoojeda
 */
public class Principal2 {

    public static void main(String[] args) {
        String nombreArchivo = "data/peliculas.data";
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");

        APIStarPlus api3 = new APIStarPlus();
        api3.establecerApiKey("123455");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");

        APIDirectTv api4 = new APIDirectTv();
        api4.establecerApiKey("12345");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);
        archivo.establecerRegistroPeliculas(gp);
        archivo.establecerSalida();
        archivo.establecerRegistroPeliculas(gp2);
        archivo.establecerSalida();
        archivo.establecerRegistroPeliculas(gp3);
        archivo.establecerSalida();
        archivo.establecerRegistroPeliculas(gp4);
        archivo.establecerSalida();

    }
}
