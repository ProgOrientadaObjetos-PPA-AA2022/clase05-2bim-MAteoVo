/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author mateovalarezoojeda
 */
public class TransporteMaritimo extends Transporte {
     private String embarcacion;
    
    
    public void establecerEmbarcacion(String n){
        embarcacion = n;
    }
    
    
    @Override
    public void establecerTarifa(){
        tarifa = 100+0.20;
    }
    
    
    public String obtenerEmbarcacion(){
        return embarcacion;
    }
     @Override
    public String toString(){
        String cadena = String.format("Transporte Máritimo: $%.2f\n",obtenerTarifa());
        return cadena;
    }
}
