/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Modelo.Propietario;
import Modelo.Vehiculo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // Creacion de objeto
//        Vehiculo auto; // Objeto vacio
//        //Instancia
//        Vehiculo auto2 = new Vehiculo(); //objeto vacio
//        Vehiculo moto = new Vehiculo("JJ-22", "Verde", "1000cc", 2, 200000, 'V', true);
//        
//        // Usando el objeto
//        auto2.getColor();
//        moto.getPrecio();
//        
//        // Para imprimir en consola se usa: sout
//        System.out.println(moto.getColor());
//        System.out.println("Color de la moto es "+ moto.getColor());
//        
//        //Modificando objetos
//        System.out.println(auto2.toString());
//        auto2.setColor("Morado");
//        System.out.println(auto2.toString());
//    
//     
    Vehiculo v1;
        v1 = new Vehiculo( "xx-23",  "Rojo",  "2000hp", 4,
                3000,  'R', false);
    Vehiculo v2;
        v2 = new Vehiculo( "zz-23",  "Verde",  "1000hp", 4,
                2000,  'V', true);
    Propietario p1;
        p1 = new Propietario("Marco",  "mercedes",
                "Direccion de ejemplo 345", 6533, 33, v1);
    Propietario p2;
        p2 = new Propietario("Juan",  "mercedes",
                "Direccion de ejemplo 123", 1234, 23, v2);
        
        
        System.out.println(p1.toString());
        System.out.println("\n");
        System.out.println("La patente de p1 es; "+p1.getVehiculo().getPatente()+".");
        p2.mostrardetallevehiculo();
        p2.mostrarPrecioVehiculo();
        p2.estafar();
        p2.estafar(5000);
        p2.setprecio(1600);
}
    
}
