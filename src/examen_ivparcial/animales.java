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
public class animales {
    private String nombre;
    private String comida;
    private int edad;
    private String raza;

    public animales(String nombre, String comida, int edad, String raza) {
        this.nombre = nombre;
        this.comida = comida;
        this.edad = edad;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void mostrar(String nombreclase){
        System.out.println("el animal es = "+ "  " + nombre  + " "+ comida + " " + edad  + " "+ raza );
    }
    
    
    
    
}
