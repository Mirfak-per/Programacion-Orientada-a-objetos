/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

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
        
        Animal animal = new Animal();
        Ave ave = new Ave();
        Delfin delfin = new Delfin();
        Perro perro = new Perro();
        
        System.out.println(animal.toString());
        // SOBREESCRITURA
        animal.comer();
        perro.comer();
        ave.comer();
        delfin.comer();
        System.out.println("");
        // SOBRECARGA
        perro.comer("Patita de pollo", "la cocina.");
        ave.comer("pescado", "la playa");
        delfin.comer("pescaditos", "el mar");
        System.out.println("");
        
        Ave ave2 = new Ave(2, "Jaimita", 30, 30, 30, 'F', true);
        Delfin delfin2 = new Delfin(2, "Juan", 40, 40, 40, 'M', true);
        Perro perro2 = new Perro(4,"Hachiko", 60, 60, 60, 'M', true);
        
        System.out.println(ave2.toString());
        System.out.println(delfin2.toString());
        System.out.println(perro2.toString());
        
        
    }
    
}
