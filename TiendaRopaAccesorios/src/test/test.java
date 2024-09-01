/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import Modelo.Cliente;
import Modelo.PrendaVestir;
import Modelo.ProveedorModa;
import Modelo.SistemaGestión;

/**
 *
 * @author PAAPCA02LC0805
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrendaVestir prenda = new PrendaVestir("PA01", "Pantalon rojo", "JJO", "Pantalon", 20);
        Cliente cliente = new Cliente("Juan", "", 1);
        ProveedorModa proveedor = new ProveedorModa("Pr01", "Marco", "Pantalon rojo");
        SistemaGestión sig = new SistemaGestión("", "", "");
        sig.verificarDisponibilidad(prenda);
        prenda.reponerInventario();
        prenda.vender(cliente);
        cliente.realizarCompra(prenda);
        cliente.devolverPrenda(prenda);
        proveedor.toString();
    }
    
}
