/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class SistemaGestión {
private String catalogoPrendas,clientesRegistrados,proveedoresActivos;

    public SistemaGestión() {
    }

    public SistemaGestión(String catalogoPrendas, String clientesRegistrados, String proveedoresActivos) {
        this.catalogoPrendas = catalogoPrendas;
        this.clientesRegistrados = clientesRegistrados;
        this.proveedoresActivos = proveedoresActivos;
    }

    public String getCatalogoPrendas() {
        return catalogoPrendas;
    }

    public void setCatalogoPrendas(String catalogoPrendas) {
        this.catalogoPrendas = catalogoPrendas;
    }

    public String getClientesRegistrados() {
        return clientesRegistrados;
    }

    public void setClientesRegistrados(String clientesRegistrados) {
        this.clientesRegistrados = clientesRegistrados;
    }

    public String getProveedoresActivos() {
        return proveedoresActivos;
    }

    public void setProveedoresActivos(String proveedoresActivos) {
        this.proveedoresActivos = proveedoresActivos;
    }

    @Override
    public String toString() {
        return "SistemaGesti\u00f3n{" + "catalogoPrendas=" + catalogoPrendas + ", clientesRegistrados=" + clientesRegistrados + ", proveedoresActivos=" + proveedoresActivos + '}';
    }

//metodos
    
    private void registrarPrenda(PrendaVestir prenda){
    
    }
    
    private void registrarCliente(Cliente cliente){
    
    }
    
    private void verificarDisponibilidad(PrendaVestir prenda){
    
    }
    
    private void generarInformeVentas(){
    
    }
}
