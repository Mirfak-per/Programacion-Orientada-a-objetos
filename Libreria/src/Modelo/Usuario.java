/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gabos
 */
public class Usuario {
    private String run,nombre,librosPrestados;

    public Usuario() {
    }

    public Usuario(String run, String nombre, String librosPrestados) {
        setRun(run);
        setNombre(nombre);
        setLibrosPrestados(librosPrestados);
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
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

    @Override
    public String toString() {
        return """
               Usuario:
               run=""" + run + "\nnombre=" + nombre + "\nlibrosPrestados=" + librosPrestados + '\n';
    }
    
/* metodos
Las acciones podrían ser tomar prestado un libro o devolver un libro,
simplificando las interacciones del usuario con el sistema.
*/
    
public void tomarLibro(Libro libro){
    setLibrosPrestados(libro.getTitulo());
    System.out.println("El libro tomado es: "+getLibrosPrestados());
}

public void devolverLibro(Libro libro){
    String aux = getLibrosPrestados();
    setLibrosPrestados(null);
    System.out.println("El libro devuelto es: "+aux);
}

}
