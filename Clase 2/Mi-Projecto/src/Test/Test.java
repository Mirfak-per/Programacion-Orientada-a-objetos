/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

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
        // Creacion de objeto
        Vehiculo auto; // Objeto vacio
        //Instancia
        Vehiculo auto2 = new Vehiculo(); //objeto vacio
        Vehiculo moto = new Vehiculo("JJ-22", "Verde", "1000cc", 2, 200000, 'V', true);
    
        // Usando el objeto
        auto2.getColor();
        moto.getPrecio();
        
        // Para imprimir en consola se usa: sout
        System.out.println(moto.getColor());
        System.out.println("Color de la moto es "+ moto.getColor());
        
        //Modificando objetos
        System.out.println(auto2.toString());
        auto2.setColor("Morado");
        System.out.println(auto2.toString());
    
     
    }
    
}
