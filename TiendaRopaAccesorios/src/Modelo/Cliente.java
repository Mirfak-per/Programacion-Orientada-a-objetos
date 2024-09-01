/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class Cliente {
    private String nombre,prendasAdquiridas;
    private int numeroCliente;

    public Cliente() {
    }

    public Cliente(String nombre, String prendasAdquiridas, int numeroCliente) {
        setNombre(nombre);
        setPrendasAdquiridas(prendasAdquiridas);
        setNumeroCliente(numeroCliente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrendasAdquiridas() {
        return prendasAdquiridas;
    }

    public void setPrendasAdquiridas(String prendasAdquiridas) {
        this.prendasAdquiridas = prendasAdquiridas;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    @Override
    public String toString() {
        return """
               Cliente:
               nombre=""" + nombre + "\nprendasAdquiridas=" +
                prendasAdquiridas + "\nnumeroCliente=" + numeroCliente + '\n';
    }
 //
    //metodos
    public void realizarCompra(PrendaVestir prenda){
        setPrendasAdquiridas(prenda.getNombre());
    }
    
    public void devolverPrenda(PrendaVestir prenda){
        System.out.println("La prenda devuelta es: "+getPrendasAdquiridas());
        int aux = prenda.getDisponibilidad() +1;
        System.out.println("La nueva disponibilidad es de: "+aux);
        prenda.setDisponibilidad(aux);
    }
    
}
