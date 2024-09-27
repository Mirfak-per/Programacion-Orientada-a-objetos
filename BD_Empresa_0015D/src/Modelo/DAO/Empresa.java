/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.DTO.Empleado;
import java.util.ArrayList;

/**es nuestra base de datos
 *
 * @author PAAPCA02LC0804
 */
public class Empresa {
    private ArrayList<Empleado> listaEmpleados;
    
    //INSTANCIA DE LA LISTA
    public Empresa (){
        //CREA UNA BASE DE DATOS VACIA
        listaEmpleados = new ArrayList<>();    
    }
    
    
    //CRUDL
    
    public boolean agregarEmpleado(Empleado empleado){
        return listaEmpleados.add(empleado);
    }
    
    // SELECT * FROM empleado WHERE rut = "1111"
    public boolean buscarEmpleado(String rut){
        for (Empleado aux : listaEmpleados) {
            if (aux.getRut().equals(rut)){
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarEmpleado(String rut){
        for (Empleado aux : listaEmpleados) {
            if (aux.getRut().equals(rut)){
               return listaEmpleados.remove(aux);
            }
        }
        return false;    
    }
    
    public boolean actualizarEmpleado(Empleado empleado){
        for (Empleado aux : listaEmpleados) {
            if(aux.getRut().equals(empleado.getRut())){
                listaEmpleados.remove((aux));
                return listaEmpleados.add(empleado);
            }
        }
        return false;
    }
    
    public void listarEmpleados(){
        for (Empleado aux : listaEmpleados) {
            System.out.println(aux.toString());
            
        }
    }
    
    public void obtenerpuesto(String rut){
        boolean aux2; 
        for (Empleado aux : listaEmpleados) {
          if (aux.getRut().equals(rut)){
              System.out.println("El puesto de trabajo es: "+aux.getPuesto().getArea());
              aux2 = true;
          }else{
          aux2 = false;
          }
          if (aux2 = false){
              System.out.println("El Empleado no existe");
        }
        }
        
        
       

    }
}
