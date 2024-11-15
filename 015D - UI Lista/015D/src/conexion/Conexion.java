/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Conexion {
    private static Connection conn;
    private String user = "algo";
    private String pass = "algo";
    private String url = "jdbc:oracle:thin:"+user+"/"+pass+"@localhost:1521:orcl";
    
    public Conexion() {
        try {
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.conn = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }
    
    // PARA OBTENER LA CONECCION
    public Connection getConnection() {
        return conn;
    }
    
    
}
