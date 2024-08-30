/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class Proveedor_Farmaceutico {
    private String codigoProveedor,nombre,medicamentoSuministrado;

    public Proveedor_Farmaceutico() {
    }

    public Proveedor_Farmaceutico(String codigoProveedor, String nombre, String medicamentoSuministrado) {
        setCodigoProveedor(codigoProveedor);
        setNombre(nombre);
        setMedicamentoSuministrado(medicamentoSuministrado); 
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedicamentoSuministrado() {
        return medicamentoSuministrado;
    }

    public void setMedicamentoSuministrado(String medicamentoSuministrado) {
        this.medicamentoSuministrado = medicamentoSuministrado;
    }

    @Override
    public String toString() {
        return """
               Proveedor_Farmaceutico:
               codigoProveedor=""" + codigoProveedor + "\nnombre=" + nombre + "\nmedicamentoSuministrado=" + medicamentoSuministrado + '\n';
    }
    
    
}
