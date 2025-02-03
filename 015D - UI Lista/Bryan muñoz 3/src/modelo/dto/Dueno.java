/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dto;

/**
 *
 * @author Gabos
 */
public class Dueno {
    private String rut,nombre,apellido;
    private int edad,telefono;

    public Dueno() {
    }

    public Dueno(String rut, String nombre, String apellido, int edad, int telefono) {
        setRut(rut);
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setTelefono(telefono);
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Dueno{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono + '}';
    }
    
    
    
}
