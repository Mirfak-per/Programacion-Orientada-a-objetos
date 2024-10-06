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

    public Colegio() {
        listaCursos = new ArrayList<>();
        listaProfesores = new ArrayList<>();
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(ArrayList<Curso> listaCursos) {
        this.listaCursos = listaCursos;
    }

    public ArrayList<SalaProfesores> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<SalaProfesores> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    @Override
    public String toString() {
        return "Colegio{" + "listaCursos=" + listaCursos + ", listaProfesores=" + listaProfesores + '}';
    }



public boolean agregarCurso(Curso curso){
return listaCursos.add(curso);
}
public boolean agregarSalaProfesores(SalaProfesores salaProfesores){
    return listaProfesores.add(salaProfesores);
}

public void buscarCurso(String idCurso){
      boolean aux2 = false;
    for (Curso aux : listaCursos) {
        if (aux.getIdCruso().equals(idCurso)) {
            System.out.println("El curso exsiste");
            aux2 = true;
        }else{
        aux2 = false;
        }
    }
    if (aux2 == false) {
       System.out.println("El curso no existe"); 
    }
}

public void buscarSalaProfesores(String idSalaProfesores){
      boolean aux2 = false;
    for (SalaProfesores aux : listaProfesores) {
        if (aux.getIdSalaProfesor().equals(idSalaProfesores)) {
            System.out.println("La sala de profesores exsiste");
            aux2 = true;
        }else{
        aux2 = false;
        }
    }
    if (aux2 == false) {
       System.out.println("La sala de profesores  no existe"); 
    }
}

public void listarCurso(){
    for (Curso aux : listaCursos) {
            System.out.println(aux.getIdCruso()); 
        }
    }
public void listarAlumnos(String id_curso){
    for (Curso aux : listaCursos) {
        if (aux.getIdCruso().equalsIgnoreCase(id_curso)) {
        aux.listarAlumnos();    
        }   
    }
}

public void listarSalaProfesores(){
    for (SalaProfesores aux : listaProfesores){
        System.out.println(aux.getIdSalaProfesor());
    }
}
public void listarprofesores(){
    for (SalaProfesores aux : listaProfesores) {
        aux.listarProfesores();
    }
}
public boolean actualizarIdCurso(String IdAntiguo, String nuevoId) {
    for (Curso aux : listaCursos) {
        if (aux.getIdCruso().equals(IdAntiguo)) {
            aux.setIdCruso(nuevoId);
            return true; 
        }
    }
    return false; 
}

public boolean actualizarSalaProfesores(String Idantiguo, String nuevoId){
    for (SalaProfesores aux : listaProfesores) {
        if (aux.getIdSalaProfesor().equalsIgnoreCase(Idantiguo)) {
            aux.setIdSalaProfesor(nuevoId);
            return true;
        }
    }
    return false;
}
}