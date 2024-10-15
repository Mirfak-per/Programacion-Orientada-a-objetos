/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Interfaz.CostoAlquilerCalculable;
import Modelo.DTO.*;
import java.util.ArrayList;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Sucursal implements CostoAlquilerCalculable{
    
    ArrayList<Vehiculo> listaVehiculo;
    private String idSucursal,nombre;

    public Sucursal() {
        
    }

    public Sucursal(String idSucursal, String nombre) {
        setIdSucursal(idSucursal);
        setNombre(nombre);
        listaVehiculo = new ArrayList<>();
    }

    public String getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(String idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "listaVehiculo=" + listaVehiculo + ", idSucursal=" + idSucursal + ", nombre=" + nombre + '}';
    }
    
    public void agregarVehiculodelujo(VehiculoDeLujo v){
        listaVehiculo.add(v);
        System.out.println("El vehiculo de lujo ha sido agregado correctamente");
    }
    
        public void agregarVehiculoEstandar(VehiculoEstandar v){
        listaVehiculo.add(v);
        System.out.println("El vehiculo estandar ha sido agregado correctamente");
    }


    @Override
    public double calcularCostoAlquiler() {
        double costoBase = 0; 
        for (Vehiculo aux : listaVehiculo) {
            costoBase += +aux.calcularCostoAlquiler();
        }
        return costoBase;
    }
    
    public void ListarVehiculos(){
        for (Vehiculo aux : listaVehiculo) {
            System.out.println(aux.toString());
        }
    }
}
