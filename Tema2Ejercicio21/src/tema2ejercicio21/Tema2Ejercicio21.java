/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio21;

import java.util.Scanner; //Importamos Scanner

/**
 *
 * @author alumno
 */
public class Tema2Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tiempo; //Declaro variable para que almacene el usuario
        int horas, minutos, segundos; //Declaro variables para mostrar al usuario
        
        Scanner entrada = new Scanner (System.in); //Creo un nuevo Scanner
        
        System.out.println("Introduce los segundos a convertir: "); //Hago que el usuario me facilite un número
        
        tiempo=entrada.nextInt(); //Le doy el valor de lo último agregado vía terminal
        horas=tiempo/3600; //Hago las operaciones correspondientes
        minutos=(tiempo%3600)/60;
        segundos=tiempo%60;
        
        System.out.println(tiempo+" segundos son en total "+horas+" horas, "+minutos+" minutos y "+segundos+" segundos");
        
    }
    
}
