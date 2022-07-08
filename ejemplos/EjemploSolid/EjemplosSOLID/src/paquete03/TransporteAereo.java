/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author mateovalarezoojeda
 */
public class TransporteAereo {
    private String aerolinea;
    private double tarifa;

    public TransporteAereo(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String obtenerAerolinea() {
        return aerolinea;
    }

    public void establecerAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public void establecerTarifa() {
        this.tarifa = 100+0.20;
    }
    
}
