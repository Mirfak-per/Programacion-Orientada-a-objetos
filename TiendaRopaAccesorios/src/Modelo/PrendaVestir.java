/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class PrendaVestir {
        private String codigo,nombre,marca,categoria;
        private int disponibilidad;

    public PrendaVestir() {
    }

    public PrendaVestir(String codigo, String nombre, String marca, String categoria, int disponibilidad) {
        setCodigo(codigo);
        setNombre(nombre);
        setMarca(marca);
        setCategoria(categoria);
        setDisponibilidad(disponibilidad);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
//
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
               PrendaVestir:
               codigo=""" + codigo + "\nnombre=" + nombre + "\nmarca=" + marca + "\ncategoria=" +
                categoria +"\ndisponibilidad=" + disponibilidad + '\n';
    }
        //metodos
    
    public void vender(Cliente cliente){
    //Registra la venta de la prenda a un cliente.
    cliente.realizarCompra(this);
    int aux = getDisponibilidad() -1;
        System.out.println("La nueva disponibilidad es de: "+aux);
        setDisponibilidad(aux);
    }
    public void reponerInventario(){ 
        System.out.println("La disponibilidad del producto es de: "+ getDisponibilidad());       
    }
}
