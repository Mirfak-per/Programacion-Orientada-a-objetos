/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.DTO.Curso;
import java.util.ArrayList;

/**
 *
 * @author PAAPCA02LC0812
 */
public class Facultad {
    private String idFacultad,nombre;
    ArrayList<Curso> cursosOfrecidos;

    public Facultad() {
    }

    public Facultad(String idFacultad, String nombre) {
        this.idFacultad = idFacultad;
        this.nombre = nombre;
        cursosOfrecidos = new ArrayList<>();
    }

    public String getIdFacultad() {
        return idFacultad;
    }

    public void setIdFacultad(String idFacultad) {
        this.idFacultad = idFacultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        //decidi separa los curos de este to string por que ya hay un listar cursos aparte, lo mismo el porque no tiene un set o get
        return "Facultad{" + "idFacultad=" + idFacultad + ", nombre=" + nombre + '}';
    }
    
    public void agregarCurso(Curso c){
        cursosOfrecidos.add(c);
        System.out.println("El curso se agrego con exito!");
    }
    
    public void listarCursos(){
        for (Curso aux : cursosOfrecidos) {
            System.out.println(aux.toString());
            System.out.println("");
        }
    }
    
    public void actualizarCurso (Curso cActualizado){
        boolean aux2 = true;
        for (Curso aux : cursosOfrecidos) {
            if (aux.getIdCurso().trim().equalsIgnoreCase(cActualizado.getIdCurso().trim())) {
                cursosOfrecidos.remove(aux);
                cursosOfrecidos.add(cActualizado);
                System.out.println("El curso se actualizo con exito");
                aux2 = true;
            }else{
                aux2 = false;
            }
        } if (!aux2){
            System.out.println("El curso no exsisite o la id es erronea");
        }
    }

    public void eliminarCurso(String idCurso){
            boolean aux2 = true;
        for (Curso aux : cursosOfrecidos) {
            if (aux.getIdCurso().trim().equalsIgnoreCase(idCurso)) {
                cursosOfrecidos.remove(aux);
                System.out.println("El curso se elimno con exito");
                aux2 = true;
            }else{
                aux2 = false;
            }
        } if (!aux2){
            System.out.println("El curso no exsisite o la id es erronea");
        }
    }
    
    public void calcularCostoTotalCursos(){
        double suma = 0;
        for (Curso aux : cursosOfrecidos) {
            suma = suma+aux.getCostoBase();
        }
        System.out.println("El costo total de los cursos es de: "+suma);
    }
}
    