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
        if (nombre.trim().length() >= 2 && nombre.equalsIgnoreCase(nombre)) {
         this.nombre = nombre;   
        } else {
            System.out.println("Nombre incorrecto, debe tener más de 2 caracteres.");
        }  
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido.trim().length() >= 2) {
          this.apellido = apellido;  
        } else {
            System.out.println("Apellido incorrecto, debe tener más de 2 caracteres");
        }  
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
        if (edad > 6) {
          this.edad = edad;  
        } else {
            System.out.println("Error, la edad debe ser mayor a 6");
        } 
    }

    @Override
    public String toString() {
        return """
               Persona:
               nombre=""" + nombre + "\napellido=" + apellido + "\nrut=" + rut + "\nedad=" + edad + '\n';
    } 
}
