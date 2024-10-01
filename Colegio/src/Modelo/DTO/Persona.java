/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Persona {
    private String nombre,apellido,rut;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String rut, int edad) {
        setNombre(nombre);
        setApellido(apellido);
        setRut(rut);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return """
               Persona:
               nombre=""" + nombre + "\napellido=" + apellido + "\nrut=" + rut + "\nedad=" + edad + '\n';
    }
    
    
}
