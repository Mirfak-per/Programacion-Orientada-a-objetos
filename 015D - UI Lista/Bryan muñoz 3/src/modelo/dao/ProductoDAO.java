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
import modelo.dto.Producto;

/**
 *
 * @author PAAPCA02LC0800
 */
public class ProductoDAO {
    // LLAMAMOS A LA BD
    private Connection conn;
    
    public ProductoDAO() {
        
    }
    
    // CRUD
    public boolean agregarProducto(Producto p) {
        // CADA VEZ QUE VAYAN A TRABAJAR CON LA BD
        // USAR TRY-CATCH PARA CAPTURAR ERRORES
        try {
            // NOS CONECTAMOS A LA BD ACTUAL (oracle)
            this.conn = new Conexion().getConnection();
            String query = "INSERT INTO producto VALUES (?,?,?,?,?)";
            CallableStatement cs = conn.prepareCall(query);
            cs.setInt(1, p.getCodigo());
            cs.setString(2, p.getNombre());
            cs.setString(3, p.getTipoProducto());
            cs.setInt(4, p.getStock());
            cs.setInt(5, p.getFechaIngreso());
            // EJECUTAMOS EL METODO (commit), si es 0 = no se ejecuta ,si es 1 = se ejecuta
            if ( cs.executeUpdate() > 0 ) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        return false;
    }
    
    public boolean modificarProducto(Producto p) {
        // CADA VEZ QUE VAYAN A TRABAJAR CON LA BD
        // USAR TRY-CATCH PARA CAPTURAR ERRORES
        try {
            // NOS CONECTAMOS A LA BD ACTUAL (oracle)
            this.conn = new Conexion().getConnection();
            String query = "UPDATE producto SET nombre=?, tipoProducto=?, stock=?, fechaIngreso=? WHERE codigo=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, p.getNombre());
            cs.setString(2, p.getTipoProducto());
            cs.setInt(3, p.getStock());
            cs.setInt(4, p.getFechaIngreso());
            cs.setInt(5, p.getCodigo());
            // EJECUTAMOS EL METODO (commit), si es 0 = no se ejecuta ,si es 1 = se ejecuta
            if ( cs.executeUpdate() > 0 ) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        return false;
    }
    
    public boolean eliminarProducto(String codigo) {
        // CADA VEZ QUE VAYAN A TRABAJAR CON LA BD
        // USAR TRY-CATCH PARA CAPTURAR ERRORES
        try {
            // NOS CONECTAMOS A LA BD ACTUAL (oracle)
            this.conn = new Conexion().getConnection();
            String query = "DELETE FROM producto WHERE codigo=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setString(1, codigo);
            // EJECUTAMOS EL METODO (commit), si es 0 = no se ejecuta ,si es 1 = se ejecuta
            if ( cs.executeUpdate() > 0 ) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        return false;
    }
    
    public Producto buscarProducto(int codigo) {
        try {
            this.conn = new Conexion().getConnection();
            String query = "SELECT * FROM producto WHERE codigo=?";
            CallableStatement cs = conn.prepareCall(query);
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            // RECORREMOS LA INFORMACION
            while(rs.next()) {
                // OBJETO TEMPORAL
                Producto aux = new Producto();
                aux.setCodigo((int)rs.getInt("Codigo"));
                aux.setNombre(rs.getString("Nombre"));
                aux.setTipoProducto(rs.getString("Tipo producto"));
                aux.setStock((int)rs.getInt("Stock"));
                aux.setFechaIngreso((int)rs.getInt("Fecha ingreso"));
                return aux; // RETORNA EL JUGADOR CON TODA LA INFORMACION
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        // SI NO HAY UN JUGADOR RETORNA NULL
        return null;
    }
    
        public List<Producto> listarProductos() {
            List<Producto> lista = new ArrayList<>();
        try {
            this.conn = new Conexion().getConnection();
            String query = "SELECT * FROM producto";
            CallableStatement cs = conn.prepareCall(query);
            
            ResultSet rs = cs.executeQuery();
            // RECORREMOS LA INFORMACION
            while(rs.next()) {
                // OBJETO TEMPORAL
                Producto aux = new Producto();
                aux.setCodigo((int)rs.getInt("Codigo"));
                aux.setNombre(rs.getString("Nombre"));
                aux.setTipoProducto(rs.getString("Tipo producto"));
                aux.setStock((int)rs.getInt("Stock"));
                aux.setFechaIngreso((int)rs.getInt("Fecha ingreso"));
                lista.add(aux);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e.getMessage());
        }
        // SI NO HAY UN JUGADOR RETORNA NULL
        return lista;
    }
}
