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
public class personas {
    private String nombre;
    private String apellido;
    private int edad;
    private char sexo;
    private String lugar;
    private String situacion;
    private String profesion;

    public personas(String nombre, String apellido, int edad, char sexo, String lugar, String situacion, String profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.lugar = lugar;
        this.situacion = situacion;
        this.profesion = profesion;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    public void mostrarData(String nombreclase){
        System.out.println(nombre + " " + apellido + " " + edad + " " + sexo +  " "
        + lugar + " " + situacion + " " + profesion);
    }
    
    
    
    
}
