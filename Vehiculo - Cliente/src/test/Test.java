/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import modelo.Propietario;
import modelo.Vehiculo;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // CREACION DE OBJETO
//        Vehiculo auto; // objeto vacio
//        
//        // INSTANCIA
//        Vehiculo auto2 = new Vehiculo(); // objeto vacio
//        Vehiculo moto = new Vehiculo("JJ-22-22", "Rojo", "1000ZZ", 2, 1000000, 'R', true);
//        
//        // USANDO EL OBJETO
//        auto2.getColor();
//        moto.getPrecio();
//        
//        // PARA IMPRIMIR EN CONSOLA: sout
//        System.out.println(auto2.getColor());
//        System.out.println(moto.getPrecio());
//        System.out.println("Color de la moto es " + moto.getColor());
//        
//        // MODIFICANDO OBJETOS
//        System.out.println(auto2.toString());
//        auto2.setColor("Morado");
//        auto2.setPatente("XXXXX");
//        System.out.println(auto2.toString());
        
        
////        System.out.println(p1.toString());
////        System.out.println(p2.toString());
////        
////        System.out.println("El valor de la patente es " + p1.getVehiculo().getPatente() + ".");
////        

        Vehiculo v1;
        v1 = new Vehiculo("XXXX01", "Gris", "ZZ00", 4,
                1000000, 'G', true);
        
        Vehiculo v2;
        v2 = new Vehiculo("ZZZZ01", "Rojo", "JJOO",
                4, 10000000, 'r', true);
        
        Propietario p1 = new Propietario("Freddy", "Campos", "Puente Alto 1", 50, v1);
        Propietario p2 = new Propietario("Pavel", "Morales", "Puente Alto 10", 34, v2);
       p2.mostrarDetalleVehiculo();
       p2.mostrarPrecioVehiculo();
       p1.estafar();
       p2.estafar(8000000);  
  }
} 