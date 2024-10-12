/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

import Interfaz.CRUD;

/**
 *
 * @author PAAPCA02LC0804
 */
public abstract class Persona implements CRUD{
    
    protected String rut,nombre,appellido;
    protected int edad;
    protected double sueldo;

    public Persona() {
    }

    public Persona(String rut, String nombre, String appellido, int edad, double sueldo) {
        setRut(rut);
        setNombre(nombre);
        setAppellido(appellido);
        setEdad(edad);
        setSueldo(sueldo);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Perosna{" + "rut=" + rut + ", nombre=" + nombre + ", appellido=" + appellido + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
