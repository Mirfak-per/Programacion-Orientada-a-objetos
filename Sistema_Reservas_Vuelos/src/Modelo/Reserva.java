/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gabos
 */
public class Reserva {
private String asientoReservado;
private Vuelo vuelo;

public Reserva() {
}

public Reserva(String asientoReservado, Vuelo vuelo) {
    setAsientoReservado(asientoReservado);
    setVuelo(vuelo);
}

public String getAsientoReservado() {
    return asientoReservado;
}

public void setAsientoReservado(String asientoReservado) {
    this.asientoReservado = asientoReservado;
}

public Vuelo getVuelo() {
    return vuelo;
}

public void setVuelo(Vuelo vuelo) {
    this.vuelo = vuelo;
}

@Override
public String toString() {
    return """
           Reserva:
           asientoReservado=""" + asientoReservado + "\nvuelo=" + vuelo + '\n';
}

}
