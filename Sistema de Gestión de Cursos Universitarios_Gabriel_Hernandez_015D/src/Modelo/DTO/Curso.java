/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

import Intefaz.CostoCalculable;

/**
 *
 * @author PAAPCA02LC0812
 */
public abstract class Curso implements CostoCalculable{
    protected String idCurso,nombre;
    protected double costoBase;

    public Curso() {
    }

    public Curso(String idCurso, String nombre, double costoBase) {
        setIdCurso(idCurso);
        setNombre(nombre);
        setCostoBase(costoBase);
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.trim().equalsIgnoreCase(null)||(nombre.trim().length()<= 0)){
            System.out.println("El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        if (costoBase <= 0) {
            System.out.println("El costo debe ser mayor a cero");
        }else{
        this.costoBase = costoBase;
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "idCurso=" + idCurso + ", nombre=" + nombre + ", costoBase=" + costoBase + '}';
    }
    
}
