package Test;

import Modelo.DAO.*;
import Modelo.DTO.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author PAAPCA02LC0804
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here

      Reserva r = new Reserva(10, 10, "buenas", "plata",
              "delantero", "los patos", "brazil", 10, "test", "test2",
              "test3", 1, 2);
        EquipoDAO equipoDAO = new EquipoDAO();
        equipoDAO.addReserva(r);
        System.out.println(equipoDAO.revisarJugador("test"));

}

}
