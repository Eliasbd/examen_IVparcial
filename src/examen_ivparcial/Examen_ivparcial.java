/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_ivparcial;

import java.util.Scanner;

/**
 *
 * @author Hosanna
 */
public class Examen_ivparcial {

    /**
     * @param args the command line arguments
     */
    Scanner tec = new Scanner(System.in);
    
    
    
    public Examen_ivparcial() {
       home(); 
    }
    
    public void home(){
        int opc;
        
        System.out.println("MENU PRINCIPAL");
        System.out.println();
        System.out.println("1. Ejercicio de Animales");
        System.out.println("2. Ejercicio de Personas");
        System.out.println("3. Salir");
        System.out.println();
        System.out.print("Elija su opcion = ");
        opc = tec.nextInt();
        System.out.println();
        while(opc == 0 || opc >3 ){
            System.out.println("Opcion INVALIDA");
            System.out.print("Elija su opcion = ");
            opc = tec.nextInt();
            System.out.println();
        }
        
        if(opc == 1){
            animales();
        }else if(opc == 2){
            personas();
        }else if(opc == 3){
            System.exit(0);
        }
    }
    
    public void animales(){
        
        perro perro = new perro("Scobby doo" , "Dogui" , 9 , "Gran Danes" );
        gato gato = new gato("Kira ", "Gati" , 3 , "Siames");
        caballo caballo = new caballo("Perseo ", "pasto" , 19 , "Semental");
        
        perro.mostrar(null );
        System.out.println("----------------------------------");
        gato.mostrar(null);
        System.out.println("----------------------------------");
        caballo.mostrar(null);
        System.out.println("----------------------------------");
        home();
        
    }
    
    public void personas(){
        
        ingeniero ingeniero = new ingeniero("Luca " , "Avellaneda" , 41 , 'm' , "SPS" , "Soltero" , "ingeniero" , 78 , 7,  "Civil" , "Puentes" );
        sistemas sistemas = new sistemas("Chris " , "Hawkis" , 30 , 'm' , "Columbus " , "Soltero" , "ingeniero" , 78 ,  "JAVA PYTHON COBOL" , "Androids Apps Development" );
        normalperson normalperson = new normalperson("Joanna " , "Palacios" , 21 , 'f' , "Seattle " , "Soltero" , "Estudiante" , "ingles & espaniol" ,  "baleadas");
        
        ingeniero.mostrarData(null);
        System.out.println("----------------------------------");
        sistemas.mostrarData(null);
        System.out.println("----------------------------------");
        normalperson.mostrarData(null);
        System.out.println("----------------------------------");
        home();
        
    }

    public static void main(String[] args) {
        Examen_ivparcial calle = new Examen_ivparcial();
    }
    
}
