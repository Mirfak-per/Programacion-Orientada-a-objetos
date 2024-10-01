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
    private double suedo;
    private boolean tieneEstacionamiento;

    public Profesor() {
    }

    public Profesor(Persona persona, double suedo, boolean tieneEstacionamiento) {
        setPersona(persona);
        setSuedo(suedo);
        setTieneEstacionamiento(tieneEstacionamiento);
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public double getSuedo() {
        return suedo;
    }

    public void setSuedo(double suedo) {
        this.suedo = suedo;
    }

    public boolean isTieneEstacionamiento() {
        return tieneEstacionamiento;
    }

    public void setTieneEstacionamiento(boolean tieneEstacionamiento) {
        this.tieneEstacionamiento = tieneEstacionamiento;
    }

    @Override
    public String toString() {
        return "Profesor{" + "persona=" + persona + ", suedo=" + suedo + ", tieneEstacionamiento=" + tieneEstacionamiento + '}';
    }
    
    
}
