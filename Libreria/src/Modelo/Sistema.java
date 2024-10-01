/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gabos
 */
public class Sistema {
     private String catalogoLibros,usuariosRegistrados;

    public Sistema() {
    }

    public Sistema(String catalogoLibros, String usuariosRegistrados) {
        setCatalogoLibros(catalogoLibros);
        setUsuariosRegistrados(usuariosRegistrados);
    }

    public String getCatalogoLibros() {
        return catalogoLibros;
    }

    public void setCatalogoLibros(String catalogoLibros) {
        this.catalogoLibros = catalogoLibros;
    }

    public String getUsuariosRegistrados() {
        return usuariosRegistrados;
    }

    public void setUsuariosRegistrados(String usuariosRegistrados) {
        this.usuariosRegistrados = usuariosRegistrados;
    }

    @Override
    public String toString() {
        return """
               Sistema:
               catalogoLibros=""" + catalogoLibros + "\nusuariosRegistrados=" + usuariosRegistrados + '\n';
    }
     
//     Acciones potenciales podrían ser registrar un nuevo libro en el catálogo o
//             añadir un nuevo usuario al sistema.
    
//     Funciones como verificar la disponibilidad de un libro o generar un informe
//             sobre el estado actual de la biblioteca se consideran útiles.
    
    public void registarLibro(Libro libro){
        String aux = getCatalogoLibros()+" "+libro.getTitulo();
        setCatalogoLibros(aux);
        System.out.println("El libro registrado en el catalogo es: "+libro.getTitulo() );
    }
    
    public void registrarUsuario(Usuario usuario){
            String aux = getUsuariosRegistrados()+" "+usuario.getNombre();
        setUsuariosRegistrados(aux);
        System.out.println("El usuario registrado en el catalogo es: "+usuario.getNombre() );  
    }
    
    public void verificarDisponibilidad(Libro libro){
    if(libro.getDisponibilidad()<= 0){
        System.out.println("No quedan copias disponibles del libro");
    }else{
        System.out.println("quedan "+libro.getDisponibilidad()+" copias del libro");}
    }
   
    public void InformeDetallado(){
        System.out.println("*******************");
        System.out.println("*Informe Detallado*");
        System.out.println("*******************");
        System.out.println("Usuarios: \n"+getUsuariosRegistrados());
        System.out.println("Libros: \n"+getCatalogoLibros());
        System.out.println("*******************");
    }
}
