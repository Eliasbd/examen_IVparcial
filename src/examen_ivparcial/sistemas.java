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
public class sistemas  extends personas{
    private int nivelrazonamiento;
    private String lenguaje;
    private String especialidades;
    
    public sistemas( String nombre, String apellido, int edad, char sexo, String lugar, String situacion, String profesion, int nivelrazonamiento, String lenguaje, String especialidades) {
        super(nombre, apellido, edad, sexo, lugar, situacion, profesion);
        this.nivelrazonamiento = nivelrazonamiento;
        this.lenguaje = lenguaje;
        this.especialidades = especialidades;
    }

    public int getNivelrazonamiento() {
        return nivelrazonamiento;
    }

    public void setNivelrazonamiento(int nivelrazonamiento) {
        this.nivelrazonamiento = nivelrazonamiento;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }
    
    @Override
    public void mostrarData(String nombreclase){
        super.mostrarData(nombreclase);
        System.out.println(  nivelrazonamiento  +  " " + lenguaje + " " + especialidades);
    }
    
    
    
}
