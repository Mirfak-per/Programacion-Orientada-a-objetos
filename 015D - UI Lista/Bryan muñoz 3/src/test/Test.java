/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import conexion.Conexion;
import java.util.List;
import modelo.dao.*;
import modelo.dto.*;

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

    // Prueba MascotaDAO y DuenoDAO
    testVeterinariaDAO();
}

private static void testVeterinariaDAO() {
    // Creamos instancias de los DAOs
    MascotaDAO mdao = new MascotaDAO();
    DuenoDAO ddao = new DuenoDAO();

    // 1. Prueba para agregar un dueño
    testAgregarDueno(ddao);

    // 2. Prueba para agregar una mascota
    testAgregarMascota(mdao);

    // 3. Prueba para modificar un dueño
    testModificarDueno(ddao);

    // 4. Prueba para modificar una mascota
    testModificarMascota(mdao);

    // 5. Prueba para eliminar un dueño
    testEliminarDueno(ddao);

    // 6. Prueba para eliminar una mascota
    testEliminarMascota(mdao);

    // 7. Prueba para buscar un dueño
    testBuscarDueno(ddao);

    // 8. Prueba para buscar una mascota
    testBuscarMascota(mdao);

    // 9. Prueba para listar todos los dueños
    testListarDuenos(ddao);

    // 10. Prueba para listar todas las mascotas
    testListarMascotas(mdao);
}

private static void testAgregarDueno(DuenoDAO ddao) {
    // Crear un dueño para prueba
    Dueno dueno = new Dueno("12345678-9", "Juan", "Perez", 30, 987654321);
    boolean resultado = ddao.agregarDueno(dueno);
    System.out.println("Prueba agregar dueño: " + (resultado ? "Éxito" : "Error"));
}

private static void testAgregarMascota(MascotaDAO mdao) {
    // Crear una mascota para prueba
    Mascota mascota = new Mascota(12345, "12345678-9", 5, new java.util.Date(), "Rex");
    boolean resultado = mdao.agregarMascota(mascota);
    System.out.println("Prueba agregar mascota: " + (resultado ? "Éxito" : "Error"));
}

private static void testModificarDueno(DuenoDAO ddao) {
    // Modificar un dueño existente
    Dueno duenoModificado = new Dueno("12345678-9", "Carlos", "Gomez", 35, 987654322);
    boolean resultado = ddao.modificarDueno(duenoModificado);
    System.out.println("Prueba modificar dueño: " + (resultado ? "Éxito" : "Error"));
}

private static void testModificarMascota(MascotaDAO mdao) {
    // Modificar una mascota existente
    Mascota mascotaModificada = new Mascota(12345, "12345678-9", 6, new java.util.Date(), "Max");
    boolean resultado = mdao.modificarMascota(mascotaModificada);
    System.out.println("Prueba modificar mascota: " + (resultado ? "Éxito" : "Error"));
}

private static void testEliminarDueno(DuenoDAO ddao) {
    // Eliminar un dueño
    boolean resultado = ddao.eliminarDueno("12345678-9");
    System.out.println("Prueba eliminar dueño: " + (resultado ? "Éxito" : "Error"));
}

private static void testEliminarMascota(MascotaDAO mdao) {
    // Eliminar una mascota
    boolean resultado = mdao.eliminarMascota(12345);
    System.out.println("Prueba eliminar mascota: " + (resultado ? "Éxito" : "Error"));
}

private static void testBuscarDueno(DuenoDAO ddao) {
    // Buscar un dueño por rut
    Dueno duenoBuscado = ddao.buscarDueno("12345678-9");
    System.out.println("Prueba buscar dueño: " + (duenoBuscado != null ? "Éxito" : "No encontrado"));
}

private static void testBuscarMascota(MascotaDAO mdao) {
    // Buscar una mascota por chip
    Mascota mascotaBuscada = mdao.buscarMascota(12345);
    System.out.println("Prueba buscar mascota: " + (mascotaBuscada != null ? "Éxito" : "No encontrada"));
}

private static void testListarDuenos(DuenoDAO ddao) {
    // Listar todos los dueños
    List<Dueno> listaDuenos = ddao.listarDuenos();
    System.out.println("Prueba listar dueños: " + (listaDuenos.isEmpty() ? "Sin dueños registrados" : "Éxito"));
}

private static void testListarMascotas(MascotaDAO mdao) {
    // Listar todas las mascotas
    List<Mascota> listaMascotas = mdao.listarMascota();
    System.out.println("Prueba listar mascotas: " + (listaMascotas.isEmpty() ? "Sin mascotas registradas" : "Éxito"));
}

}
