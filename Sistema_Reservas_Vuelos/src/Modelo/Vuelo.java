/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gabos
 */
public class Vuelo {
    private String idVuelo,origen,destino,asientosDisponibles;

    public Vuelo() {
    }

    public Vuelo(String idVuelo, String origen, String destino, String asientosDisponibles) {
        setIdVuelo(idVuelo);
        setOrigen(origen);
        setDestino(destino);
        setAsientosDisponibles(asientosDisponibles);
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(String asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    @Override
    public String toString() {
        return """
               Vuelo:
               idVuelo=""" + idVuelo + "\norigen=" + origen +
                "\ndestino=" + destino + "\nasientosDisponibles=" + asientosDisponibles + '\n';
    }
    
    public void DisponibilidadAsientos(Reserva reserva){
        String aux= reserva.getAsientoReservado();
        setAsientosDisponibles(getAsientosDisponibles()+" "+aux);
        System.out.println("Los asientos ocupados son: "+getAsientosDisponibles());
    }

}
