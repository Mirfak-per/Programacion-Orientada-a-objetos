/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Empleado {
    private String nombre,rut,apellido;
    private int id_empleado,sueldo,telefono;
    private char genero;
    private Puesto puesto;

    public Empleado() {
    }

    public Empleado(String nombre, String rut, String apellido, int id_empleado, int sueldo, int telefono, char genero, Puesto puesto) {
        setNombre(nombre);
        setRut(rut);
        setApellido(apellido);
        setId_empleado(id_empleado);
        setSueldo(sueldo);
        setTelefono(telefono);
        setGenero(genero);
        setPuesto(puesto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", rut=" + rut +
                ", apellido=" + apellido + ", id_empleado=" + id_empleado + ", sueldo=" + sueldo +
                ", telefono=" + telefono + ", genero=" + genero + ", puesto=" + puesto + '}';
    }
    
    
}
