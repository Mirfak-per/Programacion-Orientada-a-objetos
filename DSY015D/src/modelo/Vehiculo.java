/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.print.attribute.standard.MediaSize;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Vehiculo {
    // DECLARACION
    private String patente, color, motor;
    private int cantRuedas, precio;
    private char inicialColor; // 'B'
    private boolean isTieneSello;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String color, String motor, int cantRuedas, int precio,
            char inicialColor, boolean isTieneSello) {
        setPatente(patente);
        setColor(color);
        setMotor(motor);
        setCantRuedas(cantRuedas);
        setPrecio(precio);
        setInicialColor(inicialColor);
        setIsTieneSello(isTieneSello);
    }

    public String getPatente() {
        return patente;
    }
        /*
        condiciones
            || = or 
            && = and
            == = compara
                String:
                    equals: compara cadena de strings
                    equalsIgnoreCase: compara cadena de strings sin importar las mayusculas
                    trim: elimina espacios vacios 
    */
    //que la patente no este vacia
    public void setPatente(String patente) {
        if (patente == null || patente.isEmpty()){
            System.out.println("La patante no puede estar vacia");
        } else {
            this.patente = patente;
        }
     
    }

    public String getColor() {
        return color;
    }

    // quiero recibir colores rojo y gris
    public void setColor(String color) {
        if (color.trim().equals("Rojo")|| color.trim().equals("Gris")){
            this.color = color;
        } else {
            System.out.println("Solo se aceptan colores: Rojo y Gris");
        }
        
    }

    public String getMotor() {
        return motor;
    }
    //recibir motores: ZZ00 y JJOO
    public void setMotor(String motor) {
        if(motor.trim().equals("ZZ00") || motor.trim().equals("JJOO")){
            this.motor = motor;
        }else {
            System.out.println("Solo se aceptan motores: ZZ00 o JJOO");
        }
        
    }

    public int getCantRuedas() {
        return cantRuedas;
    }
    //minimo 2 ruedas y maximo 4
    public void setCantRuedas(int cantRuedas) {
        if (cantRuedas >= 2 && cantRuedas <=4){
            this.cantRuedas = cantRuedas;
        } else {
            System.out.println("Se aceptan entre 2 y 4 ruedas.");
        }
      
    }

    public int getPrecio() {
        return precio;
    }
    // solo se aceptan autos de 1m hacia arriba
    public void setPrecio(int precio) {
        if (precio >= 1000000){
            this.precio = precio;
        } else {
            System.out.println("Solo se aceptan autos de 1m");
        }

    }
    public char getInicialColor() {

        return inicialColor;
    }

    //solo se aceptan R o G
    public void setInicialColor(char inicialColor) {
        if (inicialColor == 'R'|| inicialColor == 'G' ||
                inicialColor == 'r'|| inicialColor == 'g'){
            this.inicialColor = inicialColor;
        } else {
            System.out.println("Solo se aceptan: R o G");
        }
        
    }
    public boolean isIsTieneSello() {
        return isTieneSello;
    }

    // si es true si tiene sello
    // si es false no tiene sello
    public void setIsTieneSello(boolean isTieneSello) {
        if (isTieneSello){
            System.out.println("Si tiene sello");
            this.isTieneSello = true;
        }else{
            System.out.println("No tiene sello");
            this.isTieneSello = false;
        }
    }

    @Override
    public String toString() {
        return """
               Vehiculo:
               patente=""" + patente + "\ncolor=" + color + "\nmotor=" + motor + "\ncantRuedas=" + cantRuedas + "\nprecio=" + precio + "\ninicialColor=" + inicialColor + "\nisTieneSello=" + isTieneSello + '\n';
    }

      
    
}
