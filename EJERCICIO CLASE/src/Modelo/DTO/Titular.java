/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Titular extends Jugador {
    
    private int partidosJugados,asistencias,golesMarcados;
    private String piePreferido;

    public Titular() {
    }

    public Titular(int partidosJugados, int asistencias, int golesMarcados, String piePreferido, String posicion, String equipo, String nacionalidad, int numeroCamisa, String rut, String nombre, String appellido, int edad, double sueldo) {
        super(posicion, equipo, nacionalidad, numeroCamisa, rut, nombre, appellido, edad, sueldo);
        setPartidosJugados(partidosJugados);
        setAsistencias(asistencias);
        setGolesMarcados(golesMarcados);
        setPiePreferido(piePreferido);
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public String getPiePreferido() {
        return piePreferido;
    }

    public void setPiePreferido(String piePreferido) {
        this.piePreferido = piePreferido;
    }

    @Override
    public String toString() {
        return "Titular{" + "partidosJugados=" + partidosJugados + ", asistencias=" + asistencias +
                 ", golesMarcados=" + golesMarcados + ", piePreferido=" + piePreferido + '}'+super.toString()
                ;
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
