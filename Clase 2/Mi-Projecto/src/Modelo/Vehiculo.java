/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0805
 */
public class Vehiculo {
    // Declaracion (Plantilla de los objetos)
    //private = solo visible desde la clase
    private String patente, color, motor;
    //private String color; arriba se juntan los mismos tipos en una linea
    //private String motor;
    private int cantRuedas, precio;
    //private int precio;
    private char inicialColor; //'B', solo soporta un character
    private boolean isTienesello;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String color, String motor, int cantRuedas, int precio, char inicialColor, boolean isTienesello) {
        this.patente = patente;
        this.color = color;
        this.motor = motor;
        this.cantRuedas = cantRuedas;
        this.precio = precio;
        this.inicialColor = inicialColor;
        this.isTienesello = isTienesello;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public char getInicialColor() {
        return inicialColor;
    }

    public void setInicialColor(char inicialColor) {
        this.inicialColor = inicialColor;
    }

    public boolean isIsTienesello() {
        return isTienesello;
    }

    public void setIsTienesello(boolean isTienesello) {
        this.isTienesello = isTienesello;
    }

    @Override
    public String toString() {
        return """
               Vehiculo:
               patente=""" + patente + "\ncolor=" + color + "\nmotor=" + motor + "\ncantRuedas=" + cantRuedas + "\nprecio=" + precio + "\ninicialColor=" + inicialColor + "\nisTienesello=" + isTienesello + '\n';
    }

    
}
