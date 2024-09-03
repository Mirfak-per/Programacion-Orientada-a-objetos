/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Carrito_Compras {
    
    private String productos; 
    private double total;

    public Carrito_Compras() {
    }

    public Carrito_Compras(String productos, double total) {
        this.productos = productos;
        this.total = total;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Carrito_Compras{" + "productos=" + productos + ", total=" + total + '}';
    }
    
    //metoods
    public void guardarProducto(Producto producto){
    String aux = producto.getNombre()+" ";
        setProductos(getProductos()+aux);
        System.out.println("El ultimo prodcuto agregado es: "+getProductos());
    }
    
    public void precioTotal(Producto producto){
        setTotal(getTotal()+producto.getPrecio());
        System.out.println("El total es: "+getTotal());
    }

}
