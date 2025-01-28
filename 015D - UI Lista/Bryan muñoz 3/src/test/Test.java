/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import conexion.Conexion;
import modelo.dao.ProductoDAO;
import modelo.dao.UsuarioDAO;
import modelo.dto.Producto;
import modelo.dto.Usuario;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
     // Inicializamos la conexión
        Conexion conexion = new Conexion();
        if (conexion.getConnection() != null) {
            System.out.println("Conexión establecida con la base de datos.");
        } else {
            System.out.println("Error al conectar con la base de datos.");
            return; // Salimos si no hay conexión
        }

        // Prueba ProductoDAO
        testProductoDAO();
    }

    private static void testProductoDAO() {
        System.out.println("\n--- TEST ProductoDAO ---");
        ProductoDAO productoDAO = new ProductoDAO();

        // Prueba de agregar producto
        Producto producto = new Producto("Electrónica",123, "Laptop", 50 , 20230101);
        if (productoDAO.agregarProducto(producto)) {
            System.out.println("Producto agregado: " + producto);
        } else {
            System.out.println("Error al agregar el producto: " + producto);
        }

        // Prueba de modificar producto
        Producto productoModificado = new Producto("Electrónica",123, "Laptop Pro", 30, 20230101);
        if (productoDAO.modificarProducto(productoModificado)) {
            System.out.println("Producto modificado: " + productoModificado);
        } else {
            System.out.println("Error al modificar el producto: " + productoModificado);
        }

        // Prueba de eliminar producto
        if (productoDAO.eliminarProducto("123")) {
            System.out.println("Producto eliminado con código: 123");
        } else {
            System.out.println("Error al eliminar el producto con código: 123");
        }

        // Prueba de buscar producto
        Producto productoBuscado = productoDAO.buscarProducto(123);
        if (productoBuscado != null) {
            System.out.println("Producto encontrado: " + productoBuscado);
        } else {
            System.out.println("No se encontró ningún producto con código: 123");
        }

        // Prueba de listar productos
        System.out.println("Listado de productos:");
        for (Producto p : productoDAO.listarProductos()) {
            System.out.println(p);
        }
    }
}
