/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class Sistema_de_Gestion_de_Inventarios {
    private String medicamentoActual,clienteActual,proveedorActual;

    public Sistema_de_Gestion_de_Inventarios() {
    }

    public Sistema_de_Gestion_de_Inventarios(String medicamentoActual, String clienteActual, String proveedorActual) {
        setMedicamentoActual(medicamentoActual);
        setClienteActual(clienteActual);
        setProveedorActual(proveedorActual);
    }

    public String getMedicamentoActual() {
        return medicamentoActual;
    }

    public void setMedicamentoActual(String medicamentoActual) {
        this.medicamentoActual = medicamentoActual;
    }

    public String getClienteActual() {
        return clienteActual;
    }

    public void setClienteActual(String clienteActual) {
        this.clienteActual = clienteActual;
    }

    public String getProveedorActual() {
        return proveedorActual;
    }

    public void setProveedorActual(String proveedorActual) {
        this.proveedorActual = proveedorActual;
    }

    @Override
    public String toString() {
        return """
               Sistema_de_Gestion_de_Inventarios
               medicamentoActual=""" + medicamentoActual + "\nclienteActual=" + clienteActual + "\nproveedorActual=" + proveedorActual + '\n';
    }
    
    //Metodos
    public void registrarMedicamento(Medicamento medicamento){
        setMedicamentoActual(medicamento.getNombre());
    } 
    
    public void registrarCliente(Cliente cliente){
        setClienteActual(cliente.getNombre());
    }
    public void registrarProveedor(Proveedor_Farmaceutico proveedor){
        setProveedorActual(proveedor.getNombre());
    }
    public void generarInformeVentas(){
        System.out.println(
                "\nEl ultimo cliente en el sistema es: "+getClienteActual()+
                "\nEl ultimo medicamento en el sistema es: "+getMedicamentoActual()+
                "\nEl ultimo proveedor es: "+getProveedorActual()); 
    }
}
