/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio15;

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo;
        int horas, minutos, segundos; //Declaro la variable original y las que lo expresan diferente
        
        tiempo=10000; //Le doy valor a tiempo
        
        horas=tiempo/3600;
        minutos=(tiempo%3600)/60;
        segundos=tiempo%60;
        
        
        System.out.println(tiempo+" segundos hacen un total de "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos");
                
    }
    
}
