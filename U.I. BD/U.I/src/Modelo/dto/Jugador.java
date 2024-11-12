/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dto;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Jugador {
    private String nombre,rut,apellido,tipo,genero,titular;
    private int edad;

    public Jugador() {
    }

    public Jugador(String nombre, String rut, String apellido, String tipo, String genero, String titular, int edad) {
        setNombre(nombre);
        setRut(rut);
        setApellido(apellido);
        setTipo(tipo);
        setGenero(genero);
        setTitular(titular);
        setEdad(edad);
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
        return "Jugador:\n " + "nombre " + nombre + "\n rut " + rut + "\n apellido " + apellido +
                "\n tipo " + tipo + "\n genero " + genero + "\n titular " + titular + "\nedad " + edad + '\n';
    }
    
    
}
