/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gabos
 */
public class Compania_Aerea {
    private String idCompania,nombre,vuelosDisponibles;

    public Compania_Aerea() {
    }

    public Compania_Aerea(String idCompania, String nombre, String vuelosDisponibles) {
        setIdCompañia(idCompania);
        setNombre(nombre);
        setVuelosDisponibles(vuelosDisponibles);
    }

    public String getIdCompañia() {
        return idCompania;
    }

    public void setIdCompañia(String idCompañia) {
        this.idCompania = idCompañia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVuelosDisponibles() {
        return vuelosDisponibles;
    }

    public void setVuelosDisponibles(String vuelosDisponibles) {
        this.vuelosDisponibles = vuelosDisponibles;
    }

    @Override
    public String toString() {
        return """
               Compania_Aerea
               idCompania=""" + idCompania + "\nnombre=" + nombre + "\nvuelosDisponibles=" 
                + vuelosDisponibles + '\n';
    }
    
        public void DisponibilidadVuelos(Vuelo vuelo){
            setVuelosDisponibles(getVuelosDisponibles()+" "+vuelo.getIdVuelo());
    }
}
