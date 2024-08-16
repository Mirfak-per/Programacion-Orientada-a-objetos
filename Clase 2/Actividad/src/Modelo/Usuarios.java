/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class Usuarios {
    private String nombre,librosPrestados;
    private int run;

    public Usuarios() {
    }

    public Usuarios(String nombre, String librosPrestados, int run) {
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(String librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return """
               Usuarios:
               nombre=""" + nombre + "\nlibrosPrestados=" + librosPrestados + "\nrun=" + run + '\n';
    }
    
}
