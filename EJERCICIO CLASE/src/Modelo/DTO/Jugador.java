/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0804
 */
public abstract class Jugador extends Persona{
    protected String posicion,equipo,nacionalidad;
    protected int numeroCamisa;

    public Jugador() {
    }

    public Jugador(String posicion, String equipo, String nacionalidad, int numeroCamisa, String rut, String nombre, String appellido, int edad, double sueldo) {
        super(rut, nombre, appellido, edad, sueldo);
        setPosicion(posicion);
        setEquipo(equipo);
        setNacionalidad(nacionalidad);
        setNumeroCamisa(numeroCamisa);
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    @Override
    public String toString() {
        return "Jugador{" + "posicion=" + posicion + ", equipo=" + equipo + ", nacionalidad=" + nacionalidad +
                ", numeroCamisa=" + numeroCamisa + '}'+super.toString();
    }

}
