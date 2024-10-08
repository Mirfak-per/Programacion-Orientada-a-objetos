/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dto;

import Interfaces.Metodoscrudfake;

/**
 *
 * @author PAAPCA02LC0800
 */
public abstract class Animal implements Metodoscrudfake{
    // EN LA CLASE PADRE SE DECLARAN PROTECTED
    // PARA SOLO LOS HIJOS LO VEAN
    protected String nombre;
    protected int edad, peso,altura;
    protected char sexo;
    protected boolean isVivo;

    public Animal() {
        // DATOS DEFAULT
        this.nombre = "Osito";
        this.edad = 10;
        this.peso = 10;
        this.altura = 10;
        this.sexo = 'F';
        this.isVivo = true;
    }

    public Animal(String nombre, int edad, int peso, int altura, char sexo, boolean isVivo) {
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
        setAltura(altura);
        setSexo(sexo);
        setIsVivo(isVivo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isIsVivo() {
        return isVivo;
    }

    public void setIsVivo(boolean isVivo) {
        this.isVivo = isVivo;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + ", isVivo=" + isVivo + '}';
    }
    
    public void comer() {
        System.out.println("Animal: Estoy comiendo....");
    }
    
    public void comer(String alimento) {
        System.out.println("Animal: Estoy comiendo "+alimento+"....");
    }

    
}
