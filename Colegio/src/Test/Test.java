/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Modelo.DAO.Colegio;
import Modelo.DAO.Curso;
import Modelo.DAO.SalaProfesores;
import Modelo.DTO.Alumno;
import Modelo.DTO.Persona;
import Modelo.DTO.Profesor;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//
Persona p1 = new Persona("Gabriel", "Hernandez", "111-1", 19);
Alumno a1 = new Alumno(p1, "Mañana");

// 
Persona p2 = new Persona("Maria", "Lopez", "222-2", 25);
Alumno a2 = new Alumno(p2, "Tarde");

//
Persona p3 = new Persona("Carlos", "Gutierrez", "333-3", 30);
Alumno a3 = new Alumno(p3, "Tarde");

//
Persona p4 = new Persona("Ana", "Martinez", "444-4", 22);
Alumno a4 = new Alumno(p4, "Mañana");

//
Persona p8 = new Persona("Javier", "Pérez", "444-4", 22);
Alumno a5 = new Alumno(p8, "Tarde");

// 
Persona p5 = new Persona("Luis", "Fernandez", "555-5", 28);
Profesor ps1 = new Profesor(p5, 110000, true);

//
Persona p6 = new Persona("Elena", "Ramirez", "666-6", 27);
Profesor ps2 = new Profesor(p6, 105000, false);

Persona p7 = new Persona("Sofía", "Castro", "777-7", 24);
Profesor ps3 = new Profesor(p7, 115000, false);

// Persona 9
Persona p9 = new Persona("Lucía", "Torres", "777-7", 23);
Profesor ps4 = new Profesor(p9, 118000, false);

// Nuevos cursos
Curso c1 = new Curso("0015D");
Curso c2 = new Curso("0020F");

//sala de profesores
SalaProfesores SP1 = new SalaProfesores("001");


Colegio colegio = new Colegio();
        
c1.agregarAlumno(a1);
c1.agregarAlumno(a2);
c2.agregarAlumno(a3);
c2.agregarAlumno(a4);
//c2.listarAlumnos();
c2.actualizarAlumno(a5);
//c2.listarAlumnos();
//c1.listarAlumnos();


SP1.agregarProfesor(ps1);
SP1.agregarProfesor(ps2);
SP1.agregarProfesor(ps3);
//SP1.listarProfesores();
SP1.actualizarProfesor(ps4);
//SP1.listarProfesores();

colegio.agregarCurso(c1);
colegio.agregarCurso(c2);
colegio.agregarSalaProfesores(SP1);

////
//colegio.listarCurso();
//colegio.listarAlumnos("0015D");
//colegio.listarSalaProfesores();
//colegio.listarprofesores();
//colegio.listarSalaProfesores();

////Comprueba si existen 
//colegio.buscarCurso("0020F");
//colegio.buscarSalaProfesores("001");

////actualizar
//colegio.actualizarIdCurso(c2, "0012A");
//colegio.actualizarSalaProfesores(SP1,"002");
    }  
}
