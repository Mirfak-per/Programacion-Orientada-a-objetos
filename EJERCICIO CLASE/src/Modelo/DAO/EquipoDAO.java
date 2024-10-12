/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.DAO;

import Modelo.DTO.Reserva;
import Modelo.DTO.Titular;
import java.util.ArrayList;

/**
 *
 * @author PAAPCA02LC0804
 */
public class EquipoDAO {
    ArrayList<Titular>listaTitulares;
    ArrayList<Reserva> listaReserva;

    public EquipoDAO() {
        listaReserva = new ArrayList<>();
        listaTitulares = new ArrayList<>();
    }

    public EquipoDAO(ArrayList<Titular> listaTitulares, ArrayList<Reserva> listaReserva) {
        this.listaTitulares = listaTitulares;
        this.listaReserva = listaReserva;
    }

    public ArrayList<Titular> getListaTitulares() {
        return listaTitulares;
    }

    public void setListaTitulares(ArrayList<Titular> listaTitulares) {
        this.listaTitulares = listaTitulares;
    }

    public ArrayList<Reserva> getListaReserva() {
        return listaReserva;
    }

    public void setListaReserva(ArrayList<Reserva> listaReserva) {
        this.listaReserva = listaReserva;
    }

    @Override
    public String toString() {
        return "EquipoDAO{" + "listaTitulares=" + listaTitulares + ", listaReserva=" + listaReserva + '}';
    }
    
    
    
    public boolean addTitular(Titular titular){
        return listaTitulares.add(titular);
    }
    
    public boolean addReserva(Reserva r){
        return listaReserva.add(r);
    }
    
    public void listarTitular(Titular t){
        for (Titular aux : listaTitulares) {
            System.out.println("----------------");
            aux.mostrarInformacion();
            System.out.println("----------------");
        }
    }
    
    public void listarReserva(Reserva r){
        for (Reserva aux : listaReserva) {
            System.out.println("----------------");
            aux.mostrarInformacion();
            System.out.println("----------------");
        }
    }
    
    public boolean revisarJugador(String rut){
        boolean aux2 = false;
        for (Reserva aux : listaReserva) {
            if (aux.getRut().equalsIgnoreCase(rut)) {
                aux2 = true;
                return true;
            }
        }
        if(!aux2){
        for (Titular aux : listaTitulares) {
            if (aux.getRut().equalsIgnoreCase(rut)) {
                return true;
            }
        }   return false;
        }
        return false;
    }
    
    

}

