/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author PAAPCA02LC0804
 */
public class Conexion {
    private static Connection conn;
    //credenciales
    private String user ="BDtest";
    private String pass ="BDtest";
    //cambia dependiendo de la base de datos que se use     esto es la url de la base de datos
    private String url  ="jdbc:oracle:thin:"+user+"/"+pass+"@localhost:1521:orcl";
    
    public Conexion(){
        try {
            //esto es para iniciar la conexion
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            //el orden en el que se conecta url user pass
            this.conn = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            //esto muestra una ventana emergente con el error
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
    }
    
    
//para obtener la coneccion
    public Connection getcConnection(){
        return conn;
    }
}
