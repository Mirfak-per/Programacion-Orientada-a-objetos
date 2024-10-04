/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Alumno {
    private Persona persona;
    private String jornada;

    public Alumno() {
    }

    public Alumno(Persona persona, String jornada) {
        setPersona(persona);
        setJornada(jornada);
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        if (jornada.equalsIgnoreCase("Mañana") || jornada.equalsIgnoreCase("Tarde")) {
          this.jornada = jornada;  
        } else {
            System.out.println("Error, debe ser Mañana o Tarde");
        }
    }
    @Override
    public String toString() {
        return """
               Alumno:
               persona=""" + persona + "\njornada=" + jornada + '\n';
    } 
}