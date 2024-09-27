/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import Modelo.DAO.Empresa;
import Modelo.DTO.Empleado;
import Modelo.DTO.Puesto;

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
        
        Puesto ps1 = new Puesto("IT", "Informatico", 100);
        Puesto ps2 = new Puesto("manager", "Gerente", 99);
        
        Empleado emp1;
        emp1 = new Empleado("Gabriel", "1111-1", "Hernandez",
                10, 2000, 1234, 'M', ps1);
        Empleado emp2;
        emp2 = new Empleado("Juan", "2222-2", "carlos", 101,
                1000, 12345, 'M', ps1);
        
        Empleado emp3;
        emp3 = new Empleado("marco", "3333-3", "polo",
                99, 3000, 123456, 'M', ps2);
        
        Empresa empresa = new Empresa();
        
        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);
        empresa.agregarEmpleado(emp3);
        //empresa.listarEmpleados();
        
        //empresa.eliminarEmpleado("2222-2");
        empresa.listarEmpleados();
        
        System.out.println(empresa.buscarEmpleado("2222-2"));
        
        Empleado emp4;
        emp4 = new Empleado("marco", "3333-3", "guarnez",
                99, 4000, 1234567, 'M', ps1);
        
        empresa.actualizarEmpleado(emp4);
        //empresa.listarEmpleados();
        
       
        empresa.obtenerpuesto("2222-3");
    }
    
}
