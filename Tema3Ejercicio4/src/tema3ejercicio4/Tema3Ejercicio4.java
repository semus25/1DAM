/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio4;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Tema3Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3; //Declaramos variables
        Scanner entrada = new Scanner (System.in); //Creo un nuevo Scanner
        
        System.out.println("Por favor introduzca un número"); //Pido un dato al usuario
        num1=entrada.nextInt();
        
        System.out.println("Por favor introduzca otro número"); //Pido un dato al usuario
        num2=entrada.nextInt();
        
        System.out.println("Por favor introduzca otro número más"); //Pido un dato al usuario
        num3=entrada.nextInt();
        
        
        if (num1< num2 && num1 < num3){ //Presentamos la condicional que determinará la salida final a través de la consola
            System.out.println("El menor es "+num1);
                    
        }   else if (num2< num1 && num2 < num3){
            System.out.println("El menor es "+num2);
        
         }   else {
            System.out.println("El menor es "+num3);
        
        }
    }
    
}
