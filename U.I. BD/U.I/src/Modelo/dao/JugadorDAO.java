/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.dao;

import Conexion.Conexion;
import Modelo.dto.Jugador;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author PAAPCA02LC0804
 */
public class JugadorDAO {
    private Connection conn;

    public JugadorDAO() {
    }
    
    public boolean agregarJugador(Jugador j){
        //cada vez que vayan a trabajar con la bd
        //usar try-catch para capturar errores
        try {
            this.conn = new Conexion().getcConnection();
            String query = "INSERT INTO JUGADOR values(?,?,?,?,?,?,?)";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, j.getRut());
            cs.setString(2, j.getNombre());
            cs.setString(3, j.getApellido());
            cs.setInt(4, j.getEdad());
            cs.setString(5, j.getTipo());
            cs.setString(6, j.getGenero());
            cs.setString(7, j.getTitular());
            
            //ejecutamos el metodo(commit)
            //si es 0 = no se ejecuta
            //si es 1 = se ejecuta
            if (cs.executeUpdate() > 0){
            return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
        }
        return false;
    }
    
        public boolean modificarJugador(Jugador j){
        //cada vez que vayan a trabajar con la bd
        //usar try-catch para capturar errores
        try {
            this.conn = new Conexion().getcConnection();
            String query = "UPDATE JUGADOR SET nombre=?, apellido=?,edad=?,tipo=?,genero=?,titular=? WHERE rut=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, j.getNombre());
            cs.setString(2, j.getApellido());
            cs.setInt(3, j.getEdad());
            cs.setString(4, j.getTipo());
            cs.setString(5, j.getGenero());
            cs.setString(6, j.getTitular());
            cs.setString(7, j.getRut());
            //ejecutamos el metodo(commit)
            //si es 0 = no se ejecuta
            //si es 1 = se ejecuta
            if (cs.executeUpdate() > 0){
            return true;
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());    
        }
        return false;
    }
        
            public boolean eliminarJugador(String rut){
        //cada vez que vayan a trabajar con la bd
        //usar try-catch para capturar errores
        try {
            this.conn = new Conexion().getcConnection();
            String query = "DELETE FROM JUGADOR WHERE rut=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, rut);
            //ejecutamos el metodo(commit)
            //si es 0 = no se ejecuta
            //si es 1 = se ejecuta
            if (cs.executeUpdate() > 0){
            return true;
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());    
        }
        return false;
    }
            
    
    public Jugador buscarJugador(String rut){
          //cada vez que vayan a trabajar con la bd
        //usar try-catch para capturar errores
    try {
        this.conn = new Conexion().getcConnection();
        String query = "SELECT * FROM JUGADOR WHERE rut=?";
        CallableStatement cs = conn.prepareCall(query);
        cs.setString(1, rut);
        //ejecutamos el metodo(commit)
        //si es 0 = no se ejecuta
        //si es 1 = se ejecuta
        ResultSet rs = cs.executeQuery();
        //recorremos la infomracions
        while(rs.next()){
            //objeto temporal
            Jugador aux = new Jugador();
            aux.setRut(rs.getString("RUT"));
            aux.setNombre(rs.getString("NOMBRE"));
            aux.setApellido(rs.getString("APELLIDO"));
            aux.setEdad((int)rs.getInt("EDAD"));
            aux.setTipo(rs.getString("TIPO"));
            aux.setGenero(rs.getString("GENERO"));
            aux.setTitular(rs.getString("TITULAR"));
            return aux;
        }
    } catch (Exception e) {
    JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());    
    }
    //si no hay un jugador retrona null 
    return null;
    }
}
