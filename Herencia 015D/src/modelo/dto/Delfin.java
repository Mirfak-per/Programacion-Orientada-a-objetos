/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dto;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Delfin extends Animal {
    private int cantAletas;

    public Delfin() {
    }

    public Delfin(int cantAletas, String nombre, int edad, int peso, int altura, char sexo, boolean isVivo) {
        super(nombre, edad, peso, altura, sexo, isVivo);
        setCantAletas(cantAletas);
    }

    public int getCantAletas() {
        return cantAletas;
    }

    public void setCantAletas(int cantAletas) {
        this.cantAletas = cantAletas;
    }

    @Override
    public String toString() {
        return "Delfin{" + "cantAletas=" + cantAletas + '}' + super.toString();
    }
    
    @Override
    public void comer() {
        System.out.println("Delfin: Estoy comiendo....");
    }
    
    public void comer(String alimento, String lugar) {
        System.out.println("Delfin: Estoy comiendo "+alimento+" en "+lugar+"....");
    }
    
}
