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
public class ingeniero extends personas {
    private int nivelrazonamiento;
    private int grupos;
    private String tingeniero;
    private String especialidades;

    public ingeniero( String nombre, String apellido, int edad, char sexo, String lugar, String situacion, String profesion,int nivelrazonamiento, int grupos, String tingeniero, String especialidades) {
        super(nombre, apellido, edad, sexo, lugar, situacion, profesion);
        this.nivelrazonamiento = nivelrazonamiento;
        this.grupos = grupos;
        this.tingeniero = tingeniero;
        this.especialidades = especialidades;
    }

    public int getNivelrazonamiento() {
        return nivelrazonamiento;
    }

    public void setNivelrazonamiento(int nivelrazonamiento) {
        this.nivelrazonamiento = nivelrazonamiento;
    }

    public int getGrupos() {
        return grupos;
    }

    public void setGrupos(int grupos) {
        this.grupos = grupos;
    }

    public String getTingeniero() {
        return tingeniero;
    }

    public void setTingeniero(String tingeniero) {
        this.tingeniero = tingeniero;
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
        System.out.println( nivelrazonamiento  + " " + grupos + " " + tingeniero + " " + especialidades);
    }
    
    
    
    
    
}
