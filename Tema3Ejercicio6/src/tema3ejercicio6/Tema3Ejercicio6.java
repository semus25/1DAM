/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio6;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num; //Declaro variables
        Scanner entrada = new Scanner (System.in); //Creamos el Scanner listo para recoger datos
        
        System.out.println("Por favor, introduce tu nota"); //Pedimos al usuario la nota del alumno
        num=entrada.nextInt();
        
        if (num>=0 && num<=4){ //Presentamos la condicional que determinará la salida final a través de la consola
            System.out.println("Suspenso");
                    
        }   else if (num>=5 && num<=6){
            System.out.println("Bien");
            
        }   else if (num>=7 && num<=8){
            System.out.println("Notable");
            
        }   else if (num>=9 && num<=10){
            System.out.println("Sobresaliente");
        
        }   else {
            System.out.println("Error: Introduce un número entre 0 y 10");
        
        }
        
        
        
    }
    
}
