/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mateovalarezoojeda
 */
public class Principal2 {
    public static void main(String[] args) {
        ArrayList<Transporte> listado = new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int op,op2;
        do {            
            System.out.println("Que tipo de Transporte desea ingresar??");
            System.out.println("Transorte Bus                        [1]");
            System.out.println("Transorte Taxi                       [2]");
            System.out.println("Transorte Aereo                      [3]");
            System.out.println("Transorte Maritimo                   [1]");
            op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    System.out.println("Ingrese nombre de la coperativa de Bus: ");
                    TransporteBus tb = new TransporteBus();
                    tb.establecerCooperativaBus(sc.nextLine());
                    tb.establecerTarifa();
                    listado.add(tb);
                    break;
                case 2:
                    System.out.println("Ingrese nombre de la coperativa de Taxi:");
                    TransporteTaxi tx = new TransporteTaxi();
                    tx.establecerCooperativaTaxi(sc.nextLine());
                    tx.establecerTarifa();
                    listado.add(tx);
                    break;
                case 3:
                    System.out.println("Ingrese nombre de la aerolinea:");
                    TransporteAereo ae = new TransporteAereo();
                    ae.establecerTarifa();
                    ae.establecerAereolinea(sc.nextLine());
                    listado.add(ae);
                    break;
                case 4:
                    System.out.println("Ingrese nombre de la embarcacion: ");
                    TransporteMaritimo tm = new TransporteMaritimo();
                    tm.establecerTarifa();
                    tm.establecerEmbarcacion(sc.nextLine());
                    listado.add(tm);
            }
            System.out.println("Desea ingresar otro transporte ?? SI[1] NO[0]");
            op2 = sc.nextInt();
        } while (op2!=0);
        TiposTransporte tp = new TiposTransporte();
        tp.establecerTransportes(listado);
        tp.establecerPromedioTarifas();
        System.out.println(tp);
    }
}
