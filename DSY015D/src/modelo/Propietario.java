/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author PAAPCA02LC0800
 */
public class Propietario {
    private String nombre, apellido, direccion;
    private int edad;
    private Vehiculo vehiculo;

    public Propietario() {
    }
    
    /*
    nombre: no tiene que ser vacio, null y debe tener minimo 2 caracteres
    apellido: no tiene que ser vacio, null y debe tener minimo 2 caracteres
    direccion: no tiene que ser vacio, null y debe tener minimo 5 caracteres
    edad tiene que ser mayor a 18 años
    vehiculo: no puede ser vacio ni null 
    */
    public Propietario(String nombre, String apellido, String direccion, int edad, Vehiculo vehiculo) {
        setNombre(nombre);
        setApellido(apellido);
        setDireccion(direccion);
        setEdad(edad);
        setVehiculo(vehiculo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()|| nombre.trim().length() < 2){
            System.out.println("Error, nombre de propietario es null, vacio o tiene menos de 2 caracteres");
              
        }else{
           this.nombre = nombre;
        }

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido == null || apellido.isBlank() || apellido.trim().length() < 2){
            System.out.println("Error, el apellido esta vacio, es null, o menor a 2 caracteres");
        }else{
        this.apellido = apellido;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isBlank() || direccion.trim().length() < 5){
            System.out.println("Error, la direccion esta vacio, es null, o menor a 2 caracteres");
        }else{
        this.direccion = direccion;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18){
        this.edad = edad;
        }else{
            System.out.println("Menor de edad");
        }
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        if (vehiculo== null){
            System.out.println("Vehiculo no entregado");
        } else {
        this.vehiculo = vehiculo;
        }
    }

    @Override
    public String toString() {
        return """
               Propietario:
               nombre=""" + nombre + "\napellido=" + apellido + "\ndireccion=" + direccion + "\nedad=" + edad + "\nvehiculo=" + vehiculo + '\n';
    }
    
    // METODOS
    //def en python
    // Metodo que muestra la informacion del vehiculo
    public void mostrarDetalleVehiculo() {
        System.out.println(vehiculo.toString());
    }
    
    // Metodo que muestra el precio del vehiculo
    public void mostrarPrecioVehiculo() {
        System.out.println("El precio del vehiculo es $" + vehiculo.getPrecio() + ".");
    }
    
    // Metodo que estafa al cliente, sumandole 1m al precio real.
    public void estafar() {
        int aux = vehiculo.getPrecio() + 1000000;
        System.out.println("El precio real: $" + vehiculo.getPrecio());
        System.out.println("El precio estafa: $" + aux);
    }
    
    // SOBRECARGA
    // Metodo que estafa alcliente, sumandole un precio entregado.
    public void estafar(int precio) {
        int aux = vehiculo.getPrecio() + precio;
        System.out.println("El precio real: $" + vehiculo.getPrecio());
        System.out.println("El precio estafa: $" + aux);
    }
    
    // Metodo que modifica el precio del vehiculo
    public void cambiarPrecioVehiculo(int precio) {
        vehiculo.setPrecio(precio);
        System.out.println("Valor del vehiculo nuevo: $" + vehiculo.getPrecio());
    }
    
    
}
