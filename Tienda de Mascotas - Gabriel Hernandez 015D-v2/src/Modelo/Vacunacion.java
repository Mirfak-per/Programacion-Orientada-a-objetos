/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0806
 */
public class Vacunacion {
    private double dosis,IMC;

    public Vacunacion() {
    }

    public Vacunacion(double IMC, double dosis) {
        setIMC(IMC);
        setDosis(dosis);
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
}

    public double getDosis() {
        return dosis;
    }

    public void setDosis(double dosis) {
        this.dosis = dosis;
    }

    @Override
    public String toString() {
        return """
               Vacunacion:
               IMC=""" + IMC + "\ndosis=" + dosis +  '\n';
    }

//metodos
    /*
    U deberá mostrar la dosis que se le aplicará a la mascota según el índice de masa corporal que tenga
    (IMC = peso / altura^2)
c.	Si el IMC de la mascota es menor a 20, se aplicará una dosis de 0.1 ml	
d.	Si el IMC de la mascota está entre 20 y 35, se aplicará una dosis de 0.3 ml
e.	Si el IMC de la mascota es mayor a 35, se aplicará una dosis de 0.5 ml

    */
    
    public void registarIMC(Mascotas mascotas){
        // no pude elvar el 2, ** no funciono
        double aux2= mascotas.getAltura()*mascotas.getAltura();
        double aux = mascotas.getPeso()/(aux2)*1000;
        setIMC(aux);
    } 
    
    public void registrarDosis(){
    if(IMC < 20){
        System.out.println("El imc es menor a 20, la dosis es de 0.1 ml");
        setDosis(0.1);
    }else if(IMC>=20||IMC<=35){
        System.out.println("el imc esta entre 20 y 35, la dosis es de 0.3 ml");
        setDosis(0.3);
    }else if (IMC>35){
        System.out.println("el imc es mayor a 35, se aplicara una dosis de 0.5 ml");
        setDosis(0.5);
    }
    }
    
    
        public void datosVacunacion(Mascotas mascotas){
        System.out.println("******************");
        System.out.println("*DATOS DE MASCOTA*");
        System.out.println("******************");
        System.out.println("Nombre: "+mascotas.getNombre());
        System.out.println("Edad: "+mascotas.getEdad());
        System.out.println("Especie: "+mascotas.getEspecie());
        System.out.println("Peso: "+mascotas.getPeso());
        System.out.println("Altura: "+mascotas.getAltura());
        System.out.println("*******************");
        System.out.println("*DATOS DE VACUNA*");
        System.out.println("*******************");
        System.out.println("IMC: "+getIMC());
        System.out.println("Dosis: "+getDosis());

            }      
}
