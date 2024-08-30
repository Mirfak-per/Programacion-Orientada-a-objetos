/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author PAAPCA02LC0805
 */
public class Medicamento {
    private String tipoMedicamento,codigo,nombre;
    private int stock;
    private Date caducidad;

    public Medicamento() {
    }

    public Medicamento(String tipoMedicamento, String codigo, String nombre, int stock, Date caducidad) {
        setTipoMedicamento(tipoMedicamento);
        setCodigo(codigo);
        setNombre(nombre);
        setStock(stock);
        setCaducidad(caducidad);
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public String toString() {
        return """
               Medicamento:
               tipoMedicamento=""" + tipoMedicamento + "\ncodigo=" + codigo + "\nnombre=" + nombre + "\nstock=" + stock + "\ncaducidad=" + caducidad + '\n';
    }
    
    //Metodos
    public void vender(Cliente cliente){
        //Registra la venta del medicamento a un cliente.

    cliente.realizarCompra(this); 
    int aux = getStock() -1;
                System.out.println("Se a descontado un medicamto de stock, stock restante: "+aux);
        setStock(aux);
    }
    
}
