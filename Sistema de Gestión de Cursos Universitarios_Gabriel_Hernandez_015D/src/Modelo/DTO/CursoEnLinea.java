/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0812
 */
public class CursoEnLinea extends Curso{
    private String plataforma;
    private int numeroVideos,numeroForos; 

    public CursoEnLinea() {
    }

    public CursoEnLinea(String plataforma, int numeroVideos, int numeroForos,String idCurso, String nombre, double costoBase) {
        super(idCurso, nombre, costoBase);
        setPlataforma(plataforma);
        setNumeroVideos(numeroVideos);
        setNumeroForos(numeroForos);
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        if (plataforma.trim().equalsIgnoreCase("Moodle")||plataforma.trim().equalsIgnoreCase("Zoom")||plataforma.trim().equalsIgnoreCase("Teams")){
            this.plataforma = plataforma;
        } else {
            System.out.println("La plataforma debe ser valida: Moodle,Zoom,Teams");
        }
         
    }

    public int getNumeroVideos() {
        return numeroVideos;
    }

    public void setNumeroVideos(int numeroVideos) {
        this.numeroVideos = numeroVideos;
    }

    public int getNumeroForos() {
        return numeroForos;
    }

    public void setNumeroForos(int numeroForos) {
        this.numeroForos = numeroForos;
    }

    @Override
    public String toString() {
        return "CursoEnLinea{" + "plataforma=" + plataforma + ", numeroVideos=" + numeroVideos + ", numeroForos=" + numeroForos + '}'+"\n"+super.toString();
    }

    @Override
    public void calcularCostoCurso() {
        setCostoBase(getCostoBase()-1000);
        System.out.println("El costo base se reduce en 1000 por ser en linea");    }
    
}
