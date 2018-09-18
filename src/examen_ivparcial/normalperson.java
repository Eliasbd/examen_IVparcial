/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_ivparcial;

/**
 *
 * @author Hosanna
 */
public class normalperson extends personas{
    private String lenguajeshabla;
    private String comida;

    public normalperson( String nombre, String apellido, int edad, char sexo, String lugar, String situacion, String profesion, String lenguajeshabla, String comida) {
        super(nombre, apellido, edad, sexo, lugar, situacion, profesion);
        this.lenguajeshabla = lenguajeshabla;
        this.comida = comida;
    }

    public String getLenguajeshabla() {
        return lenguajeshabla;
    }

    public void setLenguajeshabla(String lenguajeshabla) {
        this.lenguajeshabla = lenguajeshabla;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
    
    @Override
     public void mostrarData(String nombreclase){
        super.mostrarData(nombreclase);
        System.out.println( lenguajeshabla  +  " " + comida );
    }
    
    
    
}
