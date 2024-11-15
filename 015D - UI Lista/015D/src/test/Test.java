/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import conexion.Conexion;
import modelo.dao.JugadorDAO;
import modelo.dao.UsuarioDAO;
import modelo.dto.Jugador;
import modelo.dto.Usuario;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        
//        Usuario usuario = new Usuario("admin","admin");
//        UsuarioDAO dao = new UsuarioDAO();
//        
//        // TEST LOGIN
//        if( dao.login(usuario) ){
//            System.out.println("Login exitoso!");
//        } else {
//            System.out.println("Credenciales incorrectas!");
//        }

        Jugador jugador = new Jugador("222-2", "AAAA", "BBBB", "Lolero", "MOBA", "Si", 16);
        JugadorDAO dao = new JugadorDAO();
        
//        if ( dao.agregarJugador(jugador) ) {
//            System.out.println("Jugador agregado!");
//        } else {
//            System.out.println("Jugador no agregado!");
//        }
        
        Jugador jugadorNuevo = new Jugador("111-1", "Juan", "Perez", "Valorantlero", "Shooter", "Si", 22);
//        
//        if ( dao.modificarJugador(jugadorNuevo) ) {
//            System.out.println("Jugador modificado!");
//        } else {
//            System.out.println("Jugador no modificado!");
//        }
        
        if ( dao.eliminarJugador("111-1") ) {
            System.out.println("Jugador eliminado!");
        } else {
            System.out.println("Jugador no eliminado!");
        }
        
        // TEST BUSCAR JUGADOR
        Jugador jugadorBuscado = dao.buscarJugador("111-1");
        System.out.println(dao.listarJugadores());
    }
    
}
