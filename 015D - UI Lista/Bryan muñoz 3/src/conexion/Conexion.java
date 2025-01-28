/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    private static Connection conn;
    // Cambia estos valores según tu configuración de XAMPP (por defecto en XAMPP es "root" y sin contraseña)
    private String user = "root";  // usuario por defecto de MySQL en XAMPP
    private String pass = "";      // normalmente no tiene contraseña
    private String url = "jdbc:mysql://localhost:3306/tienda"; // URL de conexión MySQL

    public Conexion() {
        try {
            // Cargamos el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
    }

    // PARA OBTENER LA CONECCION
    public Connection getConnection() {
        return conn;
    }
}

