/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import modelo.dao.AnimalDAO;
import modelo.dto.*;


/**
 *
 * @author PAAPCA02LC0800
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
        Ave ave = new Ave(2, "Jaimita", 30, 30, 30, 'F', true);
        Delfin delfin = new Delfin(2, "Juan", 40, 40, 40, 'M', true,"codigo1");
        Perro perro = new Perro(4,"Hachiko", 60, 60, 60, 'M', true);
        
        AnimalDAO dao = new AnimalDAO();
        
        dao.add(ave);
        dao.add(delfin);
        dao.add(perro);
//        
//        dao.list();
//        
//        dao.delete("Hachiko");
//        dao.list();
        dao.buscarAnimal("Juan");
        dao.listarPorEdad();
        
    }
    
}
