/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.dto.Usuario;

/**
 *
 * @author PAAPCA02LC0800
 */
public class UsuarioDAO {
    // LLAMAMOS A LA BD
    private Connection conn;
    
    public UsuarioDAO() {
        
    }
    
    public boolean login(Usuario usuario) {
        try {
            this.conn = new Conexion().getConnection();
            String query = "SELECT * FROM usuario WHERE usuario=? AND contrasena=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, usuario.getUser());
            cs.setString(2, usuario.getPass());
            ResultSet rs = cs.executeQuery();
            while(rs.next()) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        return false;
    }
    
        public boolean registrar(Usuario usuario) {
        // CADA VEZ QUE VAYAN A TRABAJAR CON LA BD
        // USAR TRY-CATCH PARA CAPTURAR ERRORES
        try {
            // NOS CONECTAMOS A LA BD ACTUAL (oracle)
            this.conn = new Conexion().getConnection();
            String query = "INSERT INTO USUARIO VALUES (?,?)";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, usuario.getUser());
            cs.setString(2, usuario.getPass());

            // EJECUTAMOS EL METODO (commit), si es 0 = no se ejecuta ,si es 1 = se ejecuta
            if ( cs.executeUpdate() > 0 ) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        return false;
    }
}
