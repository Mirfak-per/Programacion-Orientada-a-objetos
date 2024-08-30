/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Modelo.Cliente;
import Modelo.Medicamento;
import Modelo.Proveedor_Farmaceutico;
import Modelo.Sistema_de_Gestion_de_Inventarios;
import java.util.Date;


/**
 *
 * @author PAAPCA02LC0805
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Medicamento medicamento = new Medicamento("analgesico", "ME01", "Ibuprofeno", 10,new Date(2024, 8, 30, 14, 6));
        Cliente cliente = new Cliente("CLI01","Alan", "");
        Proveedor_Farmaceutico proveedor = new Proveedor_Farmaceutico("Pro01", "Juan", "");
        Sistema_de_Gestion_de_Inventarios sgi = new Sistema_de_Gestion_de_Inventarios("", "", "");
                        
        sgi.registrarCliente(cliente);
        sgi.registrarMedicamento(medicamento);
        sgi.registrarProveedor(proveedor);
        
        cliente.realizarCompra(medicamento);
        cliente.devolverMedicamento();
        
        medicamento.vender(cliente);
        sgi.generarInformeVentas();
    }
    
}
