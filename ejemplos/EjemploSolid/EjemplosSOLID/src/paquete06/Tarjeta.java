/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author mateovalarezoojeda
 */
public class Tarjeta {

    private String nombreBanco;
    private double cupoMaximo;

    public Tarjeta(String n, double c) {
        nombreBanco = n;
        cupoMaximo = c;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public void establecerNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }

    public void establecerCupoMaximo(double cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public String toString() {
        String cadena = String.format("%s Cupo máximo: %.2f\n", nombreBanco, cupoMaximo);
        return cadena;
    }
}
