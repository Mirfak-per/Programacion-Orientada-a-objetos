/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gabos
 */
public class Pasajero_Frecuente {
    private String numeroPasajero;
    private int puntos;

    public Pasajero_Frecuente() {
    }

    public Pasajero_Frecuente(String numeroPasajero, int puntos) {
        setNumeroPasajero(numeroPasajero);
        setPuntos(puntos);
    }

    public String getNumeroPasajero() {
        return numeroPasajero;
    }

    public void setNumeroPasajero(String numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return """
               Pasajero_Frecuente:
               numeroPasajero=""" + numeroPasajero + "\npuntos=" + puntos + '\n';
    }
    
    
    public void registrarPasajero(Cliente cliente){
        setNumeroPasajero(cliente.getIdCliente());
        setPuntos(getPuntos()+100);
        System.out.println("ID de Pasajero registrado correctamente, se han sumado 100 puntos");
    }
}
