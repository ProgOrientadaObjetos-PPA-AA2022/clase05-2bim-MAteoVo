/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author mateovalarezoojeda
 */
public class TransporteAereo extends Transporte {
    private String aereolinea;
    
    
    public void establecerAereolinea(String n){
        aereolinea = n;
    }
    
    
    @Override
    public void establecerTarifa(){
        tarifa = 100+0.20;
    }
    
    
    public String obtenerCooperativaTaxi(){
        return aereolinea;
    }
         @Override
    public String toString(){
        String cadena = String.format("Transporte Aereo: $%.2f\n",obtenerTarifa());
        return cadena;
    }
}
