/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.dto.Jugador;

/**
 *
 * @author PAAPCA02LC0800
 */
public class JugadorDAO {
    // LLAMAMOS A LA BD
    private Connection conn;
    
    public JugadorDAO() {
        
    }
    
    // CRUD
    public boolean agregarJugador(Jugador juga) {
        // CADA VEZ QUE VAYAN A TRABAJAR CON LA BD
        // USAR TRY-CATCH PARA CAPTURAR ERRORES
        try {
            // NOS CONECTAMOS A LA BD ACTUAL (oracle)
            this.conn = new Conexion().getConnection();
            String query = "INSERT INTO jugador VALUES (?,?,?,?,?,?,?)";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, juga.getRut());
            cs.setString(2, juga.getNombre());
            cs.setString(3, juga.getApellido());
            cs.setInt(4, juga.getEdad());
            cs.setString(5, juga.getTipo());
            cs.setString(6, juga.getGenero());
            cs.setString(7, juga.getTitular());
            // EJECUTAMOS EL METODO (commit), si es 0 = no se ejecuta ,si es 1 = se ejecuta
            if ( cs.executeUpdate() > 0 ) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        return false;
    }
    
    public boolean modificarJugador(Jugador juga) {
        // CADA VEZ QUE VAYAN A TRABAJAR CON LA BD
        // USAR TRY-CATCH PARA CAPTURAR ERRORES
        try {
            // NOS CONECTAMOS A LA BD ACTUAL (oracle)
            this.conn = new Conexion().getConnection();
            String query = "UPDATE jugador SET nombre=?, apellido=?, edad=?, tipo=?, genero=?, titular=? WHERE rut=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, juga.getNombre());
            cs.setString(2, juga.getApellido());
            cs.setInt(3, juga.getEdad());
            cs.setString(4, juga.getTipo());
            cs.setString(5, juga.getGenero());
            cs.setString(6, juga.getTitular());
            cs.setString(7, juga.getRut());
            // EJECUTAMOS EL METODO (commit), si es 0 = no se ejecuta ,si es 1 = se ejecuta
            if ( cs.executeUpdate() > 0 ) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        return false;
    }
    
    public boolean eliminarJugador(String rut) {
        // CADA VEZ QUE VAYAN A TRABAJAR CON LA BD
        // USAR TRY-CATCH PARA CAPTURAR ERRORES
        try {
            // NOS CONECTAMOS A LA BD ACTUAL (oracle)
            this.conn = new Conexion().getConnection();
            String query = "DELETE FROM jugador WHERE rut=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, rut);
            // EJECUTAMOS EL METODO (commit), si es 0 = no se ejecuta ,si es 1 = se ejecuta
            if ( cs.executeUpdate() > 0 ) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        return false;
    }
    
    public Jugador buscarJugador(String rut) {
        try {
            this.conn = new Conexion().getConnection();
            String query = "SELECT * FROM jugador WHERE rut=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, rut);
            ResultSet rs = cs.executeQuery();
            // RECORREMOS LA INFORMACION
            while(rs.next()) {
                // OBJETO TEMPORAL
                Jugador aux = new Jugador();
                aux.setRut(rs.getString("RUT"));
                aux.setNombre(rs.getString("NOMBRE"));
                aux.setApellido(rs.getString("APELLIDO"));
                aux.setEdad((int)rs.getInt("EDAD"));
                aux.setTipo(rs.getString("TIPO"));
                aux.setGenero(rs.getString("GENERO"));
                aux.setTitular(rs.getString("TITULAR"));
                return aux; // RETORNA EL JUGADOR CON TODA LA INFORMACION
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        // SI NO HAY UN JUGADOR RETORNA NULL
        return null;
    }
    
        public List<Jugador> listarJugadores() {
            List<Jugador> lista = new ArrayList<>();
        try {
            this.conn = new Conexion().getConnection();
            String query = "SELECT * FROM jugador";
            CallableStatement cs = conn.prepareCall(query);
            
            ResultSet rs = cs.executeQuery();
            // RECORREMOS LA INFORMACION
            while(rs.next()) {
                // OBJETO TEMPORAL
                Jugador aux = new Jugador();
                aux.setRut(rs.getString("RUT"));
                aux.setNombre(rs.getString("NOMBRE"));
                aux.setApellido(rs.getString("APELLIDO"));
                aux.setEdad((int)rs.getInt("EDAD"));
                aux.setTipo(rs.getString("TIPO"));
                aux.setGenero(rs.getString("GENERO"));
                aux.setTitular(rs.getString("TITULAR"));
                lista.add(aux);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        // SI NO HAY UN JUGADOR RETORNA NULL
        return lista;
    }
}
