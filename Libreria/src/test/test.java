/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import Modelo.Libro;
import Modelo.Sistema;
import Modelo.Usuario;

/**
 *
 * @author Gabos
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario u1 = new Usuario("123", "yo", "");
        Libro   l1 = new Libro("1234", "mister hide", "jekyll", "terror", 20);
        Sistema sig = new Sistema("", "");
        
        sig.registarLibro(l1);
        sig.registrarUsuario(u1);
        
        sig.verificarDisponibilidad(l1);
        
        u1.tomarLibro(l1);
        u1.devolverLibro(l1); 
        
        l1.prestarLibro(u1);
        l1.libroDevuelto(u1);
        
        sig.InformeDetallado();
        
                
                
    }
    
}
