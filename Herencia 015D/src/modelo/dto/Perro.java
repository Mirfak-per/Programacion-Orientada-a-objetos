/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dto;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Perro extends Animal {
    private int cantPatas;

    public Perro() {
    }

    public Perro(int cantPatas, String nombre, int edad, int peso, int altura, char sexo, boolean isVivo) {
        super(nombre, edad, peso, altura, sexo, isVivo);
        setCantPatas(cantPatas);
    }

    public int getCantPatas() {
        return cantPatas;
    }

    public void setCantPatas(int cantPatas) {
        this.cantPatas = cantPatas;
    }

    @Override
    public String toString() {
        return "Perro{" + "cantPatas=" + cantPatas + '}' + super.toString();
    }
    
    // SOBREESCRITURA: TIENE EL MISMO NOMBRE QUE EL METODO DEL PADRE
    // PERO CON DISTINTO CONTENIDO
    @Override
    public void comer() {
        System.out.println("Perro: Estoy comiendo....");
    }
    
    public void comer(String alimento, String lugar) {
        System.out.println("Perro: Estoy comiendo " + alimento + " en " + lugar + "....");
    }
    
    public void ladrar() {
        System.out.println("Perro ladrando...");
    }
}
