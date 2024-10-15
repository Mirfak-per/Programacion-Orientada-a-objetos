/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Modelo.DAO.Sucursal;
import Modelo.DTO.*;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Sucursal s1 = new Sucursal("001", "Sucursal Principal");
        
        
       VehiculoDeLujo v1 = new VehiculoDeLujo("001", "chevrolet", 1000);
       VehiculoEstandar v2 = new VehiculoEstandar("002", "audi", 1500);
       
       s1.agregarVehiculodelujo(v1);
       s1.agregarVehiculoEstandar(v2);
        System.out.println(s1.calcularCostoAlquiler());
        s1.ListarVehiculos();
        
        
        
        
        
        
        
    }
    
}
