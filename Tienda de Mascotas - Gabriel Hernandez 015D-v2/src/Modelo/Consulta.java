/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author PAAPCA02LC0806
 */
public class Consulta {
    private String problema;
    private int cantidadDiasHospitalizado,total,descuento;
    private double valorConsulta;
    private boolean hospitalizacion;

    public Consulta() {
    }

    public Consulta(String problema, double valorConsulta, int cantidadDiasHospitalizado,
            int total, int descuento, boolean hospitalizacion) {
        setProblema(problema);
        setValorConsulta(valorConsulta);
        setCantidadDiasHospitalizado(cantidadDiasHospitalizado);
        setTotal(total);
        setDescuento(descuento);
        setHospitalizacion(hospitalizacion);
    }

    public String getProblema() {
        return problema;
    }


    public void setProblema(String problema) {
        this.problema = problema;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    public int getCantidadDiasHospitalizado() {
        return cantidadDiasHospitalizado;
    }

    public void setCantidadDiasHospitalizado(int cantidadDiasHospitalizado) {
        this.cantidadDiasHospitalizado = cantidadDiasHospitalizado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public boolean isHospitalizacion() {
        return hospitalizacion;
    }

    public void setHospitalizacion(boolean hospitalizacion) {
        this.hospitalizacion = hospitalizacion;
    }

    @Override
    public String toString() {
        return """
               Consulta:
               problema=""" + problema +
                "\nvalorConsulta=" + valorConsulta +
                "\ncantidadDiasHospitalizado=" + cantidadDiasHospitalizado +
                "\ntotal=" + total +
                "\ndescuento=" + descuento +
                "\nhospitalizacion=" + hospitalizacion + '}';
    }
    
    //metodoss

    
    /*
        Si la mascota tiene problema digestivo o respiratorio, quedará internado X cantidad de días.
        Cada día de hospitalización tiene un valor de $20.000 pesos, y como beneficio,
        se aplica un 30% de descuento al total final a pagar (ingresar los días por parametro). 
    */
    
    public void tipoProblema(int cantdias, Mascotas mascotas){
    if(getProblema().trim().equalsIgnoreCase("digestivo")||
       getProblema().trim().equalsIgnoreCase("respiratorio")){
        
        setCantidadDiasHospitalizado(cantdias);
        
        System.out.println("El paciente "+mascotas.getNombre()+
                " estara hospitalizado por "+getCantidadDiasHospitalizado()+" dias");
         
        int aux = 10000 + (20000*cantdias);
        
        double aux2= aux*0.3;
        System.out.println("el valor de la consulta mas dias hospitalizado es de: "+(aux-aux2)+
                " se le aplico un descuento del 30%");
        setTotal(aux);
        setValorConsulta(10000);
        
    }else{
        System.out.println("El paciente no estara hospitalizado, se le asigna medicamento cada 8 horas"
                + " el valor de la consulta es: "+10000);
        setHospitalizacion(false);
        setValorConsulta(10000);
        setTotal(10000);
    }
    }
    
        public void datosConsulta(Mascotas mascotas){
            String aux;
            if(isHospitalizacion()){
            aux= "si";
            }else{
            aux = "no";
            }
        System.out.println("******************");
        System.out.println("*DATOS DE MASCOTA*");
        System.out.println("******************");
        System.out.println("Nombre: "+mascotas.getNombre());
        System.out.println("Edad: "+mascotas.getEdad());
        System.out.println("Especie: "+mascotas.getEspecie());
        System.out.println("Peso: "+mascotas.getPeso());
        System.out.println("Altura: "+mascotas.getAltura());
        System.out.println("*******************");
        System.out.println("*DATOS DE CONSULTA*");
        System.out.println("*******************");
        System.out.println("Valor: "+getValorConsulta());
        System.out.println("Problema: "+getProblema());
        System.out.println("Queda Hospitalizado: "+aux);
        System.out.println("Dias Hospitalizado:"+getCantidadDiasHospitalizado());
        System.out.println("Total:"+getTotal());
        System.out.println("Descuento:"+getTotal()*0.3);
        System.out.println("Debe cancelar:"+(getTotal()-getTotal()*0.3));
            } 
}
