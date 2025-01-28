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
public class Producto{
    private String tipoProducto,nombre;
    private int stock,fechaIngreso,codigo;

    public Producto() {
    }

    public Producto(String tipoProducto, int codigo, String nombre, int stock, int fechaIngreso) {
        setTipoProducto(tipoProducto);
        setCodigo(codigo);
        setNombre(nombre);
        setStock(stock);
        setFechaIngreso(fechaIngreso);
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(int fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Producto{" + "tipoProducto=" + tipoProducto + ", codigo=" + codigo + ", nombre=" + nombre + ", stock=" + stock + ", fechaIngreso=" + fechaIngreso + '}';
    }


 

    
    
}
