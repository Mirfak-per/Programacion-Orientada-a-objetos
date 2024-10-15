/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0804
 */
public class VehiculoDeLujo extends Vehiculo{

    public VehiculoDeLujo() {
    }

    public VehiculoDeLujo(String idVehiculo, String modelo, double costoBaseAlquiler) {
        super(idVehiculo, modelo, costoBaseAlquiler);
    }
   

    @Override
        public double calcularCostoAlquiler() {
        setCostoBaseAlquiler(getCostoBaseAlquiler()+300);
        return getCostoBaseAlquiler();
    }
    
}
