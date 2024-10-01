/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import Modelo.Carrito_Compras;
import Modelo.Cliente;
import Modelo.Producto;

/**
 *
 * @author PAAPCA02LC0804
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto0= new Producto("0", "Tomate", 1990);
        Producto producto1= new Producto("1", "Pescado", 2990);
        Carrito_Compras carrito = new Carrito_Compras("", 0);
        Cliente cliente = new Cliente("0", "marco", carrito);
        
    
        carrito.guardarProducto(producto0);
        carrito.precioTotal(producto0);
        
        carrito.guardarProducto(producto1);
        carrito.precioTotal(producto1);
        
    }
    
}
