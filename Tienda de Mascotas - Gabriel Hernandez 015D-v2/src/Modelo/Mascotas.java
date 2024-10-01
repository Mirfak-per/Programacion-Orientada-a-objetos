/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0806
 */
public class Mascotas {
    private String nombre,especie;
    private int edad,peso,altura;
    
    public Mascotas() {
    }

    public Mascotas(String nombre, int edad, String especie, int peso, int altura) {
        setNombre(nombre);
        setEdad(edad);
        setEspecie(especie);
        setPeso(peso);
        setAltura(altura);
    }

    public String getNombre() {
        return nombre;
    }

    //•	El nombre no puede estar vacío.
    public void setNombre(String nombre) {
        if(nombre.trim().length() == 0 || nombre.trim() == null || nombre.trim().equalsIgnoreCase("")){
            System.out.println("ERROR! El nombre no puede estar vacio");
        }else{
            this.nombre = nombre;
        }
  
    }

    public String getEspecie() {
        return especie;
    }

//•	La especie puede ser (canino, felino, insecto, roedor)
    public void setEspecie(String especie) {
        if(especie.trim().equalsIgnoreCase("canino")
                ||especie.trim().equalsIgnoreCase("felino")
                ||especie.trim().equalsIgnoreCase("insecto")
                ||especie.trim().equalsIgnoreCase("roedor")){
        this.especie = especie;
        }else{
            System.out.println("ERROR! Las especies aceptadas son: canino, felino, insecto, roedor");
        }
         
    }

    public int getEdad() {
        return edad;
    }
    
 //•	La edad debe ser un número mayor a cero.
    public void setEdad(int edad) {
        if (edad > 0){
        this.edad = edad;
        }else{
            System.out.println("ERROR! La edad debe ser mayor a cero");
        }
        
    }

    public int getPeso() {
        return peso;
    }

    //•	El peso debe ser mayor a cero.
    public void setPeso(int peso) {
        if (peso > 0){
        this.peso = peso;
        }else{
            System.out.println("ERROR! El peso debe ser mayor a cero");
        }
    }

    public int getAltura() {
        return altura;
    }

    //•	La altura debe ser mayor a cero.
    public void setAltura(int altura) {
        if (altura > 0){
        this.altura = altura;
        }else{
            System.out.println("ERROR! La altura debe ser mayor a cero");
        }
    }

    @Override
    public String toString() {
        return """
               Mascotas:
               nombre=""" + nombre + "\nedad=" + edad + "\nespecie=" + especie + "\npeso=" +
                peso + "\naltura=" + altura + '\n';
    }
    
    //Metodos
}
