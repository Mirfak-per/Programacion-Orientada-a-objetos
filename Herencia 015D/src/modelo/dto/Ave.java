/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dto;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Ave extends Animal {
    private int cantAlas;

    public Ave() {
        this.cantAlas = 2;
    }

    public Ave(int cantAlas, String nombre, int edad, int peso, int altura, char sexo, boolean isVivo) {
        super(nombre, edad, peso, altura, sexo, isVivo);
        setCantAlas(cantAlas);
    }

    public int getCantAlas() {
        return cantAlas;
    }

    public void setCantAlas(int cantAlas) {
        this.cantAlas = cantAlas;
    }

    @Override
    public String toString() {
        return "Ave{" + "cantAlas=" + cantAlas + '}' + super.toString();
    }
    
    @Override
    public void comer() {
        System.out.println("Ave: Estoy comiendo....");
    }
    
    // SOBRECARGA: CUANDO TIENE EL MISMO NOMBRE QUE EL METODO DEL PADRE
    // PERO SE LE AGREGAN MAS PARAMETROS
    
    public void comer(String alimento, String lugar) {
        System.out.println("Ave: Estoy comiendo "+alimento+" en "+lugar+"....");
    }
    
}
