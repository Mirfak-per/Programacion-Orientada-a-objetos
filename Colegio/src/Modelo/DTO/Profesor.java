/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Profesor {
    private Persona persona;
    private double sueldo;
    private boolean tieneEstacionamiento;

    public Profesor() {
    }

    public Profesor(Persona persona, double sueldo, boolean tieneEstacionamiento) {
        setPersona(persona);
        setSueldo(sueldo);
        setTieneEstacionamiento(tieneEstacionamiento);
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo >= 100000) {
          this.sueldo = sueldo;  
        } else {
            System.out.println("Error, el sueldo debe ser mínimo 100000");
        }   
    }

    public boolean isTieneEstacionamiento() {
        return tieneEstacionamiento;
    }

    public void setTieneEstacionamiento(boolean tieneEstacionamiento) {
        this.tieneEstacionamiento = tieneEstacionamiento;
    }

    @Override
    public String toString() {
        return """
               Profesor:
               persona=""" + persona + "\nsuedo=" + sueldo +
                "\ntieneEstacionamiento=" + tieneEstacionamiento + '\n';
    } 
}