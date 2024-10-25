/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0812
 */
public class CursoPresencial extends Curso{
    private int numeroAulas,numeroEstudiantes;
    private String nombreProfesor;

    public CursoPresencial(int numeroAulas, int numeroEstudiantes, String nombreProfesor, String idCurso, String nombre, double costoBase) {
        super(idCurso, nombre, costoBase);
        setNumeroAulas(numeroAulas);
        setNumeroEstudiantes(numeroEstudiantes);
        setNombreProfesor(nombreProfesor);
    }

    public int getNumeroAulas() {
        return numeroAulas;
    }

    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }

    public int getNumeroEstudiantes() {
        return numeroEstudiantes;
    }

    public void setNumeroEstudiantes(int numeroEstudiantes) {
        if (numeroEstudiantes<= 0) {
            System.out.println("El numero de estudiantes debe ser mayor a cero");
        }else{
            this.numeroEstudiantes = numeroEstudiantes;
        }
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    @Override
    public String toString() {
        return "CursoPresencial{" + "numeroAulas=" + numeroAulas +
                ", numeroEstudiantes=" + numeroEstudiantes + ", nombreProfesor=" + nombreProfesor + '}'+"\n"+super.toString();
    }

    @Override
    public void calcularCostoCurso() {
        setCostoBase(getCostoBase()+1300);
        System.out.println("El costo base aumenta en 1300 por ser presencial");
                
    }
    
    
}
