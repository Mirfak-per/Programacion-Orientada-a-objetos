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
    private String numeroCliente,nombre,medicamentoAdquirido;

    public Cliente() {
    }

    public Cliente(String numeroCliente, String nombre, String medicamentoAdquirido) {
        setNumeroCliente(numeroCliente);
        setNombre(nombre);
        setMedicamentoAdquirido(medicamentoAdquirido);
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoAdquirido() {
        return medicamentoAdquirido;
    }

    public void setMedicamentoAdquirido(String medicamentoAdquirido) {
        this.medicamentoAdquirido = medicamentoAdquirido;
    }

    @Override
    public String toString() {
        return """
               Cliente:
               numeroCliente=""" + numeroCliente + "\nnombre=" + nombre + "\nmedicamentoAdquirido=" + medicamentoAdquirido + '\n';
    }
    //Metodos
    
    public void realizarCompra(Medicamento medicamento){
        //Registra la compra de un medicamento por parte del cliente
        System.out.println("El cliente adquiere: "+medicamento.getNombre());
        setMedicamentoAdquirido(medicamento.getNombre());
    }
    public void devolverMedicamento(){
        Medicamento medicamento = new Medicamento();
        System.out.println("El cliente devuelve el medicamento:"+getMedicamentoAdquirido());
        setMedicamentoAdquirido(null);
        
        int aux = medicamento.getStock()+1;
        medicamento.setStock(aux);
        System.out.println("Se a agregado un medicameto al stock, stock actual: "+medicamento.getStock());
        
    }
}
