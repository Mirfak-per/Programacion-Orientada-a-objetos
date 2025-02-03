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
import modelo.dto.Dueno;
/**
 *
 * @author Gabos
 */
public class DuenoDAO {
    private Connection conn;
    
        public DuenoDAO() {
        
    }
    
    
    public boolean agregarDueno(Dueno d) {
    try {
        // Conectarse a la base de datos
        this.conn = new Conexion().getConnection();
        String query = "INSERT INTO dueño (rut, nombre, apellido, edad, telefono) VALUES (?,?,?,?,?)";
        CallableStatement cs = conn.prepareCall(query);
        cs.setString(1, d.getRut());
        cs.setString(2, d.getNombre());
        cs.setString(3, d.getApellido());
        cs.setInt(4, d.getEdad());
        cs.setInt(5, d.getTelefono());
        
        // Ejecutar la consulta
        if (cs.executeUpdate() > 0) {
            return true;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    return false;
}

public boolean modificarDueno(Dueno d) {
    try {
        // Conectarse a la base de datos
        this.conn = new Conexion().getConnection();
        String query = "UPDATE dueño SET nombre=?, apellido=?, edad=?, telefono=? WHERE rut=?";
        CallableStatement cs = conn.prepareCall(query);
        cs.setString(1, d.getNombre());
        cs.setString(2, d.getApellido());
        cs.setInt(3, d.getEdad());
        cs.setInt(4, d.getTelefono());
        cs.setString(5, d.getRut());
        
        // Ejecutar la consulta
        if (cs.executeUpdate() > 0) {
            return true;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    return false;
}

public boolean eliminarDueno(String rut) {
    try {
        // Conectarse a la base de datos
        this.conn = new Conexion().getConnection();
        String query = "DELETE FROM dueño WHERE rut=?";
        CallableStatement cs = conn.prepareCall(query);
        cs.setString(1, rut);
        
        // Ejecutar la consulta
        if (cs.executeUpdate() > 0) {
            return true;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    return false;
}

public Dueno buscarDueno(String rut) {
    try {
        // Conectarse a la base de datos
        this.conn = new Conexion().getConnection();
        String query = "SELECT * FROM dueño WHERE rut=?";
        CallableStatement cs = conn.prepareCall(query);
        cs.setString(1, rut);
        ResultSet rs = cs.executeQuery();
        
        // Recorrer los resultados
        while (rs.next()) {
            Dueno aux = new Dueno(
                rs.getString("rut"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getInt("edad"),
                rs.getInt("telefono")
            );
            return aux;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    return null;
}

public List<Dueno> listarDuenos() {
    List<Dueno> lista = new ArrayList<>();
    try {
        this.conn = new Conexion().getConnection();
        String query = "SELECT * FROM dueño";  // Asegúrate de que la tabla sea 'dueño'
        CallableStatement cs = conn.prepareCall(query);

        ResultSet rs = cs.executeQuery();
        // RECORREMOS LA INFORMACION
        while (rs.next()) {
            // CREAMOS EL OBJETO DUEÑO Y LO AGREGAMOS A LA LISTA
            lista.add(new Dueno(
                rs.getString("rut"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getInt("edad"),
                rs.getInt("telefono")
            ));
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    // RETORNAMOS LA LISTA DE DUEÑOS
    return lista;
}
}
