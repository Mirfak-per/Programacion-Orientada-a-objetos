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
        setCatalogoPrendas(catalogoPrendas);
        setClientesRegistrados(clientesRegistrados);
        setProveedoresActivos(proveedoresActivos);
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
        return """
               SistemaGestion:
               catalogoPrendas=""" + catalogoPrendas + "\nclientesRegistrados=" +
                clientesRegistrados + "\nproveedoresActivos=" + proveedoresActivos + '\n';
    }

//metodos
    
    public void registrarPrenda(PrendaVestir prenda){
        setCatalogoPrendas(prenda.getNombre());
    }
    
    public void registrarCliente(Cliente cliente){
        setClientesRegistrados(cliente.getNombre());
    }
    //
    public void verificarDisponibilidad(PrendaVestir prenda){
    if (prenda.getDisponibilidad() >= 0){
        System.out.println("El producto tiene disponibilidad");
    } else{
        System.out.println("El producto no tiene disponibilidad");
    }
    }
    public void generarInformeVentas(){
        System.out.println("*******************");
        System.out.println("*INFORME DETALLADO*");
        System.out.println("*******************");
        System.out.println("Catalogo\n"+getCatalogoPrendas());
        System.out.println("Clientes\n"+getClientesRegistrados());
        System.out.println("proveedores\n"+getProveedoresActivos());
        System.out.println("*******************");
    }
}
