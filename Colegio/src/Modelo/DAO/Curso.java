/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.DTO.Alumno;
import java.util.ArrayList;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Curso {
        private ArrayList<Alumno> listaAlumno;
        private String idCruso;
        
        
 
//INSTANCIA DE LA LISTA
public Curso (){
    //CREA UNA BASE DE DATOS VACIA
   
}

    public Curso(String idCruso) {
        listaAlumno = new ArrayList<>(); 
        setIdCruso(idCruso);
    }

    public ArrayList<Alumno> getListaAlumno() {
        return listaAlumno;
    }

    public void setListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

    public String getIdCruso() {
        return idCruso;
    }

    public void setIdCruso(String idCruso) {
        this.idCruso = idCruso;
    }

    @Override
    public String toString() {
        return """
               Curso:
               listaAlumno=""" + listaAlumno + "\nidCruso=" + idCruso + '\n';
    }


    
public boolean agregarAlumno(Alumno alumno){
return listaAlumno.add(alumno);
}
    
public void buscarAlumno(String rut){
    for (Alumno aux : listaAlumno) {
        if (aux.getPersona().getRut().equalsIgnoreCase(rut)){
            System.out.println(aux.toString());
        }
    }
}
    
public boolean eliminarAlumno(String rut){
    for (Alumno aux : listaAlumno) {
        if (aux.getPersona().getRut().equalsIgnoreCase(rut)){
            return listaAlumno.remove(aux);
        }
    }
    return false;
}
  
public boolean actualizarAlumno(Alumno alumno){
    for (Alumno aux : listaAlumno) {
        if (aux.getPersona().getRut().equalsIgnoreCase(alumno.getPersona().getRut())){
        listaAlumno.remove(aux);
        return listaAlumno.add(alumno);
        }
    }
        return false;
}

public void listarAlumnos(){
    for (Alumno aux : listaAlumno) {
        System.out.println(aux.toString());
    }
}

public void obtenerJornada(String rut){
    for (Alumno aux : listaAlumno) {
        if (aux.getPersona().getRut().equalsIgnoreCase(rut))
        System.out.println(aux.getJornada());
    }
}


}


    


