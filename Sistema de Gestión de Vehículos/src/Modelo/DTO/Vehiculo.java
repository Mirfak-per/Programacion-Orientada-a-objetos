/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

import Interfaz.CostoAlquilerCalculable;


/**
 *
 * @author PAAPCA02LC0804
 */
public abstract class  Vehiculo implements CostoAlquilerCalculable{
    protected String idVehiculo,modelo;
    protected double costoBaseAlquiler;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, String modelo, double costoBaseAlquiler) {
        setIdVehiculo(idVehiculo);
        setModelo(modelo);
        setCostoBaseAlquiler(costoBaseAlquiler);
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCostoBaseAlquiler() {
        return costoBaseAlquiler;
    }

    public void setCostoBaseAlquiler(double costoBaseAlquiler) {
        this.costoBaseAlquiler = costoBaseAlquiler;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", modelo=" + modelo + ", costoBaseAlquiler=" + costoBaseAlquiler + '}';
    }

    
    
    
}
