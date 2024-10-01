/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import Modelo.Consulta;
import Modelo.Mascotas;
import Modelo.Vacunacion;

/**
 *
 * @author PAAPCA02LC0806
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mascotas mascota1 = new Mascotas("perro", 3,"canino", 10,20);
        Consulta consulta = new Consulta("respiratorio", 0, 0,
                0, 0, true);
        Vacunacion vacunacion = new Vacunacion(0, 0);
        
        
        consulta.tipoProblema(5,mascota1);
        vacunacion.registarIMC(mascota1);

        vacunacion.registrarDosis();
        consulta.datosConsulta(mascota1);
        
        vacunacion.datosVacunacion(mascota1);
    }
   //cambiamos errores:
    //consulta.tipoproblema, obtencion de nombre de mascota, (int cantdias) -> (int cantdias, Mascota mascota)
    //vacunacion.datosVacunacion, imc, la formula es en metros, ajustada para que reciva cm y los ajuste multpicando por 1000
}
