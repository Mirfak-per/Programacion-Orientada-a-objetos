/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.awt.BorderLayout;
import java.util.ArrayList;
import modelo.dto.Animal;
/**
 *
 * @author PAAPCA02LC0804
 */
public class AnimalDAO {
    ArrayList<Animal>listaAnimales;

    public AnimalDAO() {
        listaAnimales = new ArrayList<>();
    }
    
    //crud
    public boolean revisarLista(String nombre){
        for (Animal aux : listaAnimales) {
            if(aux.getNombre().equalsIgnoreCase(nombre))
                return true;
        }
        return false;
    }
    public void add(Animal a){
        if (!revisarLista(a.getNombre())){
            listaAnimales.add(a);
        }else{
        System.out.println("ERROR: no se puede agregar porque ya exsiste");
        }
    }
    
    public boolean delete(String nombre){
        if (revisarLista(nombre)) {
            for (Animal aux : listaAnimales) {
                if (!revisarLista(nombre)){
                    return listaAnimales.remove(aux);
                }
            }
            return false;
        }else{
            System.out.println("Error el animal no exsiste");
        }
        return false;
    }
    
    public void list(){
        for (Animal aux : listaAnimales) {
            System.out.println(aux.toString());
        }
    }
    
    public void listarPorEdad(){
        for (Animal aux : listaAnimales) {
            if (aux.getEdad() > 30) {
                System.out.println(aux.toString());
            }
        }
    }

    
    public void buscarAnimal(String nombre){
        if (revisarLista(nombre)) {
        for (Animal aux : listaAnimales) {
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(aux.toString());
            }
        }
        }else{
            System.out.println("No Exsiste el animal");
        }
    }
}
