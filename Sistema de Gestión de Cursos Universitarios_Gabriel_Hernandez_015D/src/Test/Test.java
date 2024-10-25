/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Modelo.DAO.Facultad;
import Modelo.DTO.*;

/**
 *
 * @author PAAPCA02LC0812
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Facultad f1 = new Facultad("001", "Facultad1");
        //test de reglas de negocio
        CursoEnLinea cen1 = new CursoEnLinea("zoomies", 20, 10, "001", "falla1", 0);
        CursoHibrido ch1 = new CursoHibrido(0, 20, "marco", "002", "    ", 100);
        CursoPresencial CursoP1 = new CursoPresencial(10, 0, "marco", "003", "falla3", 300);
        /////
        CursoEnLinea cen2 = new CursoEnLinea("zoom", 20, 10, "A1", "Curso1", 2000);
        
        CursoHibrido ch2 = new CursoHibrido(10, 20, "marco", "A2", "Curso2", 1000);
        
        CursoPresencial CursoP2 = new CursoPresencial(10, 20, "marco", "A3", "Curso3", 3000);
        CursoPresencial CursoP2new = new CursoPresencial(15, 15, "juan", "A3", "Curso3", 1000);
    
        f1.agregarCurso(cen2);
        f1.agregarCurso(ch2);
        f1.agregarCurso(CursoP2);
        
        f1.listarCursos();
        
        f1.actualizarCurso(CursoP2new);
       
        f1.listarCursos();
        
        cen2.calcularCostoCurso();
        ch2.calcularCostoCurso();
        CursoP2new.calcularCostoCurso();
        
        f1.listarCursos();
        
        f1.eliminarCurso("A2");
        
        f1.listarCursos();
        
        f1.calcularCostoTotalCursos();
    }
    
}
