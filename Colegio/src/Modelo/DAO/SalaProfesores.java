/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.DTO.Profesor;
import java.util.ArrayList;

/**
 *
 * @author PAAPCA02LC0804
 */
public class SalaProfesores {
    private ArrayList<Profesor> listaProfesores;
    private String idSalaProfesor;
    
    
//INSTANCIA DE LA LISTA
    public SalaProfesores (){
        //CREA UNA BASE DE DATOS VACIA
  
    }

    public SalaProfesores(String idSalaProfesor) {
        listaProfesores = new ArrayList<>();  
        setIdSalaProfesor(idSalaProfesor);
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public void setListaProfesores(ArrayList<Profesor> listaProfesores) {
        this.listaProfesores = listaProfesores;
    }

    public String getIdSalaProfesor() {
        return idSalaProfesor;
    }

    public void setIdSalaProfesor(String idSalaProfesor) {
        this.idSalaProfesor = idSalaProfesor;
    }

    @Override
    public String toString() {
        return """
               SalaProfesores:
               listaProfesores=""" + listaProfesores + "\nidSalaProfesor=" + idSalaProfesor + '\n';
    }
    
    public boolean agregarProfesor(Profesor profesor){
    return listaProfesores.add(profesor);
    }
    
    public void buscarProfesor(String rut){
        for (Profesor aux : listaProfesores) {
            if (aux.getPersona().getRut().equalsIgnoreCase(rut)) {
                System.out.println(aux.toString());
            }
        }
    }
    
    public boolean eliminarProfesor(String rut){
        for (Profesor aux : listaProfesores) {
            if (aux.getPersona().getRut().equalsIgnoreCase(rut)) {
                return listaProfesores.remove(aux);
            }
        }
    return false;
    }
            
    public boolean actualizarProfesor(Profesor profesor){
        for (Profesor aux : listaProfesores) {
            if (aux.getPersona().getRut().equalsIgnoreCase(profesor.getPersona().getRut())) {
                listaProfesores.remove(aux);
                return listaProfesores.add(profesor);     
            }
        }
        return false;
    }
    
    public void listarProfesores(){
        for (Profesor aux : listaProfesores) {
            System.out.println(aux.toString());
        }
    }
    
    private void obtenerSueldo(Profesor profesor){
        System.out.println(profesor.getSueldo());
    }
    
    private void confirmarEstacionamineto(Profesor profesor){
        System.out.println(profesor.isTieneEstacionamiento());
    }
}
