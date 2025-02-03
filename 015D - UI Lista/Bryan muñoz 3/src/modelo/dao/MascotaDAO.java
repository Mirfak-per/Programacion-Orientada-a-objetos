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
import modelo.dto.Mascota;

/**
 *
 * @author PAAPCA02LC0800
 */
public class MascotaDAO {
    // LLAMAMOS A LA BD
    private Connection conn;
    
    public MascotaDAO() {
        
    }
    
    // CRUD
    public boolean agregarMascota(Mascota m) {
    try {
        // Conectarse a la base de datos
        this.conn = new Conexion().getConnection();
        String query = "INSERT INTO mascota VALUES (?,?,?,?)";
        CallableStatement cs = conn.prepareCall(query);
        cs.setInt(1, m.getChip());
        cs.setString(2, m.getNombreMascota());
        cs.setInt(3, m.getEdad());
        cs.setDate(4, new java.sql.Date(m.getFechaNacimiento().getTime()));
        cs.setString(5, m.getRutDueno());
        
        // Ejecutar la consulta
        if (cs.executeUpdate() > 0) {
            return true;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    return false;
}

    
   public boolean modificarMascota(Mascota m) {
    try {
        // Conectarse a la base de datos
        this.conn = new Conexion().getConnection();
        String query = "UPDATE mascota SET nombreMascota=?, edad=?, fechaNacimiento=?, rutDueno=? WHERE chip=?";
        CallableStatement cs = conn.prepareCall(query);
        cs.setString(1, m.getNombreMascota());
        cs.setInt(2, m.getEdad());
        cs.setDate(3, new java.sql.Date(m.getFechaNacimiento().getTime()));
        cs.setString(4, m.getRutDueno());
        cs.setInt(5, m.getChip());
        
        // Ejecutar la consulta
        if (cs.executeUpdate() > 0) {
            return true;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    return false;
}

    
public boolean eliminarMascota(int chip) {
    try {
        // Conectarse a la base de datos
        this.conn = new Conexion().getConnection();
        String query = "DELETE FROM mascota WHERE chip=?";
        CallableStatement cs = conn.prepareCall(query);
        cs.setInt(1, chip);
        
        // Ejecutar la consulta
        if (cs.executeUpdate() > 0) {
            return true;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    return false;
}
    

    public Mascota buscarMascota(int chip) {
    try {
        // Conectarse a la base de datos
        this.conn = new Conexion().getConnection();
        String query = "SELECT * FROM mascota WHERE chip=?";
        CallableStatement cs = conn.prepareCall(query);
        cs.setInt(1, chip);
        ResultSet rs = cs.executeQuery();
        
        // Recorrer los resultados
        while (rs.next()) {
            Mascota aux = new Mascota();
            aux.setChip(rs.getInt("chip"));
            aux.setNombreMascota(rs.getString("nombreMascota"));
            aux.setEdad(rs.getInt("edad"));
            aux.setFechaNacimiento(rs.getDate("fechaNacimiento"));
            aux.setRutDueno(rs.getString("rutDueno"));
            return aux;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    return null;
}
    
  public List<Mascota> listarMascota() {
    List<Mascota> lista = new ArrayList<>();
    try {
        this.conn = new Conexion().getConnection();
        String query = "SELECT * FROM mascota";  // Asegúrate de que la tabla sea 'mascota' en lugar de 'producto'
        CallableStatement cs = conn.prepareCall(query);

        ResultSet rs = cs.executeQuery();
        // RECORREMOS LA INFORMACION
        while(rs.next()) {
            // CREAMOS EL OBJETO MASCOTA Y LO AGREGAMOS A LA LISTA
            lista.add(new Mascota(
                rs.getInt("chip"),
                rs.getString("rutDueno"),
                rs.getInt("edad"),
                rs.getDate("fechaNacimiento"),
                rs.getString("nombreMascota")
            ));
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
    }
    // RETORNAMOS LA LISTA DE MASCOTAS
    return lista;
}
}
