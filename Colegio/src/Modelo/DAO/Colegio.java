/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import java.util.ArrayList;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Colegio {
private ArrayList<Curso>listaCursos;
private ArrayList<SalaProfesores>listaProfesores;

public boolean agregarCurso(Curso curso){
return listaCursos.add(curso);
}
public boolean agregarSalaProfesores(SalaProfesores salaProfesores){
    return listaProfesores.add(salaProfesores);
}

public void buscarCurso(String idCurso){
    for (Curso aux : listaCursos) {
        if (aux.getIdCruso().equals(idCurso)) {
            System.out.println(aux.toString());
        }
    }
}

public void buscarSalaProfesores(String idSalaProfesores){
    for (SalaProfesores aux : listaProfesores) {
        if (aux.getIdSalaProfesor().equalsIgnoreCase(idSalaProfesores)) {
            System.out.println(aux.toString());
        }
    }
}

public void listarCurso(){
    for (Curso aux : listaCursos) {
        aux.listarAlumnos(); 
        }
    }

public void listarSalaProfesores(){
    for (SalaProfesores aux : listaProfesores){
        aux.listarProfesores();
    }
}

public boolean actualizarCurso(Curso curso){
    for (Curso aux : listaCursos) {
        if (true) {
            
        }
    }

}

}
