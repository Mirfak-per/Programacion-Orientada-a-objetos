/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Test;

import Conexion.Conexion;
import Modelo.dao.*;
import Modelo.dto.*;

/**
 *
 * @author PAAPCA02LC0805
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion c = new Conexion();
        //Conexion conexion = new Conexion();
        
        Usuario usuario = new Usuario("admin","admin");
        UsuarioDAO udao = new UsuarioDAO();
        
        //test login
//        if ( udao.login(usuario)) {
//            System.out.println("Login existoso!");
//        } else{
//            System.out.println("Credenciales incorrectas");
//        }


//
Jugador j = new Jugador("AAAA", "111-1", "BBBB","Lolero", "moba", "SI", 16);
Jugador j2 = new Jugador("CCCC", "111-1", "DDDD","Valorantlero", "shooter", "SI", 20);
JugadorDAO dao = new JugadorDAO();

        if (dao.agregarJugador(j)) {
            System.out.println("Jugador agregado");
        } else {
            System.out.println("Jugador no agregado");
        }
        
//        if (dao.modificarJugador(j2)) {
//            System.out.println("Jugador modificado");
//        } else {
//            System.out.println("Jugador no modificado");
//        }
        
//        if (dao.eliminarJugador("111-1")) {
//            System.out.println("Jugador eliminado");
//        } else {
//            System.out.println("Jugador no eliminado");
//        }
//
//        Jugador jugadorBuscado = dao.buscarJugador("111-1");
//        System.out.println(jugadorBuscado.toString());
//    }
    
}
}
