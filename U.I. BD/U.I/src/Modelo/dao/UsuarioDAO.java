/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.dao;

import Conexion.Conexion;
import Modelo.dto.Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author PAAPCA02LC0804
 */
public class UsuarioDAO {
    // Llamamos a la base de datos
    private Connection conn;

    public UsuarioDAO() {
    }
    
    public boolean login(Usuario usuario){
        try {
            this.conn = new Conexion().getcConnection();
            String query = "SELECT * FROM usuario WHERE usuario=? AND contrasenia=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, usuario.getUser());
            cs.setString(2, usuario.getPass());
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
        return false;
    }
}
