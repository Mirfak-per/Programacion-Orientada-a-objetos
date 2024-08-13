/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0806
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
    
    // Contrsuctores (Crear Objetos)
    
    public Vehiculo(){
        //Crear un constructor vacio primero como base
}
    
    public Vehiculo(String patente, String color, String motor, int cantRuedas, int precio,char inicialColor, boolean isTienesello){
        //recibe los atributos para modificarlos mas tarde
        this.patente = patente;
        this.color = color;
        this.motor = motor;
        this.cantRuedas = cantRuedas;
        this.precio = precio;
        this.inicialColor = inicialColor;
        this.isTienesello = isTienesello;
}
    
    // Get - Set
    //get tiene que tener un orden, get(Mays-resto_de_objeto)
    public String getPatente(){
        return patente;
}   
    public String getColor(){
        return color;
}   
    public String getMotor(){
        return motor;
}
    public int getCantRuedas(){
        return cantRuedas;
}
    public int getPrecio(){
        return precio;
}
    public char getInicialColor(){
        return inicialColor;
}
    public boolean getIsTienesello(){
        return isTienesello;
}
    // Metodos
}