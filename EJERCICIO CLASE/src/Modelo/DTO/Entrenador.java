/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;


/**
 *
 * @author PAAPCA02LC0804
 */
public class Entrenador extends Persona{
    private String estrategia,certificacion,estiloJuego;
    private int añosExperiencia;

    public Entrenador() {
    }

    public Entrenador(String estrategia, String certificacion, String estiloJuego, int añosExperiencia, String rut, String nombre, String appellido, int edad, double sueldo) {
        super(rut, nombre, appellido, edad, sueldo);
        setEstrategia(estrategia);
        setCertificacion(certificacion);
        setEstiloJuego(estiloJuego);
        setAñosExperiencia(añosExperiencia);
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }

    public String getEstiloJuego() {
        return estiloJuego;
    }

    public void setEstiloJuego(String estiloJuego) {
        this.estiloJuego = estiloJuego;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "Entrenador{" + "estrategia=" + estrategia + ", certificacion=" + certificacion + ", estiloJuego=" + estiloJuego +
                ", a\u00f1osExperiencia=" + añosExperiencia + '}'+ super.toString();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }

    @Override
    public void mostrarSueldo() {
        System.out.println("El sueldo de "+getNombre()+" es de: "+getSueldo());
    }
    
    @Override
    public void modificarSueldo(double sueldo) {
        setSueldo(sueldo);
        System.out.println("El sueldo ha sido modificado con exito");
    }
    
}
