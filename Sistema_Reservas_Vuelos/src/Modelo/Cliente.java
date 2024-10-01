/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gabos
 */
public class Cliente {
        private String idCliente,nombre;
        private Reserva reserva;
        private Pasajero_Frecuente pasajero_Frecuente;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, Reserva reserva, Pasajero_Frecuente pasajero_Frecuente) {
        setIdCliente(idCliente);
        setNombre(nombre);
        setReserva(reserva);
        setPasajero_Frecuente(pasajero_Frecuente);
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Pasajero_Frecuente getPasajero_Frecuente() {
        return pasajero_Frecuente;
    }

    public void setPasajero_Frecuente(Pasajero_Frecuente pasajero_Frecuente) {
        this.pasajero_Frecuente = pasajero_Frecuente;
    }

    @Override
    public String toString() {
        return """
               Cliente:
               idCliente=""" + idCliente + "\nnombre=" + nombre +
                "\nreserva=" + reserva + "\npasajero_Frecuente=" + pasajero_Frecuente + '\n';
    }
    //metodos
public void ReservaCliente(String n_asiento){
    reserva.setAsientoReservado(n_asiento);
    System.out.println("El numero de asiento reservado es: "+n_asiento);
}    
    
    
}
