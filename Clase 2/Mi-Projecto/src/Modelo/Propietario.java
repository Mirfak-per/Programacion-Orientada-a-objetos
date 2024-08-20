/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0806
 */
public class Propietario {
    private String nombre,apellido,direccion;
    private int rut,edad;
    private Vehiculo vehiculo;

    public Propietario() {
    }

    public Propietario(String nombre, String apellido, String direccion, int rut, int edad, Vehiculo vehiculo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.rut = rut;
        this.edad = edad;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return """
               Propietario
               nombre=""" + nombre + "\napellido=" + apellido + "\ndireccion=" + direccion + "\nrut=" + rut + "\nedad=" + edad + "\nvehiculo=" + vehiculo + '\n';
    }
    
    //METODOS   
    //metodo que muestra la informacion del vehiculo.
    public void mostrardetallevehiculo(){
        System.out.println(vehiculo.toString());
}
    
    //metodo que muestra la informacion del vehiculo.
        public void mostrarPrecioVehiculo(){
        System.out.println("El precio del vehiculo es de: "+vehiculo.getPrecio()+".");
}
    //metodo que estafa al cliente sumandole 1m al precio real.
    public void estafar(){
        int aux = vehiculo.getPrecio() + 1000;
        System.out.println("El precio real"+vehiculo.getPrecio());
        System.out.println("El precio de la estafa.:$ "+aux);
    }
        
    //metodo que estafa al cliente sumandole un precio entregado.
    public void estafar(int valor){
        int aux = vehiculo.getPrecio()+valor;
        System.out.println("El precio real"+vehiculo.getPrecio());
        System.out.println("El precio de la estafa.:$ "+aux);
    }

    public void setprecio(int precio2){
    vehiculo.setPrecio(precio2);
    System.out.println("El nuevo valor del vehiculo es de: " + vehiculo.getPrecio());
    }
    
}
