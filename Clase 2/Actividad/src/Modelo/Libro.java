/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class Libro {
    private String titulo,autor,genero;
    private int codigo;
    private Boolean disponibilidad;

    public Libro() {
    }

    public Libro(String titulo, String autor, String genero, int codigo, Boolean disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.codigo = codigo;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public String toString() {
        return """
               Libro:
               titulo=""" + titulo + "\nautor=" + autor + "\ngenero=" + genero + "\ncodigo=" + codigo + "\ndisponibilidad=" + disponibilidad + '\n';
    }


}



