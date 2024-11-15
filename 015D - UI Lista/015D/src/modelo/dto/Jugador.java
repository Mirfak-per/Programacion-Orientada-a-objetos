/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dto;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Jugador {
    private String rut, nombre, apellido, tipo, genero, titular;
    private int edad;

    public Jugador() {
    }

    public Jugador(String rut, String nombre, String apellido, String tipo, String genero, String titular, int edad) {
        setRut(rut);
        setNombre(nombre);
        setApellido(apellido);
        setTipo(tipo);
        setGenero(genero);
        setTitular(titular);
        setEdad(edad);
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", tipo=" + tipo + ", genero=" + genero + ", titular=" + titular + ", edad=" + edad + '}';
    }
    
    
}
