/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0812
 */
public class CursoHibrido extends Curso{
    private int numeroClasesPresenciales,numeroClasesOnline;
    private String tutorEncargado; 

    public CursoHibrido(int numeroClasesPresenciales, int numeroClasesOnline, String tutorEncargado, String idCurso, String nombre, double costoBase) {
        super(idCurso, nombre, costoBase);
        setNumeroClasesPresenciales(numeroClasesPresenciales);
        setNumeroClasesOnline(numeroClasesOnline);
        setTutorEncargado(tutorEncargado);
    }

    public int getNumeroClasesPresenciales() {
        return numeroClasesPresenciales;
    }

    public void setNumeroClasesPresenciales(int numeroClasesPresenciales) {
        if (numeroClasesPresenciales<= 0) {
            System.out.println("El numero de clases presenciales debe ser mayor a cero");
        } else { 
            this.numeroClasesPresenciales = numeroClasesPresenciales;
        }
       
    }

    public int getNumeroClasesOnline() {
        return numeroClasesOnline;
    }

    public void setNumeroClasesOnline(int numeroClasesOnline) {
        this.numeroClasesOnline = numeroClasesOnline;
    }

    public String getTutorEncargado() {
        return tutorEncargado;
    }

    public void setTutorEncargado(String tutorEncargado) {
        this.tutorEncargado = tutorEncargado;
    }

    @Override
    public String toString() {
        return "CursoHibrido{" + "numeroClasesPresenciales=" + numeroClasesPresenciales + ", numeroClasesOnline=" + numeroClasesOnline + ", tutorEncargado=" + tutorEncargado + '}'+"\n"+super.toString();
    }

    @Override
    public void calcularCostoCurso() {
        setCostoBase(getCostoBase()+300);
        System.out.println("El costo base aumenta en 300 por ser hibrido");    }
    
    
}
