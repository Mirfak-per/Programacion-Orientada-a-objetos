/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Reserva extends Jugador{
    
    private int minutosJugados,partidosEntrados;
    private String condicionesFisicas,motivacion;

    public Reserva() {
    }

    public Reserva(int minutosJugados, int partidosEntrados, String condicionesFisicas, String motivacion, String posicion, String equipo, String nacionalidad, int numeroCamisa, String rut, String nombre, String appellido, int edad, double sueldo) {
        super(posicion, equipo, nacionalidad, numeroCamisa, rut, nombre, appellido, edad, sueldo);
        setMinutosJugados(minutosJugados);
        setPartidosEntrados(partidosEntrados);
        setCondicionesFisicas(condicionesFisicas);
        setMotivacion(motivacion);
    }

    public int getMinutosJugados() {
        return minutosJugados;
    }

    public void setMinutosJugados(int minutosJugados) {
        this.minutosJugados = minutosJugados;
    }

    public int getPartidosEntrados() {
        return partidosEntrados;
    }

    public void setPartidosEntrados(int partidosEntrados) {
        this.partidosEntrados = partidosEntrados;
    }

    public String getCondicionesFisicas() {
        return condicionesFisicas;
    }

    public void setCondicionesFisicas(String condicionesFisicas) {
        this.condicionesFisicas = condicionesFisicas;
    }

    public String getMotivacion() {
        return motivacion;
    }

    public void setMotivacion(String motivacion) {
        this.motivacion = motivacion;
    }

    @Override
    public String toString() {
        return "Reserva{" + "minutosJugados=" + minutosJugados + ", partidosEntrados=" + partidosEntrados + ", condicionesFisicas=" + condicionesFisicas + ", motivacion=" + motivacion + '}'+super.toString();
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
