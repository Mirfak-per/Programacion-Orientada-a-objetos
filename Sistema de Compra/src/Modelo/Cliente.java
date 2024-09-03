package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PAAPCA02LC0804
 */
public class Cliente {
    private String idCliente,nombre;
    private Carrito_Compras carrito_Compras;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, Carrito_Compras carrito_Compras) {
        setidCliente(idCliente);
        setNombre(nombre);
        setCarrito_Compras(carrito_Compras);
    }

    public String getidCliente() {
        return idCliente;
    }

    public void setidCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrito_Compras getCarrito_Compras() {
        return carrito_Compras;
    }

    public void setCarrito_Compras(Carrito_Compras carrito_Compras) {
        this.carrito_Compras = carrito_Compras;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", carrito_Compras=" + carrito_Compras + '}';
    }
            
    
    //metodos
    
    
}
