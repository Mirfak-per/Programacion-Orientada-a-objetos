/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import Modelo.Cliente;
import Modelo.Compania_Aerea;
import Modelo.Pasajero_Frecuente;
import Modelo.Reserva;
import Modelo.Vuelo;

/**
 *
 * @author Gabos
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vuelo v1 = new Vuelo("123", "mi casa", "tu casa", "");
        Reserva r1 = new Reserva("23", v1);
        Pasajero_Frecuente p1 = new Pasajero_Frecuente("1", 1000);
        Cliente c1 = new Cliente("1", "marco", r1, p1);
        Compania_Aerea ca1 = new Compania_Aerea("1", "vueloslatam", "");
    
        ca1.DisponibilidadVuelos(v1);
        c1.ReservaCliente("23");
        p1.registrarPasajero(c1);
        v1.DisponibilidadAsientos(r1);
        
    }
    
}
