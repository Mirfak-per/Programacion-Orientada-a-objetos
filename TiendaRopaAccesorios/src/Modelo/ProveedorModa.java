/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class ProveedorModa {
    private String codigoProveedor,nombre,prendasSuministradas;

    public ProveedorModa() {
    }

    public ProveedorModa(String codigoProveedor, String nombre, String prendasSuministradas) {
        setCodigoProveedor(codigoProveedor);
        setNombre(nombre);
        setPrendasSuministradas(prendasSuministradas);
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

    public String getPrendasSuministradas() {
        return prendasSuministradas;
    }

    public void setPrendasSuministradas(String prendasSuministradas) {
        this.prendasSuministradas = prendasSuministradas;
    }
//
    @Override
    public String toString() {
        return """
               ProveedorModa:
               codigoProveedor=""" + codigoProveedor + "\nnombre=" + nombre +
                "\nprendasSuministradas=" + prendasSuministradas + '\n';
    }

}
