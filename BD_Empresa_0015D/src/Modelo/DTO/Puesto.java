/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DTO;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Puesto {
    private String descripcion,area;
    private int id_puesto;

    public Puesto() {
    }

    public Puesto(String descripcion, String area, int id_puesto) {
        setDescripcion(descripcion);
        setArea(area);
        setId_puesto(id_puesto);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getId_puesto() {
        return id_puesto;
    }

    public void setId_puesto(int id_puesto) {
        this.id_puesto = id_puesto;
    }

    @Override
    public String toString() {
        return "Puesto{" + "descripcion=" + descripcion + ", area=" + area + ", id_puesto=" + id_puesto + '}';
    }

    
    
    
}
