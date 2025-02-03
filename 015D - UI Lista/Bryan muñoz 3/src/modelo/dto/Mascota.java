/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dto;

import java.util.Date;

/**
 *
 * @author Gabos
 */
public class Mascota {
    private int chip,edad;
    private Date fechaNacimiento;
    private String nombreMascota,rutDueno;

    public Mascota() {
    }

    public Mascota(int chip, String rutDueno, int edad, Date fechaNacimiento, String nombreMascota) {
        setChip(chip);
        setRutDueno(rutDueno);
        setEdad(edad);
        setFechaNacimiento(fechaNacimiento);
        setNombreMascota(nombreMascota);
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getRutDueno() {
        return rutDueno;
    }

    public void setRutDueno(String rutDueno) {
        this.rutDueno = rutDueno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    @Override
    public String toString() {
        return "Mascota{" + "chip=" + chip + ", rutDueno=" + rutDueno + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", nombreMascota=" + nombreMascota + '}';
    }
    
    
}
