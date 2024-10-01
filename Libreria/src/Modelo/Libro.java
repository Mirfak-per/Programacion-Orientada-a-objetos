/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gabos
 */
public class Libro {
    private String codigo, titulo, autor, genero;
    private int disponibilidad;

    public Libro() {
    }

    public Libro(String codigo, String titulo, String autor, String genero, int disponibilidad) {
        setCodigo(codigo);
        setTitulo(titulo);
        setAutor(autor);
        setGenero(genero);
        setDisponibilidad(disponibilidad);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String título) {
        this.titulo = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return """
               Libro:
               codigo=""" + codigo + "\ntitulo=" + titulo + "\nautor=" +
                autor + "\ngenero=" + genero + "\ndisponibilidad=" + disponibilidad + '\n';
    }
    
    //Se contemplan acciones como prestar a un usuario o marcar como devuelto.
    public void prestarLibro(Usuario usuario){
        
    usuario.tomarLibro(this);
    
    int aux= getDisponibilidad()-1;
        System.out.println("El nuevo stock es de: "+aux);
        setDisponibilidad(aux);
    }
    
    public void libroDevuelto(Usuario usuario){
        usuario.devolverLibro(this);
            int aux= getDisponibilidad()+1;
        System.out.println("El nuevo stock es de: "+aux);
        setDisponibilidad(aux);
    }
}
